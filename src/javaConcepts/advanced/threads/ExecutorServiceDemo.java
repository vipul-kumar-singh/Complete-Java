package javaConcepts.advanced.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new ThreadDemo("A"));
        executorService.execute(new ThreadDemo("B"));
        executorService.execute(new ThreadDemo("C"));
        executorService.execute(new ThreadDemo("D"));

        executorService.shutdown();
    }
}

class ThreadDemo implements Runnable{
    String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + " started");
            Thread.sleep(1000);
            System.out.println("Thread " + name + " ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
