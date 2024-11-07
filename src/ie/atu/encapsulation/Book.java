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
        if (isbn == null || !isbn.matches("\\d{10}|\\d{13}")) {
            throw new IllegalArgumentException("ISBN must be a 10 or 13 digit number.");
        }
        return isbn;
    }

    private String validateTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        return title;
    }

    private String validateAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        return author;
    }
}