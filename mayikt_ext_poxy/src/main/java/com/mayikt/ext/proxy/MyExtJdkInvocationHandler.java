package com.mayikt.ext.proxy;

import java.lang.reflect.Method;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: MyExtInvocationHandler
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/1820:54
 */
public interface MyExtJdkInvocationHandler {
    /**
     * @param proxy  代理类
     * @param method 目标方法
     * @param args   参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
