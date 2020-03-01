package javaConcepts.core.statics;

public class StaticDemo {

    private int num = 5;

    private static int staticNum = 10;

    {
        System.out.println("I'm in block");
        System.out.println("Value of num = " + num);
    }

    static {
        getStaticNum();
        System.out.println("I'm in static block");
        System.out.println("Value of staticNum = " + staticNum);
    }

    public void getNum() {
        System.out.println("I'm in getNum()");
        System.out.println("Value of num = " + num);
    }

    public static void getStaticNum() {
        System.out.println("I'm in  getStaticNum()");
        System.out.println("Value of staticNum = " + staticNum);
    }

    public StaticDemo(){
        System.out.println("I'm in constructor");
        System.out.println("Value of num = " + num);
    }

    public static void main(String[] args) {
        System.out.println("I'm in main()");
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.getNum();
    }
}
