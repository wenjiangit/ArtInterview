# IPC机制

IPC：跨进程通信/进程间通信

进程：是CPU调度的最小单元，是一种有限的系统资源

线程：是一个执行单元，一般指一个应用或程序，拥有独立的内存空间

### Android应用如何开启多进程？

- 官方：四大组件都可以在AndroidManifest文件中配置android:process属性来开启多进程

```
         <activity
            android:name=".ipc.GlobalActivity"
            android:process="com.wenjian.artinterview.global" />
            
        <activity
            android:name=".ipc.RemoteActivity"
            android:process=":remote" />
```

以上展示开启多进程的方式，
其中带"："号的代表是当前进程的私有进程，不可以与其他应用的组件跑在同一个进程中
不带"："号代表全局独立进程，可以通过ShareUID的方式与其他应用跑在同一个进程中


- 黑科技：通过JNI在native层去fork一个新的进程




