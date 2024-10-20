public class ContToLabel {
    public static void main(String[] args) {
        outerloop:
        // Coloca o rótulo diretamente antes do loop externo
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", innerLoop: ");
            for (int j = 0; j < 10; j++) {
                if (i == 5) {
                    System.out.print(i);
                    continue outerloop;
                }
            }
        }
    }
}
