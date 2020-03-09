package javaConcepts.advanced.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new Thread(new IncThread("A", sem)).start();
        new Thread(new DecThread("B", sem)).start();
    }
}

class Shared {
    private static int count = 0;

    public static void getIncrementedCount(String threadName){
        count++;
        System.out.println(threadName + ": " + count);
    }

    public static void getDecrementedCount(String threadName){
        count--;
        System.out.println(threadName + ": " + count);
    }
}

class IncThread implements Runnable {

    String name;
    Semaphore sem;

    public IncThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {
            //First. get a permit
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + " gets a permit.");

            // Now access shared resource
            for (int i = 0; i < 5; i++) {
                Shared.getIncrementedCount(name);

                //Now, allow a context switch
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Release the permit
        System.out.println(name + " releases the permit.");
        sem.release();
    }
}

class DecThread implements Runnable {

    String name;
    Semaphore sem;

    public DecThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {
            //First. get a permit
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + " gets a permit.");

            // Now access shared resource
            for (int i = 0; i < 5; i++) {
                Shared.getDecrementedCount(name);

                //Now, allow a context switch
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Release the permit
        System.out.println(name + " releases the permit.");
        sem.release();
    }
}