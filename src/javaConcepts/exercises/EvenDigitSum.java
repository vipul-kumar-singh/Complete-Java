package javaConcepts.exercises;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value
 */
public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int sum = 0;
        int last;

        while (number != 0) {

            last = number % 10;

            if (last % 2 == 0)
                sum += last;

            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
