package com.richard.singletontest;

/**
 * @author: Richard
 * @date: 2019/7/19
 * @describe: 单例模式_枚举
 */

public class MySingletonTest_5 {

    private MySingletonTest_5() {};


    public static MySingletonTest_5 getInstance() {

        return SinglrtonEnum.INSTANCE.getMySingletonTest_5();
    }

    private enum SinglrtonEnum {

        //
        INSTANCE;

        MySingletonTest_5 mySingletonTest_5 = null;


        SinglrtonEnum() {
            mySingletonTest_5 = new MySingletonTest_5();
        }


        public MySingletonTest_5 getMySingletonTest_5() {
            return mySingletonTest_5;
        }
    }


}


