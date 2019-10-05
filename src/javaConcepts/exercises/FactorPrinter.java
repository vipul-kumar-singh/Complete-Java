package javaConcepts.exercises;

/**
 * Write a method named printFactors with one parameter of type int named number.
 * <p>
 * If number is < 1, the method should print "Invalid Value".
 * <p>
 * The method should print all factors of the number. A factor of a number is an integer
 * which divides that number wholly (i.e. without leaving a remainder).
 * <p>
 * For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
 */
public class FactorPrinter {

    public static void printFactors(int number){
        if (number<1)
            System.out.println("Invalid Value");

        for (int i = 1; i <= number; i++){
            if (number%i == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        System.out.println();
        printFactors(32);
        System.out.println();
        printFactors(10);
        System.out.println();
        printFactors(-1);
    }
}
