public class CLDemo {
    public static void main(String args[]) {
        System.out.println("There are " + args.length + " command-line arguments");

        System.out.println("There are: ");
        for (int i = 0; i < args.length; i++){
            System.out.println("arg[" + i + "]: " + args[i]);
        }

        String numbers[][] = {
                {"Tom", "555-3322"},
                {"José", "544-3322"},
                {"Marcos", "556-3322"},
                {"Lucas", "555-1122"}
        } ;
    }
}
