package Shapes4;

public class TwoDShape {

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
        width = height = 0;
    }

    protected double width;
    protected double height;

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
