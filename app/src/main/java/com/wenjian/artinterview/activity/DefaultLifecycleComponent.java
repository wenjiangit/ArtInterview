package com.wenjian.artinterview.activity;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.SupportActivity;

/**
 * Description DefaultLifecycleComponent
 *
 * 可以通过生命周期感知组件来分离一些和生命周期强相关的业务，实现复用
 *
 * <p>
 * Date 2019-07-01
 *
 * @author wenjianes@163.com
 */
public class DefaultLifecycleComponent implements LifecycleComponent {


    private LifecycleOwner mLifecycleOwner;

    public DefaultLifecycleComponent(@NonNull LifecycleOwner owner) {
        this.mLifecycleOwner = owner;
        owner.getLifecycle().addObserver(this);
    }


    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    /**
     * 获取Context
     *
     * @return
     */
    protected Context getContext() {
        if (mLifecycleOwner instanceof SupportActivity) {
            return (SupportActivity) mLifecycleOwner;
        } else if (mLifecycleOwner instanceof Fragment) {
            return ((Fragment) mLifecycleOwner).getContext();
        } else {
            throw new IllegalArgumentException("Unsupported LifecycleOwner...");
        }
    }

}
