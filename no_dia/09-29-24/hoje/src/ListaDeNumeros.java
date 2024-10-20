import java.util.ArrayList;
import java.util.List;

public class ListaDeNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int total = 0;

        for (int numero: numeros){
            total += numero;
            System.out.println("Número: " + numero);
        }
        System.out.println(total);
    }
}
