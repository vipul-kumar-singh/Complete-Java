package javaConcepts.core.operators;

public class AssignmentOperator {

    public static void main(String[] args) {

        int a;
        int x, y, z;

        a = 10; //single assignment
        x = y = z = 100; //chain of assignment (z = 100, y = z, x = y)

        System.out.println("a = " + a);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
