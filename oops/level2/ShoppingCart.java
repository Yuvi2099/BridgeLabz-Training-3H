package oops.level2;

import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items;

    ShoppingCart() {
        items = new ArrayList<>();
    }

    void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println("Item added to cart: " + itemName);
    }

    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println("Item removed from cart: " + itemName);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in cart: " + itemName);
        }
    }

    void displayTotalCost() {
        double total = 0;
        System.out.println("Items in Cart:");
        for (CartItem item : items) {
            System.out.println(item.itemName + " | Price: " + item.price + " | Quantity: " + item.quantity + " | Total: " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;

        do {
            System.out.println("----- Shopping Cart Menu -----");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    cart.addItem(name, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayTotalCost();
                    break;

                case 4:
                    System.out.println("Exiting shopping cart.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}

