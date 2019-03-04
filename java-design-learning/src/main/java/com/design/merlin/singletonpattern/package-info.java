/**
 * @Title: package-info
 * @ProjectName java-base-learning
 * @Description: 主要介绍单例模式
 * 定义：保证一个雷仅有一个实例，并提供一个全局访问点
 * 类型：创建型
 * 适用场景：想确保在任何情况下都绝对只有一个实例
 * 优点：1.在内存里只有一个实例，减少了内存开销
 *      2.可以避免对资源的多重占用
 *      3.设置全局访问点，严格控制访问
 * 缺点：没有接口，扩展困难
 *
 * 重点：私有构造器
 *      线程安全
 *      延迟加载
 *      序列化和反序列化安全
 *      反射
 *
 * 与单例相关的设计模式：
 * 单例和工厂模式
 * 单例和享元模式
 * @author Merlin
 * @date 2019/3/417:19
 */
package com.design.merlin.singletonpattern;