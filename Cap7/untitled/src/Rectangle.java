import Shapes3.TwoDShape;

public class Rectangle extends TwoDShape {

    boolean isSquare() {
        if (width == height) return true;
        return false;
    }
    double area(){
        return width * height;
    }
}
