package javaConcepts.examples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        char shouldContinue = 'Y';
        int option = 0;
        int num1, num2, result;
        Scanner scanner = new Scanner(System.in);

        while (shouldContinue == 'Y' || shouldContinue == 'y') {

            System.out.println("########### CALCULATOR ###########");
            System.out.println("What operation do you want to perform?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();

                if (option >= 1 && option <= 4) {

                    System.out.println("Enter num1 : ");
                    if (scanner.hasNextInt()) {
                        num1 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter num2 : ");
                        if (scanner.hasNextInt()) {
                            num2 = scanner.nextInt();
                            scanner.nextLine();

                            switch (option) {
                                case 1:
                                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                                    break;
                                case 2:
                                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                                    break;
                                case 3:
                                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                                    break;
                                case 4:
                                    System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / (double)num2));
                                    break;
                                default:
                                    System.out.println("Please try again!");
                                    break;
                            }

                        } else {
                            System.out.println("Invalid num2");
                            scanner.nextLine();
                        }

                    } else {
                        System.out.println("Invalid num1");
                        scanner.nextLine();
                    }
                }
                else {
                    System.out.println("Please enter options from 1 to 4");
                }


            } else {
                System.out.println("Invalid option");
                scanner.nextLine();
            }

            System.out.println("Do you want to perform another operation? (Y/N)");
            if (scanner.hasNextLine())
                shouldContinue = scanner.nextLine().charAt(0);
            System.out.println();
        }

    }
}
