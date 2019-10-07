package javaConcepts.core.controlFlow;

public class WhileLoop {

    public static void main(String[] args) {

//################## While loop #####################
        int n = 10;

        while (n > 0) {
            System.out.println("tick tick " + n);
            n--;
        }
        System.out.println("BOOM!!");
        System.out.println();

//################## While loop without body #####################
        int i = 100;
        int j = 200;

        //find midpoint
        while (++i < --j) ;

        System.out.println("Midpoint is " + i);

    }
}
