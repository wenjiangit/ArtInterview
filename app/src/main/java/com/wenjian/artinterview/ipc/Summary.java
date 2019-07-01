package com.wenjian.artinterview.ipc;

/**
 * Description Summary
 *
 * IPC：跨进程通信
 * 线程：是CPU调度的最小单元，是一种有限的系统资源
 * 进程：是一个执行单元，一般指一个应用或程序，拥有独立的内存空间
 *
 * 应用开启多线程
 *
 * 如何开启？
 *
 * 官方：四大组件都可以在AndroidManifest文件中配置android:process属性来开启多进程
 * 黑科技：通过JNI在native层去fork一个新的进程
 *
 * 优缺点
 *
 * 优点：增加内存使用权限（每个进程对内存的使用是有限制的）。
 * 缺点：增加了编程的复杂程度,需要进程同步
 *
 *
 *
 * <p>
 * Date 2019-07-01
 *
 * @author wenjianes@163.com
 */
public class Summary {
}
