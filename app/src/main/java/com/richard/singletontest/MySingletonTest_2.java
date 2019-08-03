package com.richard.singletontest;

/**
 * @author: Richard
 * @date: 2019/7/19
 * @describe: 单例模式_懒汉式
 */
public class MySingletonTest_2 {


    private static MySingletonTest_2 instance_2 = null;


    private MySingletonTest_2() {
    }


    public static synchronized MySingletonTest_2 getInstance() {


        if (instance_2 == null) {
            instance_2 = new MySingletonTest_2();
        }
        return instance_2;
    }

}
