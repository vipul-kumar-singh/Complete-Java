package javaConcepts.core.inheritance;

public class InheritanceDemo1 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println(parent1.getA());

        Parent parent2 = new Child();
        System.out.println(parent2.getA());

        Child child1 = new Child();
        System.out.println(child1.getA());

        Parent parent3 = child1;
        System.out.println(parent3.getA());

        child1.setA(10);
        System.out.println(((Parent)child1).getA());
        System.out.println(child1.getParentA());
    }
}

class Parent {
    private int a = 5;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}


class Child extends Parent{

    private int a = 4;

    public int getA(){
        return a;
    }

    public int getParentA(){
        return super.getA();
    }
}