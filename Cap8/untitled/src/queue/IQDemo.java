package queue;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;

        iQ = q1;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        iQ = q2;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        iQ = q3;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        for (i = 0; i < 20; i++)
            iQ.put((char) ('A' + i));

        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        for (i = 0; i < 20; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

    }

}
