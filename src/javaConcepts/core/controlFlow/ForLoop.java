package javaConcepts.core.controlFlow;

public class ForLoop {

    public static void main(String[] args) {

//################## For loop #####################
        for (int i = 0; i < 10; i++)
            System.out.println("Number = " + i);
        System.out.println();


//################## For loop with break #####################
        int num = 14;
        boolean isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
        System.out.println();


//################## For loop with multiple conditions #####################
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " +a );
            System.out.println("b = " +b );
        }
        System.out.println();


//################## For loop without initialization or iteration #####################
        int i = 0;
        boolean done = false;
        for(; !done ;){
            System.out.println("i is " + i);
            if (i == 10)
                done = true;
            i++;
        }


    }
}
