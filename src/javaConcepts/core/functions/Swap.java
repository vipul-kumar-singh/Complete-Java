package javaConcepts.core.functions;

public class Swap {
    public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
        System.out.println("i = " + i + ", j = " + j);
    }
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }
}