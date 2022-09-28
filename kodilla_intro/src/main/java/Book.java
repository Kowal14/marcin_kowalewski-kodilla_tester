public class Book {
    private String author = "Isaac Asimov";
    private String title = "The Galaxy";

    public Book(String author, String title) {
        this.author = author;
        this.title = title;




    }
public static Book Of(String author, String title) {
    Book book = new Book( author, title);
    return Book.Of(author, title);
    }
}