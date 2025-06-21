import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null; // not found
    }

    // Binary Search   
    public static Product binarySearch(Product[] products, String targetName) {
        // Sort array by productName (case-insensitive)
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = targetName.compareToIgnoreCase(products[mid].productName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }

        return null; // not found
    }

    
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "T-shirt", "Clothing"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Blender", "Kitchen")
        };

        String searchTerm = "T-shirt";  

        System.out.println("Linear Search");
        Product result1 = linearSearch(products, searchTerm);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("Binary Search");
        Product result2 = binarySearch(products, searchTerm);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
