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

        // System.out.println(numeros);

        for (int numero: numeros){
            System.out.println(numero);
        }
    }
}
