package Shapes4;

public class ColorTriangle extends Triangle{
    private String color;

    ColorTriangle(String c, String s, double w, double h){
        super(s, w, h);

        color = c;
    }

    String getColor() {
        return this.color;
    }

    void showColor(){
        System.out.println("Color is " + color);
    }
}
