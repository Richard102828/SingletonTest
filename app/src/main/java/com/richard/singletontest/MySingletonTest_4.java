package com.richard.singletontest;

/**
 * @author: Richard
 * @date: 2019/7/19
 * @describe: 单例模式_静态内部类
 */
public class MySingletonTest_4 {

    private MySingletonTest_4() {
    }

    private static class MySinleton {
        private static MySingletonTest_4 mySingletonTest_4 = new MySingletonTest_4();
    }

    public static MySingletonTest_4 getInstance() {
        return MySinleton.mySingletonTest_4;
    }
}
