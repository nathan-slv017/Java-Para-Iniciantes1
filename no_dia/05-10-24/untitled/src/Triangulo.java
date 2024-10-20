public class Triangulo implements forma{

    private double largura, comprimento;

    public Triangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calculadora() {
        return largura * comprimento;
    }
}
