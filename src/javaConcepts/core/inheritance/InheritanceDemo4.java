package javaConcepts.core.inheritance;

class Base4 {
    protected void show() {
        System.out.println("Base::show() called");
    }
}

class Derived4 extends Base4 {
    protected void show() {
        System.out.println("Derived::show() called");
    }
}

public class InheritanceDemo4 {
    public static void main(String[] args) {
        Base4 b = new Derived4();
        b.show();
    }
}
