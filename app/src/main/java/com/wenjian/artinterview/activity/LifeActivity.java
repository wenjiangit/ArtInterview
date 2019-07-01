package com.wenjian.artinterview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

import com.wenjian.artinterview.R;
import com.wenjian.artinterview.utils.ActivityUtils;


/**
 * 一个简单的activity，用于观察activity在各种情况下的生命周期函数调用
 *
 * Activity的生命周期
 * 1.正常启动：onCreate->onStart->onResume
 * 2.正常退出（点击back键）：onPause->onStop->onDestroy
 * 3.点击home键：onPause->onStop
 * 4.从第3步再回到应用：onRestart—>onStart->onResume
 *
 * 开启另一个activity
 * LifeActivity： onPause ==============================> onStop
 * SecondActivity:         onCreate->onStart->onResume
 * 被启动的activity:onCreate需要在启动activity:onPause被调用后
 * 因此onPause方法中不宜做耗时操作
 *
 * Activity的状态保存与恢复
 * 保存状态：onSaveInstanceState
 * 调用时机：打开另一个Activity，点击home键，配置改变（如切换横竖屏），一般在onStop之后
 *
 * 恢复状态：onRestoreInstanceState
 * 调用时机：在配置改变时触发（横竖屏切换），系统主动回收该Activity(不好验证)，在onStart之后调用
 *
 * 原理：将状态保存委托给window，window再委托给根view，由根view进行迭代调用view的onSaveInstanceState，
 * state最终保存在ActivityThread：activities->ActivityClientRecord->state中
 *
 * 注意：如果view没有id，则无法保存状态，因为存储的数据结构是一个SpareArray，key是view的id，value为Parcelable，
 * 因此如果需要保存状态请给view设置id
 *
 * 源码如下
 * {@link View#dispatchSaveInstanceState(SparseArray)}
 *
 */
public class LifeActivity extends AppCompatActivity {

    private static final String TAG = "LifeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        Log.d(TAG, "onCreate: ");

        new TestComponent(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }
  

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    public void onBtnClick(View view) {
        ActivityUtils.startActivity(this,SecondActivity.class);
    }
}
