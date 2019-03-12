/**
 * @Title: package-info
 * @ProjectName java-base-learning
 * @Description: 代理模式
 * 定义：
 * 1.为其他对象提供一个代理，以控制对这个对象的访问
 * 2.代理对象在客户端与目标对象之间起到了一个中介作用
 * 适用场景：
 * 1.保护目标对象
 * 2.增强目标对象
 * 优点：
 * 1.代理模式能够将代理对象与真实被调用的目标对象分离
 * 2.一定程度上降低了系统的耦合度，扩展性好
 * 3.保护目标对象
 * 缺点：
 * 1.代理模式会造成系统设计中类目的增加
 * 2.在客户端与目标对象之间创建一个代理对象，会造成请求处理速度变慢
 * 3.增加系统复杂度
 *
 * 静态代理就是在代码中显示指定的代理;
 * 动态代理无法代理类，但是可以代理接口;
 * 在使用CGLib代理的时候，因为要用到继承，还有重写，所以对final的这个关键字的时候一定要格外的注意：
 *
 * Spring代理扩展：
 * 当bean有实现接口时，Spring就会使用JDK的动态代理
 * 当bean没有实现接口时，Spring使用CGLib
 * 可以强制使用CGilb
 * 在Spring配置中增加<aop:aspectj-autoproxy proxy-target-class="true"/>
 *
 * 代理速度对比：
 * CGlib
 * JDK动态代理
 *
 * 模式相关：
 * 代理模式与装饰模式
 * 代理模式与适配器模式
 * @author Merlin
 * @date 2019/3/1215:30
 */
package com.design.merlin.proxypattern;