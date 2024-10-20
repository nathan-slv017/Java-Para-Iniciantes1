import java.util.Queue;

public class QDemo {


    char q[]; // esse array contém a fila
    int putloc, getloc; // os índices put e get

    QDemo(int size) {
        q= new char[size]; // aloca a memória para a fila
        putloc = getloc = 0;
    }

    // insere um caractere na fila

    void put(char ch) {
        if(putloc == q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    char get(){
        if (getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

    public static void main(String[] args) {
        QDemo bigQ = new QDemo(100);
        QDemo smallQ = new QDemo(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        //recupera e exibe elementos bigQ
        System.out.println("Contents of bigQ: ");
        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        for (i = 0; i < 5; i++){
            System.out.println("Attempting to store " + (char) ('z' - 1));

            smallQ.put((char) ('z' - i));
            System.out.println();
        }
        System.out.println();
    }
}
