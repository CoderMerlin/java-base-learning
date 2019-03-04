package com.design.merlin.factorypattern.simplefactory;

/**
 * @author merlin
 * @Title: ReflexVideoFactory
 * @ProjectName java-design-pattern
 * @Description: 通过反射来优化简单工厂模式
 * @date 2019/3/321:50
 */
public class ReflexVideoFactory {

    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
