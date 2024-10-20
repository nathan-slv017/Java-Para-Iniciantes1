import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExemplo {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Nathan");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Amanda");
        nomes.add("André");
        nomes.add("Amos");

        List<String> filtrados = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .collect(Collectors.toList());

        filtrados.forEach(System.out::println);
    }
}
