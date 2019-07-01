package com.wenjian.artinterview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.wenjian.artinterview.R;

/**
 * Activity启动模式
 * <p>
 * 1.Standard,标准模式，每次启动一个新的activity
 * 2.SingleTop,栈顶复用，如果栈顶存在该activity的实例则重用，并调用该activity的onNewIntent
 * 3.SingleTask,栈内复用，如果栈内存在该activity的实例则重用，并移除位于该activity顶部的实例，调用该activity的onNewIntent
 * 4.SingleInstance,单实例模式，单独占用一个栈，只要栈还存在，该activity会一直得到复用
 * <p>
 * <p>
 * TaskAffinity，任务相关性，可以用于指定activity属于哪个栈
 * 默认情况下，系统创建的任务栈名即为应用的包名
 *
 * SingleTask情况下的生命周期（启动同一个页面）  onPause->onNewIntent->onResume
 *
 * adb shell dumpsys activity   输出activity堆栈信息
 *
 */
public class LaunchModeActivity extends AppCompatActivity {

    private static final String TAG = "LaunchModeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }
    
    

    public void onBtnClick(View view) {

        Intent intent = new Intent(this,LaunchModeActivity.class);
        //当由applicationContext启动activity需要添加该标记
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //清除位于该activity实例顶部的实例
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //与指定launchMode为singleTop一致
//        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        //设置后不会出现在最近使用的列表中
//        intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

        startActivity(intent);

    }
}
