package javaConcepts.exercises;

/**
 * Write a method printYearsAndDays with parameter of type long named minutes.
 * The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
 * If the parameter is less than 0, print text "Invalid Value".
 * Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
 * XX represents the original value minutes.
 * YY represents the calculated years.
 * ZZ represents the calculated days.
 */
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid Value");
        else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-525600);
    }

}
