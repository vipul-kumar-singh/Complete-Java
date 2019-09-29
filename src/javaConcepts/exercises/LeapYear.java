package javaConcepts.exercises;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year > 0) && (year < 10000) && (year % 4 == 0)) {
            if ((year % 100 == 0) && !(year % 400 == 0))
                return false;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));
    }
}