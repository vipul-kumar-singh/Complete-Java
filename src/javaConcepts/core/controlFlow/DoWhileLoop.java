package javaConcepts.core.controlFlow;

public class DoWhileLoop {

    public static void main(String[] args) {

//################## Do-While loop #####################
        int n = 10;
        do {
            System.out.println("tick tick " + n);
            n--;
        } while (n > 0);
        System.out.println("BOOM!!");

    }
}
