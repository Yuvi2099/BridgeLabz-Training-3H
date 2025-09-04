package constructor.AccessModifiers;

class BookModel {
    public String ISBN;
    protected String title;
    private String author;

    BookModel() {
        this("Unknown", "Unknown", "Unknown");
    }

    BookModel(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends BookModel {
    private double fileSize; // in MB

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        BookModel b1 = new BookModel("123-456", "Java Basics", "Alice");
        b1.display();

        b1.setAuthor("Bob");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb1 = new EBook("789-012", "Advanced Java", "Charlie", 5.5);
        eb1.displayEBookDetails();
    }
}
