package com.jdk8.merlin.streams;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    private enum Status {
        OPEN, CLOSED
    }

    private static final class Task {
        private Status status;
        private Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public Integer getPoints() {
            return points;
        }

        @Override
        public String toString() {
            return "Task [status=" + status + ", points=" + points + "]";
        }
    }


    public static void main(String[] args) throws IOException {


        //eg:1
        //Task类有一个分数（或伪复杂度）的概念，另外还有两种状态：OPEN或者CLOSED。现在假设有一个task
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );


        //首先看一个问题：在这个task集合中一共有多少个OPEN状态的点？在Java 8之前，
        //要解决这个问题，则需要使用foreach循环遍历task集合；但是在Java 8中可以利用steams解决：包括一系列元素的列表，并且支持顺序和并行处理。
        final long totalPointsOfOpenTasks = tasks
                .stream()
                .filter(task -> task.getStatus() == Status.OPEN)
                .mapToInt(Task::getPoints)
                .sum();
        /**
         * 这里有很多知识点值得说。首先，tasks集合被转换成stream表示；其次，在stream上的filter操作会过滤掉所有CLOSED的task；
         * 第三，mapToInt操作基于每个task实例的Task::getPoints方法将task流转换成Integer集合；
         * 最后，通过sum方法计算总和，得出最后的结果。
         */
        System.out.println("Total points==>" + totalPointsOfOpenTasks);


        //eg:2 用下面的代码计算所有任务的点数之和：
        final double totalPoints = tasks
                .stream()
                .parallel()
                // or map( Task::getPoints )
                .map(task -> task.getPoints())
                .reduce(0, Integer::sum);
        //这里我们使用parallel方法并行处理所有的task，并使用reduce方法计算最终的结果。控制台输出如下
        System.out.println("Total points (all tasks): " + totalPoints);


        //eg:3 对于一个集合，经常需要根据某些条件对其中的元素分组。利用steam提供的API可以很快完成这类任务，代码如下：
        final Map<Status, List<Task>> map = tasks
                .stream()
                //or task -> task.getStatus()
                .collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(map);


        //eg:4 最后一个关于tasks集合的例子问题是：如何计算集合中每个任务的点数在集合中所占的比重，具体处理的代码如下：
        final Collection<String> result = tasks
                .stream()                         // Stream< String >
                .mapToInt(Task::getPoints)     // IntStream
                .asLongStream()                     // LongStream
                .mapToDouble(points -> points / totalPoints)// DoubleStream
                .boxed()                         // Stream< Double >
                .mapToLong(weigth -> (long) (weigth * 100))    //LongStream
                .mapToObj(percentage -> percentage + "%")    // Stream< String>
                .collect(Collectors.toList());                // List< String >
        System.out.println(result);


        //eg:5 正如之前所说，Steam API不仅可以作用于Java集合，传统的IO操作（从文件或者网络一行一行得读取数据）可以受益于steam处理，这里有一个小例子：
        final Path path = new File("E:/Works/002MyTestWork/500-java8-learning/resources/error.txt").toPath();
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            /**
             * Stream的方法onClose 返回一个等价的有额外句柄的Stream，当Stream的close（）方法被调用的时候这个句柄会被执行。
             * Stream API、Lambda表达式还有接口默认方法和静态方法支持的方法引用，是Java 8对软件开发的现代范式的响应。
             */
            lines.onClose(() -> System.out.println("Done!")).forEach(System.out::println);
        }
    }
}
