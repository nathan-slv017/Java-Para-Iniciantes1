package Test2;

public class Main {
    public static void main(String[] args) {
        ExcTest exc1 = new ExcTest();

        //exc1.genException();

        try{
            exc1.genException();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
