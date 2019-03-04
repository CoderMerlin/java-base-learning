package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: VideoFactory
 * @ProjectName java-base-learning
 * @Description: 相较于简单工厂，将之前的普通类改为抽象类，只保留抽象方法
 * 理解：
 * Java视频和Pytho视频都是同一个产品等级，都是视频。这里要理解一个概念：相同类型的一个产品，我们称之为产品等级，
 * 他们的等级都是在视频的这个等级上;产品等级和产品族是区分工厂方法和抽象方法的重要概念;
 * @date 2019/3/414:32
 */
public abstract class VideoFactory {

    public abstract Video getVideo();
}
