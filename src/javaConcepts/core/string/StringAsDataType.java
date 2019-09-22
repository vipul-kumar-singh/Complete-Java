package javaConcepts.core.string;

public class StringAsDataType {

    public static void main(String[] args) {

        String myString = "This is a string. ";

        //concatenation
        System.out.println("MyString is : " + myString);
        myString = myString + "And this is concatenated string.";
        System.out.println("MyString after concatenation is : " + myString);

        //Unicode in strings
        System.out.println("\u00A9 2019");

        //primitive to String
        int aNumber = 256;
        String numberString = String.valueOf(aNumber); //same can be done for all data types
        System.out.println(numberString);

        char aCharacter = 'V';
        String charString = String.valueOf(aCharacter);
        System.out.println(charString + "ipul");

        //new line and tab
        System.out.println("This\tis\ta\ttab\tseparated\tstring");
        System.out.println("New\nLine");

    }
}
