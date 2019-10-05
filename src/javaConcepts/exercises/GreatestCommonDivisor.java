package javaConcepts.exercises;

/**
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 * The method should return the greatest common divisor of the two numbers (int).
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
 */
public class GreatestCommonDivisor {


    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10)
            return -1;

        int gcd = 1;

        for (int i = 2; i<= first; i++){
            if ((first % i == 0) && (second % i == 0))
                gcd = i;
        }
        return gcd;
    }
}
