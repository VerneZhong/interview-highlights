package org.zxb.java.concurrency.framework.synchronizedkeyword.object;

/**
 * class
 *
 * @author Mr.zxb
 * @date 2020-01-06 10:26
 */
public class ObjectLockDemo {

    public static final Object MUTEX = new Object();

    private static int i = 1;

    public void nonThreadSafe() {
        System.out.println(i);
        i++;
    }

    /**
     * 等价于 {@link #threadSafeThis}，lock监视器是当前对象，如果不是同一个对象，则会非线程安全
     */
    public synchronized void threadSafe() {
        nonThreadSafe();
    }

    public void threadSafeThis() {
        synchronized (this) {
            nonThreadSafe();
        }
    }

    /**
     * Object对象锁，所有的线程必须持有同一个Object，建议使用
     */
    public void threadSafeMutux() {
        synchronized (MUTEX) {
            nonThreadSafe();
        }
    }

    /**
     * Class对象锁
     */
    public void threadSafeClass() {
        synchronized (ObjectLockDemo.class) {
            nonThreadSafe();
        }
    }
}
