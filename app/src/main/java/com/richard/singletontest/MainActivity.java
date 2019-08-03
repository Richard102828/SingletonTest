package com.richard.singletontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

/**
 * @author Richard
 * @time 2019/7/18 23:50
 * @param
 * @description 单利模式（Singleton）测试
 */
public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //饿汉模式测试
        MySingletonTest_1 mySingletonTest_1 = MySingletonTest_1.getInstance();
        MySingletonTest_1 mySingletonTest_11 = MySingletonTest_1.getInstance();
        boolean isSame1 = (mySingletonTest_1 == mySingletonTest_11);
        Log.d(TAG + " 1", String.valueOf(isSame1));

        //懒汉模式测试
        MySingletonTest_2 mySingletonTest_2 = MySingletonTest_2.getInstance();
        MySingletonTest_2 mySingletonTest_21 = MySingletonTest_2.getInstance();
        boolean isSame2 = (mySingletonTest_2 == mySingletonTest_21);
        Log.d(TAG + " 2", String.valueOf(isSame2));

        //双重效验锁
        MySingletonTest_3 mySingletonTest_3 = MySingletonTest_3.getInstance();
        MySingletonTest_3 mySingletonTest_31 = MySingletonTest_3.getInstance();
        boolean isSame3 = (mySingletonTest_3 == mySingletonTest_31);
        Log.d(TAG + " 3", String.valueOf(isSame3));

        //静态内部类
        MySingletonTest_4 mySingletonTest_4 = MySingletonTest_4.getInstance();
        MySingletonTest_4 mySingletonTest_41 = MySingletonTest_4.getInstance();
        boolean isSame4 = (mySingletonTest_4 == mySingletonTest_41);
        Log.d(TAG + " 4", String.valueOf(isSame4));

        //枚举
        MySingletonTest_5 mySingletonTest_5 = MySingletonTest_5.getInstance();
        MySingletonTest_5 mySingletonTest_51 = MySingletonTest_5.getInstance();
        boolean isSame5 = (mySingletonTest_5 == mySingletonTest_51);
        Log.d(TAG + " 5", String.valueOf(isSame5));
    }
}
