package javaConcepts.core.inheritance;

class Base3 {
    public static void show() {
        System.out.println("Base::show() called");
    }
}

class Derived3 extends Base3 {
    public static void show() {
        System.out.println("Derived::show() called");
    }
}

public class InheritanceDemo3 {
    public static void main(String[] args) {
        Base3 b = new Derived3();
        b.show();
    }
}