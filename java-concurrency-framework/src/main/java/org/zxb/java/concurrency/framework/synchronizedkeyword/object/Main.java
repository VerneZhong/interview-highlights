package org.zxb.java.concurrency.framework.synchronizedkeyword.object;

/**
 * class
 *
 * @author Mr.zxb
 * @date 2020-01-06 10:40
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            ObjectLockDemo objectLockDemo = new ObjectLockDemo();
            RunnableAction runnableAction = new RunnableAction(objectLockDemo);
            Thread thread = new Thread(runnableAction);

            thread.start();
        }
    }
}
