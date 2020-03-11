package javaConcepts.advanced.threads;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // 1 indicates the main thread to register
        int currentPhase;

        System.out.println("Starting...");

        new Thread(new MyPhaserThread(phaser,"A")).start();
        new Thread(new MyPhaserThread(phaser,"B")).start();
        new Thread(new MyPhaserThread(phaser,"C")).start();

        //Wait for all threads to complete phase one
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " completed");

        //Wait for all threads to complete phase two
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " completed");

        //Wait for all threads to complete phase three
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " completed");

        //Deregister the main thread
        phaser.arriveAndDeregister();

        if (phaser.isTerminated())
            System.out.println("The phaser is terminated");
    }
}


class MyPhaserThread implements Runnable{
    Phaser ph;
    String name;

    public MyPhaserThread(Phaser ph, String name) {
        this.ph = ph;
        this.name = name;
        ph.register();//register increases the parties
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + ": Beginning Phase 1");
            ph.arriveAndAwaitAdvance();
            Thread.sleep(100);

            System.out.println("Thread " + name + ": Beginning Phase 2");
            ph.arriveAndAwaitAdvance();
            Thread.sleep(100);

            System.out.println("Thread " + name + ": Beginning Phase 3");
            ph.arriveAndDeregister();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}