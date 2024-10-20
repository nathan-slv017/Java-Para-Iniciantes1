public class TheCarros {
    String marca;
    String modelo;
    int ano;


    public TheCarros(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "TheCarros{" +
                "marca='" + marca + '\n' +
                ", modelo='" + modelo + '\n' +
                ", ano=" + ano +
                '}';
    }
}
