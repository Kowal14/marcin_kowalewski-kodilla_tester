public class Book {
    private String author = "Isaac Asimov";
    private String title = "The Galaxy";

    public Book(String author, String title) {
        this.author = author;
        this.title = title;

        Book book = new Book("Isaac Asimov", "The Galaxy");
        System.out.println(book.author + book.title);

    }
public static Book Of(String author, String title) {
    return Book.Of(author, title);
    }
}