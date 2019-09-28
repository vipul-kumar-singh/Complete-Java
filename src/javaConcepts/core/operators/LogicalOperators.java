package javaConcepts.core.operators;

public class LogicalOperators {

    public static void main(String[] args) {

// ###################### LOGICAL BOOLEAN OPERATORS ##########################

        boolean trueValue = true;
        boolean falseValue = false;

        //Logical AND (&)
        System.out.println("Logical AND (&)");
        System.out.println("--------------------------");
        System.out.println("A \t\t B \t\t : \t A&B");
        System.out.println("--------------------------");
        System.out.println("true \t true \t : \t " + (trueValue & trueValue));
        System.out.println("true \t false \t : \t " + (trueValue & falseValue));
        System.out.println("false \t true \t : \t " + (falseValue & trueValue));
        System.out.println("false \t false \t : \t " + (falseValue & falseValue));
        System.out.println("--------------------------");
        System.out.println();

        //Logical OR (|)
        System.out.println("Logical OR (|)");
        System.out.println("--------------------------");
        System.out.println("A \t\t B \t\t : \t A|B");
        System.out.println("--------------------------");
        System.out.println("true \t true \t : \t " + (trueValue | trueValue));
        System.out.println("true \t false \t : \t " + (trueValue | falseValue));
        System.out.println("false \t true \t : \t " + (falseValue | trueValue));
        System.out.println("false \t false \t : \t " + (falseValue | falseValue));
        System.out.println("--------------------------");
        System.out.println();

        //Logical XOR (Exclusive OR)(^)
        System.out.println("Logical XOR (^)");
        System.out.println("--------------------------");
        System.out.println("A \t\t B \t\t : \t A^B");
        System.out.println("--------------------------");
        System.out.println("true \t true \t : \t " + (trueValue ^ trueValue));
        System.out.println("true \t false \t : \t " + (trueValue ^ falseValue));
        System.out.println("false \t true \t : \t " + (falseValue ^ trueValue));
        System.out.println("false \t false \t : \t " + (falseValue ^ falseValue));
        System.out.println("--------------------------");
        System.out.println();

        //Logical Unary NOT (!)
        System.out.println("Logical NOT (!)");
        System.out.println("--------------------------");
        System.out.println("A \t\t : \t !A");
        System.out.println("--------------------------");
        System.out.println("true \t : \t " + !trueValue);
        System.out.println("false \t : \t " + !falseValue);
        System.out.println();


// ###################### SHORT CIRCUIT LOGICAL OPERATORS ##########################
        String a = "apple";
        String b = "banana";

        // Short circuit AND (&&)
        if (a.equals("apple") && b.equals("banana"))
            System.out.println("Both a and b are fruits");

        // Short circuit OR (||)
        if (a.equals("apple") || b.equals("banana"))
            System.out.println("Either a or b is a fruit");

        // Short Circuit operators with Logical Unary Not
        if (!a.equals("apple") && !b.equals("banana"))
            System.out.println("None of a and b are fruits");

        if (!(a.equals("apple") || b.equals("banana")))
            System.out.println("None of a and b are fruits");


// ###################### ASSIGNMENT LOGICAL OPERATORS ##########################

        System.out.println();
        System.out.println(trueValue &= false); // AND assignment
        System.out.println(trueValue |= true); // OR assignment
        System.out.println(trueValue ^= false); // XOR assignment

    }
}

