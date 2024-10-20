public class Search {
    public static void main(String[] args) {
        int val = 5;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean found = false;

        for (int x: nums){
            if (x == val){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
