package javaConcepts.core.functions;

public class Main {
    public static void main(String args[]) {

        Main main = new Main();
        String x = new String("b");
        String z = "a";
        String y = main.giveMeAString(x,z);
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);
    }

    String giveMeAString(String y,String a) {
        y=a;
        return y;
    }
}
