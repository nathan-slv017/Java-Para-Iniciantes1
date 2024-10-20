public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimeDados(){
        System.out.println("Meu nome é " + this.nome + " e tenho " + this.idade + " anos");
    }

    public static void main(String[] args) {

        Pessoa nathan = new Pessoa("Nathan", 22);
        nathan.imprimeDados();
    }
}
