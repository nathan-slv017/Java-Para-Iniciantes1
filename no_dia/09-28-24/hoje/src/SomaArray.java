public class SomaArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        int soma = 0;

        for(int num: numeros){
            soma += num;
        }

        System.out.println("The sum is: " + soma);
    }
}

