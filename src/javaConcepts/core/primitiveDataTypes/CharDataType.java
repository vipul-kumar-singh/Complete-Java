package javaConcepts.core.primitiveDataTypes;

public class CharDataType {

    public static void main(String[] args) {

        char firstChar = 'A';

        char secondChar = 123;

        char copyright = '\u00A9';

        char charOfString = "Hello".charAt(1);

        char maxValue = Character.MAX_VALUE;

        char minValue = Character.MIN_VALUE;

        System.out.println("firstChar : " + firstChar);
        System.out.println("secondChar : " + secondChar);
        System.out.println("copyright : " + copyright);
        System.out.println("charOfString : " + charOfString);
        System.out.println("maxValue : " + maxValue);
        System.out.println("minValue : " + minValue);
    }
}
