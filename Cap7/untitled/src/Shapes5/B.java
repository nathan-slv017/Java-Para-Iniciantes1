package Shapes5;

public class B extends A{
    private int i;

    public B(int a, int b) {
        this.i = a;
        super.i = b;
    }

    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + this.i);
    }

    public static void main(String[] args) {
        B subOb = new B(10, 20);

        subOb.show();
    }
}
