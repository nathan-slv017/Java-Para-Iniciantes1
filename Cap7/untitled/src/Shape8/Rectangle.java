package Shape8;

public class Rectangle  extends TwoDShape {


    public Rectangle() {
        super();
    }

    public Rectangle(double w, double h){
        super(w, h, "rectangle");
    }

    public Rectangle(double x){
        super(x, "rectangle");
    }

    public Rectangle(Rectangle ob){
        super(ob);
    }

    boolean isSquare(){
        if (width == height) return true;
        return false;
    }

    double area(){
        return width * height;
    }
}
