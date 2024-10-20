public class Block {
    private int a, b, c, volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = this.a * this.b * this.c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getVolume() {
        return volume;
    }

    boolean sameBlock(Block ob) {
        if (ob.getA() == this.a && ob.getB() == this.b && ob.getC() == this.c) return true;
        else return false;
    }

    boolean sameVolume(Block ob) {
        if (this.volume == ob.volume) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(5, 5, 2);
        Block ob2 = new Block(5, 5, 2);
        Block ob3 = new Block(5, 10, 2);

        System.out.println("O Bloco 1 & 2 " + (ob1.sameBlock(ob2) ? "são iguais" : "são diferente"));
        System.out.println("O Bloco 1 & 3 " + (ob1.sameBlock(ob3) ? "são iguais" : "são diferente"));
    }
}