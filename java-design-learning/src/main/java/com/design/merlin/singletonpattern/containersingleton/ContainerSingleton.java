package com.design.merlin.singletonpattern.containersingleton;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * @author Merlin
 * @Title: ContainerSingleton
 * @ProjectName java-base-learning
 * @Description: 容器单例模式
 * @date 2019/3/515:20
 */
public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new HashedMap();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }
    public static Object getInstance(String key){
        return singletonMap.get(key);
    }

    private ContainerSingleton(){

    }
}
