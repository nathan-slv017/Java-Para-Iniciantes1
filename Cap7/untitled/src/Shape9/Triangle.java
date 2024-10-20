package Shape9;

public class Triangle extends TwoDShape {
    private String style;

    public Triangle(String s, double w, double h) {

        super(w, h, "Triangle"); // chama o construtor da superclasse

        this.style = s;

    }

    public Triangle(double x){
        super(x, "triangle");
        style = "filled";
    }

    public Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }

    public Triangle() {
        super();
        style = "none";
    }

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
