package com.mayikt;

import com.mayikt.ext.proxy.JavaClassLoader;
import com.mayikt.ext.proxy.impl.$Proxy0;
import com.mayikt.ext.proxy.impl.MyJdkInvocationHandler;
import com.mayikt.service.OrderService;
import com.mayikt.service.impl.OrderServiceImpl;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: Test001
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/1821:06
 */
public class Test001 {
    public static void main(String[] args) throws Throwable {
//        OrderService  orderService = new $Proxy0(new MyJdkInvocationHandler(new OrderServiceImpl()));
//        orderService.order();
        OrderService orderService = (OrderService) MyProxy.newProxyInstance(new JavaClassLoader(), OrderService.class, new MyJdkInvocationHandler(new OrderServiceImpl()));
        orderService.order();
    }
}
