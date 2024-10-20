public class FindFac {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.print("Factors of " + i + ": ");
            boolean hasFactors = false;  // Para controlar a existência de fatores
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    System.out.print(j + " ");
                    hasFactors = true;
                }
            }
            if (!hasFactors) {
                System.out.print("None");  // Mostra "None" se não houver fatores
            }
            System.out.println();  // Imprime nova linha após todos os fatores serem impressos
        }
    }
}
