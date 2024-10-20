package Shape8;

public class TwoDShape {

    protected double width;
    protected double height;
    protected String name;

    public TwoDShape(double width, double height, String n) {
        this.width = width;
        this.height = height;
        this.name = n;
    }

    public TwoDShape(double x, String n) {
        this.width = this.height = x;
        this.name = n;

    }

    public TwoDShape() {
        width = height = 0;
        name = "none";
    }

    public TwoDShape(TwoDShape ob) {
        this.width = ob.width;
        this.height = ob.height;
    }


    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}
