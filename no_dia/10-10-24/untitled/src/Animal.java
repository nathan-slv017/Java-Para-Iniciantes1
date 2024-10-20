public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("O animal está fazendo um som.");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome){
        super(nome);
    }

    public void fazerSom(){
        System.out.println("O cachorro " + nome + " está latindo");
    }

    public static void main(String[] args) {
        Cachorro rex = new Cachorro("Rex");
        rex.fazerSom();
        System.out.println(rex.nome);
    }
}
