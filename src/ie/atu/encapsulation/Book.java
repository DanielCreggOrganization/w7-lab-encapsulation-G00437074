package ie.atu.encapsulation;

public class Book {
    // Private fields
    private final String isbn;
    private final String title;
    private final String author;

    // Constructor with validation
    public Book(String isbn, String title, String author) {
        this.isbn = validateIsbn(isbn);
        this.title = validateTitle(title);
        this.author = validateAuthor(author);
    }

    // Getter methods
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Validation methods
    private String validateIsbn(String isbn) {
        return isbn;
    }

    private String validateTitle(String title) {
        return title;
    }

    private String validateAuthor(String author) {
        return author;
    }
}