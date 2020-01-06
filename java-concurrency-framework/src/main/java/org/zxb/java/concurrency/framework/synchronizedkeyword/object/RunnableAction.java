package org.zxb.java.concurrency.framework.synchronizedkeyword.object;

/**
 * class
 *
 * @author Mr.zxb
 * @date 2020-01-06 10:27
 */
public class RunnableAction implements Runnable {

    private ObjectLockDemo objectLockDemo;

    public RunnableAction(ObjectLockDemo objectLockDemo) {
        this.objectLockDemo = objectLockDemo;
    }

    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 非线程安全的
//        objectLockDemo.nonThreadSafe();

        // 线程安全的 synchronized 标注方法上
//        objectLockDemo.threadSafe();

//        objectLockDemo.threadSafeThis();

        // 线程安全的Object对象锁，唯一的对象Object来保证线程安全
//        objectLockDemo.threadSafeMutux();

        // 线程安全的class对象锁
        objectLockDemo.threadSafeClass();
    }
}
