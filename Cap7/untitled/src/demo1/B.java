package demo1;

public class B extends A{

    int k;

    public B(int a, int b, int c) {
        super(a, b);
        this.k = c;
    }

    void show(){
        super.show();
        System.out.println("k: " + k);
    }
}
