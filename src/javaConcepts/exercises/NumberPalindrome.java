package javaConcepts.exercises;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 */
public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number = number / 10;
        }

        if (originalNumber == reversedNumber)
            return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
