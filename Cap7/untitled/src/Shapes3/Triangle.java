package Shapes3;

public class Triangle extends TwoDShape {
    private String style;

    public Triangle(String s, double w, double h) {
        this.style = s;
        this.width = w;
        this.height = h;

    }

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Shapes4.Triangle is " + style);
    }
}
