public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(10, -1);
        int x;

        System.out.println("Fail quietly");

        for (int i = 0; i < (fs.length * 2); i++)

            if (!fs.put(i, i * 10))
                System.out.println("index " + i + " out-of-bounds");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");
        }
    }
}
