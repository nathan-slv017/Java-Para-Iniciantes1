public class TratamentoExcecao {
    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero");
        } finally {
            System.out.println("Bloco 'finally' executado.");
        }

    }
}
