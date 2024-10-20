import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        while (true) {

            int numero;

            System.out.println("Informe um número inteiro");
            numero = scaner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O numero: " + numero + " é par");
            } else {
                System.out.println("O numero: " + numero + " é impar");
            }
        }
    }
}
