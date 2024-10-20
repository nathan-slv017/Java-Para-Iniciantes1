public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "is", "a", "test"};

        for (String s : strs) System.out.print(s + " ");

        System.out.print("\n");
        strs[1] = "was";
        strs[3] = "test too!";

        for (String s : strs) System.out.print(s + " ");

    }
}
