package javaConcepts.exercises;


/**
 * Write a method named hasSharedDigit with two parameters of type int.
 *
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 *
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23; otherwise, the method should return false.
 */
public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 < 10 || num1 > 99 || num2 <10 || num2 > 99)
            return false;

        String n1 = String.valueOf(num1);
        String n2 = String.valueOf(num2);

        for (int i = 0; i < n1.length(); i++){

            if (n2.indexOf(n1.charAt(i)) != -1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

}
