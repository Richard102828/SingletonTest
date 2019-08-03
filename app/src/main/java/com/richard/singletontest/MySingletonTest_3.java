package com.richard.singletontest;

/**
 * @author: Richard
 * @date: 2019/7/19
 * @describe: 单例模式_双重效验锁
 */
public class MySingletonTest_3 {


    private static volatile MySingletonTest_3 instance_3 = null;


    private MySingletonTest_3() {
    }


    public static MySingletonTest_3 getInstance() {


        if (instance_3 == null) {

            synchronized (MySingletonTest_3.class) {

                if (instance_3 == null) {
                    instance_3 = new MySingletonTest_3();
                }
            }
        }
        return instance_3;
    }
}
