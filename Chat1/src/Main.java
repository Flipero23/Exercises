import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StoreInventory storeInventory = new StoreInventory();

        System.out.println("Enter details for 3 products:");
        for (int i=0;i<3;i++){
            System.out.println("Product " + (i+1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Stock quantity: ");
            int stockQuantity = scanner.nextInt();
            scanner.nextLine();

            Product product = new Product(name,category,price,stockQuantity);
            storeInventory.addProduct(product);

            System.out.println();

        }

        System.out.println("All products:");
        storeInventory.displayAllProducts();

        System.out.print("\nEnter category to search for: ");
        String search = scanner.nextLine();
        storeInventory.findProductsByCategory(search);

        System.out.print("\nEnter product name to update: ");
        String productName = scanner.nextLine();
        System.out.print("Enter new stock quantity: ");
        int newStock = scanner.nextInt();
        storeInventory.updateStock(productName,newStock);

        System.out.println("\nProducts before sorting: ");
        storeInventory.displayAllProducts();

        System.out.println("\nProducts after sorting: ");
        storeInventory.sortProductsByPrice();
        storeInventory.displayAllProducts();
    }
}