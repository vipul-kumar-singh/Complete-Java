package javaConcepts.exercises;

import java.util.Scanner;

/**
 * Write a method called inputThenPrintSumAndAverage that does not have any parameters.
 * <p>
 * The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
 * <p>
 * When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
 * <p>
 * XX represents the sum of all entered numbers of type int.
 * YY represents the calculated average of all numbers of type long.
 */
public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        double avg = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            avg = (double)sum / (double)count;
            System.out.println(avg);
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));

        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
