package javaConcepts.core.controlFlow;

public class Switch {

    public static void main(String[] args) {

//################# Simple switch ####################
        int dayOfWeek = 5;
        String day;

        switch (dayOfWeek) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day of week";
                break;
        }

        System.out.println(dayOfWeek + " = " + day);
        System.out.println();


//################# Handle multiple case at once ####################
        int month = 5;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter Season");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring Season");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer Season");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Autumn season");
                break;

            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
