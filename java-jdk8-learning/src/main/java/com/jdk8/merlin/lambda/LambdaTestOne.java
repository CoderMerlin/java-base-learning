package com.jdk8.merlin.lambda;

import java.util.Arrays;

/**
 * Lambda表达式学习
 * @author Merlin
 *
 */
public class LambdaTestOne {

	/**
	 * Lambda表达式（也称为闭包）是整个Java 8发行版中最受期待的在Java语言层面上的改变，
	 * Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中），
	 * 或者把代码看成数据：函数式程序员对这一概念非常熟悉。在JVM平台上的很多语言（Groovy，Scala，……）
	 * 从一开始就有Lambda，但是Java程序员不得不使用毫无新意的匿名类来代替lambda。
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 最简单的形式中，一个lambda可以由用逗号分隔的参数列表、–>符号与函数体三部分表示。
		 * 例如:
		 */
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		//请注意参数e的类型是由编译器推测出来的。同时，你也可以通过把参数类型与参数包括在括号中的形式直接给出参数的类型：
		Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );

		/**
		 * 在某些情况下lambda的函数体会更加复杂，这时可以把函数体放到在一对花括号中，就像在Java中定义普通函数一样。例如：
		 */
		Arrays.asList( "a", "b", "d" ).forEach( e -> {
		    System.out.print( e );
		    System.out.print( e );
		} );
		
		/**
		 * Lambda可以引用类的成员变量与局部变量（如果这些变量不是final的话，它们会被隐含的转为final，这样效率更高）。
		 * 例如，下面两个代码片段是等价的：
		 */
		String separator = ",";
		Arrays.asList( "a", "b", "d" ).forEach( 
		    ( String e ) -> System.out.print( e + separator ) );
		//与
		/*final String separator = ",";
		Arrays.asList( "a", "b", "d" ).forEach( 
		    ( String e ) -> System.out.print( e + separator ) );*/
		/**
		 * Lambda可能会返回一个值。返回值的类型也是由编译器推测出来的。如果lambda的函数体只有一行的话，
		 * 那么没有必要显式使用return语句。下面两个代码片段是等价的：
		 */
		Arrays.asList( "1", "2", "3" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		//与
		
		Arrays.asList( "1", "2", "3" ).sort( ( e1, e2 ) -> {
		    int result = e1.compareTo( e2 );
		    return result;
		} );
	}
}
