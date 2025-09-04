package constructor.level1;

class BookModel {
    private String title;
    private String author;
    private double price;
    private boolean available;

    BookModel() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }

    BookModel(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrow() {
        if (available) {
            available = false;
            System.out.println("You have borrowed \"" + title + "\" successfully.");
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + available);
    }
}

public class LibraryBookingSystem {
    public static void main(String[] args) {
        BookModel b1 = new BookModel();
        BookModel b2 = new BookModel("The Hobbit", "J.R.R. Tolkien", 15.5, true);

        System.out.println("Library Books:");
        b1.display();
        b2.display();

        System.out.println("\nBorrowing Books:");
        b1.borrow();
        b2.borrow();
        b2.borrow();
    }
}
