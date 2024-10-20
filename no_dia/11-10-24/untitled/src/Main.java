public class Main {
    public static void main(String[] args) {

        int nuns[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < nuns.length; i++)
            sum += nuns[i];

        System.out.println(sum);

        sum = 0;

        for (int x : nuns)
            sum += x;
        System.out.println(sum);
    }
}