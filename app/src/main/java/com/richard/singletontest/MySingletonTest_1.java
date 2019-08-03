package com.richard.singletontest;

/**
 * @author: Richard
 * @date: 2019/7/18
 * @describe: 单例类_饿汉式，在类加载时就创建了实例；
 */
public class MySingletonTest_1 {


    private static MySingletonTest_1 instance_1 = new MySingletonTest_1();


    private MySingletonTest_1() {
    }

    public static MySingletonTest_1 getInstance() {
        return instance_1;
    }
}
