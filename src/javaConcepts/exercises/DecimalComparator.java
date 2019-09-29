package javaConcepts.exercises;

public class DecimalComparator {

    /**
     * The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
     * Otherwise, return false.
     * @param a First Number
     * @param b Second Number
     * @return Answer
     */
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        Integer aNum = (int)(a * 1000);
        Integer bNum = (int)(b * 1000);
        return aNum.equals(bNum);
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}
