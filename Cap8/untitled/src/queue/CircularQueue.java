package queue;

public class CircularQueue implements ICharQ{

    private char q[];
    private int getloc, putloc;

    public CircularQueue(int size) {
        q = new char[size+1];
        getloc = putloc = 0;
    }

    @Override
    public void put(char ch) {
        if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0;
    }

    @Override
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if(getloc == q.length) getloc = 0;
        return ch;
    }
}
