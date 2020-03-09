package javaConcepts.advanced.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {

        try {
            CountDownLatch countDownLatch = new CountDownLatch(5);

            System.out.println("Task Started");

            new Thread(new MyThread(countDownLatch, "A")).start();
            new Thread(new MyThread(countDownLatch, "B")).start();
            new Thread(new MyThread(countDownLatch, "C")).start();
            new Thread(new MyThread(countDownLatch, "D")).start();
            new Thread(new MyThread(countDownLatch, "E")).start();

            countDownLatch.await();

            System.out.println("Task Ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread implements Runnable {

    private CountDownLatch latch;
    private String name;

    public MyThread(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + " started.");
            Thread.sleep(100);
            System.out.println("Thread " + name + " ended.");
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
