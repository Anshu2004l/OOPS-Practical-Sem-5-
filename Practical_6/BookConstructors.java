class Book {

    private String title;
    private String author;
    private double price;

    Book() {
        this("Untitled", "Unknown", 0.0);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Java provides no built-in copy constructor; this one copies values.
    Book(Book other) {
        this(other.title, other.author, other.price);
    }

    void setPrice(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class BookConstructors {

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book original = new Book("Clean Code", "Robert C. Martin", 45.00);
        Book copiedBook = new Book(original);

        System.out.println("Default constructor:");
        defaultBook.display();
        System.out.println("Parameterized constructor:");
        original.display();
        System.out.println("Copy constructor before modification:");
        copiedBook.display();

        copiedBook.setPrice(50.00);
        System.out.println("Original after changing the copy:");
        original.display();
        System.out.println("Modified copy:");
        copiedBook.display();

        // The no-argument constructor supplies defaults, the parameterized
        // constructor accepts values, and the copy constructor copies another
        // object's values. Strings and the primitive price are copied by value.
    }
}
