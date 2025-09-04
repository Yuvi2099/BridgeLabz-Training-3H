package constructor.Instance(vs)Class;

import java.util.*;

class ProductModel {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    ProductModel() {
        this("Unknown", 0.0);
    }

    ProductModel(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        ProductModel p1 = new ProductModel();
        ProductModel p2 = new ProductModel("Laptop", 1200.0);
        ProductModel p3 = new ProductModel("Phone", 800.0);

        System.out.println("Product Details:");
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        System.out.println();
        ProductModel.displayTotalProducts();
    }
}

