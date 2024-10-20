import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());


        numerosPares.forEach(System.out::println);

        List<Integer> numerosImpar = numbers.stream()
                .filter(num -> (num % 2 != 0))
                .collect(Collectors.toList());

        numerosImpar.forEach(System.out::println);
    }
}
