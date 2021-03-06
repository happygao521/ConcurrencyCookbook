package com.diguage.books.concurrencycookbook.chapter2.recipe6;

/**
 * 修改锁的抢占机制：公平锁示例，任务
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 2013-09-13
 * Time: 下午2:25
 */
public class Job implements Runnable {
    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s: Going to print a document\n",
                Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("%s: The document has been printed\n",
                Thread.currentThread().getName());
    }
}
