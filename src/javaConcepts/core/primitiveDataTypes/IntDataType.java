package javaConcepts.core.primitiveDataTypes;

public class IntDataType {

    public static void main(String[] args) {

        int firstNumber = 123;

        int secondNumber = 1_525_456_123;//used to signify 1,525,456,123

        int maxValue = Integer.MAX_VALUE;

        int minValue = Integer.MIN_VALUE;

        int newMaxValue = maxValue + 1;

        int newMinValue = minValue - 1;

        System.out.println("firstNumber : " + firstNumber);
        System.out.println("secondNumber : " + secondNumber);
        System.out.println("maxValue : " + maxValue);
        System.out.println("minValue : " + minValue);
        System.out.println("newMaxValue : " + newMaxValue);
        System.out.println("newMinValue : " + newMinValue);

    }
}
