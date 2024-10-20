public class Search {
    public static void main(String[] args) {

        int val = 50;
        boolean found = false;
        int theArray[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        for(int x: theArray){
            if (x == val)
                found = true;
            if (found) break;
            System.out.print(" " + x);
        }
        System.out.println();
        System.out.println(found?"Founded: " + val: "not Founded");
    }
}
