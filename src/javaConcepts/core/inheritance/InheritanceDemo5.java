package javaConcepts.core.inheritance;

public class InheritanceDemo5 {
    public static void main(String[] args) {
        Child5 c = new Child5();
    }
}

class Grandparent5 {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent5 extends Grandparent5 {
    public void Print() {
        System.out.println("Parent's Print()");
    }
}

class Child5 extends Parent5 {
    public void Print() {
        super.Print();
        System.out.println("Child's Print()");
    }
}