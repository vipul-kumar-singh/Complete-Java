package javaConcepts.advanced.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

        System.out.println("Task Started");

        new Thread(new MyThread1(cyclicBarrier,"A")).start();
        new Thread(new MyThread1(cyclicBarrier,"B")).start();
        new Thread(new MyThread1(cyclicBarrier,"C")).start();
        new Thread(new MyThread1(cyclicBarrier,"D")).start();
        new Thread(new MyThread1(cyclicBarrier,"E")).start();

//        cyclicBarrier.await(); Add it here to make it act like countDownLatch
        System.out.println("Task Ended");
    }
}

class MyThread1 implements Runnable {

    private CyclicBarrier barrier;
    private String name;

    public MyThread1(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + " started.");
            Thread.sleep(100);
            System.out.println("Thread " + name + " ended.");
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}