package javaConcepts.core.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

// ###################### BASIC ARITHMETIC OPERATORS ##########################
        System.out.println("BASIC ARITHMETIC OPERATORS");

        int a = 1 + 1; // Addition (Unary plus)
        int b = a * 3; // Multiplication
        int c = b / 4; // Division
        int d = c - a; // Subtraction (Unary minus)
        int e = -d; // (Unary minus)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println();

// ###################### THE MODULUS OPERATOR ##########################
        System.out.println("THE MODULUS OPERATOR");

        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + (x % 10));
        System.out.println("y mod 10 = " + (y % 10));
        System.out.println();


// ###################### ARITHMETIC COMPOUND ASSIGNMENT OPERATORS ##########################
        System.out.println("ARITHMETIC COMPOUND ASSIGNMENT OPERATORS");

        a += 4; // Addition assignment (a = a + 4)
        System.out.println("a += 4 : " + a);

        a -= 1; // Subtraction assignment (a = a - 1)
        System.out.println("a -= 1 : " + a);

        a *= 9; // Multiplication assignment (a = a * 9)
        System.out.println("a *= 9 : " + a);

        a /= 3; // Division assignment (a = a / 3)
        System.out.println("a /= 3 : " + a);

        a %= 10; // Modulus assignment (a = a % 10)
        System.out.println("a %= 10 : " + a);
        System.out.println();


// ###################### INCREMENT AND DECREMENT ##########################
        System.out.println("INCREMENT AND DECREMENT");

        //Postfix increment
        int p = 10;
        System.out.println("p = " + p);
        System.out.println("p++ = " + p++);
        System.out.println("p = " + p);
        System.out.println();

        //Postfix decrement
        int q = 15;
        System.out.println("q = " + q);
        System.out.println("q-- = " + q--);
        System.out.println("q = " + q);
        System.out.println();

        //Prefix increment
        int r = 20;
        System.out.println("r = " + r);
        System.out.println("++r = " + ++r);
        System.out.println("r = " + r);
        System.out.println();

        //Prefix decrement
        int s = 25;
        System.out.println("s = " + s);
        System.out.println("--s = " + --s);
        System.out.println("s = " + s);
        System.out.println();


    }
}
