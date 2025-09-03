package oops.level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItemDetails() {
        System.out.println("Item Details:");
        System.out.println("Code  : " + itemCode);
        System.out.println("Name  : " + itemName);
        System.out.println("Price : " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class TrackInventory{
    public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 50.0);
        Item item2 = new Item(102, "Pen", 10.0);

        item1.displayItemDetails();
        System.out.println("Total cost for 5 units: " + item1.calculateTotalCost(5));
        System.out.println("------------------------");
        item2.displayItemDetails();
        System.out.println("Total cost for 12 units: " + item2.calculateTotalCost(12));
    }
}

