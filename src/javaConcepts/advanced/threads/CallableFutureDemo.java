package javaConcepts.advanced.threads;

import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        Future<Integer> f1;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Starting");

        f1 = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3,4));
        f3 = es.submit(new Factorial(5));

        try{
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Done");
    }
}

class Sum implements Callable<Integer>{
    int num;

    public Sum(int num) {
        this.num = num;
    }

    @Override
    public Integer call(){
        System.out.println("Calculating Sum...");
        int sum = 0;

        for(int i = 1; i<= num; i++)
            sum += i;

        return sum;
    }
}

class Hypot implements Callable<Double>{
    double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call(){
        System.out.println("Calculating Hypotenuse...");
        return Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }
}

class Factorial implements Callable<Integer>{
    int num;

    public Factorial(int num) {
        this.num = num;
    }

    @Override
    public Integer call(){
        System.out.println("Calculating Factorial...");
        int fact = 1;

        for(int i = 2; i<= num; i++)
            fact *= i;

        return fact;
    }
}