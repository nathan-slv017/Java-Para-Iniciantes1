package Shapes6;

public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;

        Y y = new Y(5, 6);

        x2 = x;
        System.out.println("x2.a: " + x2.a);

        x2 = y;
        System.out.println("x2.a: " + x2.a);
    }
}
