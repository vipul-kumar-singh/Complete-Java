package javaConcepts.core.controlFlow;

public class IfElse {

    public static void main(String[] args) {

//################## Simple if statement #####################
        boolean shouldPrintSomething = true;

        System.out.println("Start");
        if (shouldPrintSomething)
            System.out.println("Something"); //for single statement inside if, curly braces are not required

        if (shouldPrintSomething) { //for multiple statements inside if, curly braces are required
            System.out.println("I'm inside if statement");
            System.out.println("I should print something");
        }

        System.out.println("End");
        System.out.println();


//################## if-else statements #####################
        int x = 5;
        int y = 9;

        if (x > y)
            System.out.println("x is greater than y");
        else
            System.out.println("x is not greater than y");
        System.out.println();


//################## if-else-if statements #####################
        int p = 3;
        int q = 3;

        if (p > q)
            System.out.println("p is greater than q");
        else if (p < q)
            System.out.println("p is less than q ");
        else
            System.out.println("p is equal to q");
        System.out.println();


//################## Nested if statements #####################
        int year = 8000;
        boolean isLeapYear = false;
        if (year >= 0 && year % 4 == 0) {
            isLeapYear = true;

            if (year % 100 == 0 && year % 400 != 0)
                isLeapYear = false;

            if (isLeapYear)
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");
        } else {
            System.out.println("Invalid value of year");
        }
    }
}
