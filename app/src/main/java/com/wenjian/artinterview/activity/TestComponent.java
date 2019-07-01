package com.wenjian.artinterview.activity;

import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Description TestComponent
 * <p>
 * Date 2019-07-01
 *
 * @author wenjianes@163.com
 */
public class TestComponent extends DefaultLifecycleComponent {

    private static final String TAG = "TestComponent";

    public TestComponent(@NonNull LifecycleOwner owner) {
        super(owner);
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate: ");
    }

    @Override
    public void onStart() {
        Log.i(TAG, "onStart: ");
    }

    @Override
    public void onResume() {
        Log.i(TAG, "onResume: ");
    }

    @Override
    public void onPause() {
        Log.i(TAG, "onPause: ");
    }

    @Override
    public void onStop() {
        Log.i(TAG, "onStop: ");
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy: ");
    }
}
