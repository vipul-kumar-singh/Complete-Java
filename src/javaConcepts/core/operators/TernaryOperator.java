package javaConcepts.core.operators;

public class TernaryOperator {

    public static void main(String[] args) {

/** ###################### THE TERNARY OPERATOR ##########################
 '?' is the java ternary operator.
 It is used in conditional statements
 Format: expression1 ? expression2 : expression3
 Here expression1 evaluates to a boolean value.
 If the value is true expression2 is executed.
 If the value is false expression3 is executed.
 */
        int i, j, k;

        i = 10;
        j = -10;

        k = i < 0 ? -i : i;
        System.out.println("Absolute value of " + i + " is " + k);

        k = i < 0 ? -i : i;
        System.out.println("Absolute value of " + j + " is " + k);

    }
}
