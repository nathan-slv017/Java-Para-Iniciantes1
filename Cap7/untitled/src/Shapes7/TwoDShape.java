package Shapes7;

public class TwoDShape {

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
        width = height = 0;
    }

    public TwoDShape(TwoDShape ob) {
        this.width = ob.width;
        this.height = ob.height;
    }

    protected double width;
    protected double height;

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
