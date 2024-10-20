public class Fatorial {
    public static int fatorial(int n) {
        if (n == 1){
            return 1;
        } else {
            return n * fatorial(n - 1);
        }

    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("O fatorial de " + numero + " é: " + fatorial(numero));
    }
}
