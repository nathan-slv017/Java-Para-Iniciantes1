package bookpack;

public class Book {

    private String title;
    private String author;
    private int puDate;

    public Book(String title, String author, int puDate) {
        this.title = title;
        this.author = author;
        this.puDate = puDate;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(puDate);
        System.out.println();
    }


}
