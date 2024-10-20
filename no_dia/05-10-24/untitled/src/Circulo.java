interface forma {
    static void main(String[] args) {

    }

    double calculadora();
}

public class Circulo implements forma {
    double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calculadora() {
        return Math.PI * raio * raio;
    }
}

