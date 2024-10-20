public class ManipulacaoString {
    public static void main(String[] args) {
        String original = "Java é Inclível";

        String emMaiusculo = original.toUpperCase();
        String emMinuscula = original.toLowerCase();

        String comSubistituição = original.replace("Inclível", "Poderoso");

        System.out.println(emMaiusculo);
        System.out.println(emMinuscula);
        System.out.println(comSubistituição);
    }
}
