package com.mayikt.ext.proxy.impl;

import com.mayikt.ext.proxy.MyExtJdkInvocationHandler;
import com.mayikt.service.OrderService;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: $Proxy0
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/1821:00
 */
public class $Proxy0 implements OrderService {
    private MyExtJdkInvocationHandler h;

    public $Proxy0(MyExtJdkInvocationHandler h) {
        this.h = h;
    }

    public void order() throws Throwable {
        // 如何获取真实目标方法呢
        Method orderMethod = OrderService.class.getMethod("order", new Class[]{});
        this.h.invoke(this, orderMethod, null);
    }
}
