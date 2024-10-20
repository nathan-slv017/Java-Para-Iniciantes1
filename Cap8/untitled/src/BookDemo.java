import bookpack.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[2];

        books[0] = new Book("Java: A biginner's Guide", "Schildt", 2014);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 2014);

        for (int i = 0 ; i < books.length; i++){
            books[i].show();
        }
    }
}
