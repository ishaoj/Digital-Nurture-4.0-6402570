
//Step 1 - Understand the Problem:
//Data Structures and Algorithm are important for handling large inventories for efficient management of the data.
//It also helps to add,delete and search the items in the inventory.
//We can make better use of of memory

//The data structures that can be used are Data Structures are:
//Array
//ArrayList
//LinkedList
//Hashmap 

//HashMap would be the best choice because since productID is unique it would enable faster seaching.


//Step 2 - Created a new project


//Step 3 - Implementation
import java.util.HashMap;

//Defining a class Product with attributes like productId, productName, quantity, and price.
public class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    // Constructor
    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}


// The Inventory class is created to manage the collection of all products.
// It provides methods to add, update, and delete products from the inventory efficiently.

class Inventory {
    HashMap<String, Product> products = new HashMap<>();

    // Add product
    public void addProduct(Product product) {
        products.put(product.productId, product);
    }

    // Update product
    public void updateProduct(String productId, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.quantity = quantity;
            product.price = price;
        }
    }

    // Delete product
    public void deleteProduct(String productId) {
        products.remove(productId);
    }
}

// Main class 
class InventoryManagementSystem {
    public static void main(String[] args) {
        // Create Inventory
        Inventory inventory = new Inventory();

        // Add products
        Product product1 = new Product("P001", "Laptop", 10, 55000);
        Product product2 = new Product("P002", "Mouse", 50, 500);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Update product
        inventory.updateProduct("P002", 40, 450);

        // Delete product
        inventory.deleteProduct("P001");
    }
}


//Analysis

//products.put(product.productId, product); 
//Average Case: O(1)
//Worst Case: O(n)

//products.get(productId);
//Average Case: O(1)
//Worst Case: O(n)

//products.remove(productId);
//Average Case: O(1)
//Worst Case: O(n)

//Discuss how you can optimize these operations.
//Use Unique Keys
//Avoid Uncessary lookups
//If you know the size of the invetory, its better to give an initial size to the hashmap
