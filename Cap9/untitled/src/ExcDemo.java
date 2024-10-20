public class ExcDemo {
    public static void main(String[] args) {


        int nums[] = new int[4];

        try {
            nums[10] = 9;
            System.out.println("This won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }

        System.out.println("After catch statement");
    }
}
