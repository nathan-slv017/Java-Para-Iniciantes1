public class Overload {
    void ovlDemo() {
        System.out.println("No parameters");
    }

    void ovlDemo(int i) {
        System.out.println("One parameter: " + i);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b){
        System.out.println("Two double parameters: " + a + " " + b);
        return  a + b;
    }

    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        double k = 2;
        double l = 2;


        Overload ob = new Overload();
        ob.ovlDemo();
        ob.ovlDemo(i);
        ob.ovlDemo(i, j);

        double m = ob.ovlDemo(k, l);
        System.out.println(m);
    }
}
