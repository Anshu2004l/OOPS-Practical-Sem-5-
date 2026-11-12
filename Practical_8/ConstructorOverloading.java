class Product {

    private String name;
    private double price;
    private int quantity;

    Product() {
        this("Unnamed product", 0.0, 0);
    }

    Product(String name) {
        this(name, 0.0, 0);
    }

    Product(String name, double price) {
        this(name, price, 0);
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: " + price
                + ", Quantity: " + quantity + ", Total cost: " + calculateTotalCost());
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Product defaultProduct = new Product();
        Product namedProduct = new Product("Notebook");
        Product pricedProduct = new Product("Pen", 2.5);
        Product stockedProduct = new Product("Textbook", 40.0, 3);

        defaultProduct.display();
        namedProduct.display();
        pricedProduct.display();
        stockedProduct.display();
    }
}
