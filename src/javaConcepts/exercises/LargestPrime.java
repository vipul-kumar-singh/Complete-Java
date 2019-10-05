package javaConcepts.exercises;

/**
 * Write a method named getLargestPrime with one parameter of type int named number.
 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
 * The method should calculate the largest prime factor of a given number and return it.
 */
public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;

        int largestPrime = 2;
        for (int i = 2; i <= number; i++) {

            //check if it a factor
            if (number % i == 0) {
                boolean isPrime = true;

                //check if factor is prime
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime)
                    largestPrime = i;
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
