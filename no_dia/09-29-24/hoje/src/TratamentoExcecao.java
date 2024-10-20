public class TratamentoExcecao {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        }
    }
}
