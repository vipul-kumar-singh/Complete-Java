package javaConcepts.core.inheritance;

class Base {
    final public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    /*
    *Final methods cannot be overridden. See the compiler error here.
    */
//    public void show() {
//        System.out.println("Derived::show() called");
//    }

}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}