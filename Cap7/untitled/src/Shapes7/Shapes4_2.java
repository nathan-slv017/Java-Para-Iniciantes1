package Shapes7;

public class Shapes4_2 {

    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);

        t1.showStyle();
        t1.showDim();
        t1.showColor();

        System.out.println("Info for t1: " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");


        t1.showStyle();
        t1.showDim();
        t1.showColor();

        System.out.println("Area is " + t2.area() );
    }
}
