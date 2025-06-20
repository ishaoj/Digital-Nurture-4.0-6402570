//Big O Notation analyzes the worst case time complexity of an algorithm.
//Time complexity of Linear Search is O(n) and that of Binary Search is O(log n)
//Binary Search would be better if we had sorted array.

// Product class with attributes
class Product {
    String productId;
    String productName;
    String category;

    // Constructor
    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

// Search class with Linear and Binary Search implementations
public class ProductSearch{

    // Linear Search Method
    public static int linearSearch(Product[] products, String targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId.equals(targetId)) {
                return i; // Product found at index i
            }
        }
        return -1; // Product not found
    }

    // Binary Search Method (Assumes array is sorted by productId)
    public static int binarySearch(Product[] products, String targetId) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int comparison = products[mid].productId.compareTo(targetId);

            if (comparison == 0) {
                return mid; // Product found at index mid
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Product not found
    }
}
