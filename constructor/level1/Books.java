package constructor.level1;

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

public class Books {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();
        System.out.println("------------------------");

        Book book2 = new Book("1984", "George Orwell", 299.0);
        book2.displayDetails();
    }
}
