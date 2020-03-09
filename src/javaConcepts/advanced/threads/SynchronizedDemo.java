package javaConcepts.advanced.threads;

public class SynchronizedDemo {
    public static void main(String[] args) {

        new Thread(new ThreadA("A")).start();
        new Thread(new ThreadB("B")).start();
    }
}

class SharedSync {
    private static int count = 0;

    public static synchronized void getIncrementedCount(String threadName){
        count++;
        System.out.println(threadName + ": " + count);
    }

    public static synchronized void getDecrementedCount(String threadName){
        count--;
        System.out.println(threadName + ": " + count);
    }
}

class ThreadA implements Runnable {

    String name;

    public ThreadA(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {

            // Access shared resource
            for (int i = 0; i < 5; i++) {
                SharedSync.getDecrementedCount(name);
                //Now, allow a context switch
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadB implements Runnable {

    String name;

    public ThreadB(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {

            // Access shared resource
            for (int i = 0; i < 5; i++) {
                SharedSync.getIncrementedCount(name);
                //Now, allow a context switch
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}