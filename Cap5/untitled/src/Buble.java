public class Buble {

    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t, size;

        size = nums.length; // número de elementos a serem classificados

        // exibe o array original
        System.out.println("Original array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);

        }
        System.out.println();
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.println("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);

        }
        System.out.println();
    }
}

