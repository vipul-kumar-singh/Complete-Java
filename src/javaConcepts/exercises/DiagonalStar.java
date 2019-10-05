package javaConcepts.exercises;

/**
 * Write a method named printSquareStar with one parameter of type int named number.
 * <p>
 * If number is < 5, the method should print "Invalid Value".
 * <p>
 * The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
 * <p>
 * <p>
 * EXAMPLE INPUT/OUTPUT:
 * <p>
 * EXAMPLE 1
 * <p>
 * printSquareStar(5); should print the following:
 * <p>
 * *****
 * ** **
 * * * *
 * ** **
 * *****
 * <p>
 * <p>
 * Explanation:
 * <p>
 * *****   5 stars
 * ** **   2 stars space 2 stars
 * * * *   1 star space 1 star space 1 star
 * ** **   2 stars space 2 stars
 * *****   5 stars
 * <p>
 * <p>
 * EXAMPLE 2
 * <p>
 * printSquareStar(8); should print the following:
 * <p>
 * ********
 * **    **
 * * *  * *
 * *  **  *
 * *  **  *
 * * *  * *
 * **    **
 * ********
 */
public class DiagonalStar {


    public static void main(String[] args) {
        printSquareStar(1);
    }

    public static void printSquareStar(int number) {

        if (number <= 0)
            System.out.println("Invalid Value");
        else {

            int i, j;

            int diagNum = number - 2;
            int x = 0, y;

            for (i = 0; i < number; i++) {
                if (i == 0 || i == number - 1) {
                    for (j = 0; j < number; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    System.out.print("*");

                    y = 0;
                    while (y < diagNum) {
                        if (x == y || y == diagNum - (x + 1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                        y++;
                    }
                    x++;
                    System.out.println("*");
                }
            }
        }
    }
}
