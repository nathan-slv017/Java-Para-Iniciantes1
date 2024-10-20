public class arrayForE {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        System.out.println(sum);

        sum = 0;

        for(int x: nums) sum += x;

        System.out.println(sum);

        // Soma apenas os 5 primeiros elementos.

        sum = 0;
        for (int x: nums){
            sum += x;
            if (x == 5) break;
        }
        System.out.println(sum);
    }
}
