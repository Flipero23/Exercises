import java.util.ArrayList;
import java.util.Comparator;

public class StoreInventory {
    ArrayList<Product> products;

    public StoreInventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void displayAllProducts(){
        for(int i=0;i< products.size();i++){
            System.out.println("Product " + (i+1) + " details:");
            System.out.println(products.get(i));
            System.out.println();
        }
    }

    public void findProductsByCategory(String category){
        boolean found = false;
        for (int i=0;i< products.size();i++){
            if(products.get(i).getCategory().equalsIgnoreCase(category)){
                System.out.println("Matching products:");
                System.out.println("Name: " + products.get(i).name);
                System.out.println("Category: " + products.get(i).category);
                System.out.println("Price: " + products.get(i).price);
                System.out.println("Stock quantity: " + products.get(i).stockQuantity);
                System.out.println();
                found = true;
            } else if (!found) {
                System.out.println("No product of that category found!");
            }
        }
    }

    public void updateStock(String productName, int newStockQuantity){
        boolean found = false;
        for (int i=0; i< products.size(); i++){
            if(products.get(i).getName().equalsIgnoreCase(productName)){
                products.get(i).setStockQuantity(newStockQuantity);
                System.out.println("Updated product details for " + productName + ":");
                System.out.println("Name: " + products.get(i).name);
                System.out.println("Category: " + products.get(i).category);
                System.out.println("Price: " + products.get(i).price);
                System.out.println("Stock quantity: " + products.get(i).stockQuantity);
                System.out.println();

                found = true;

            } else if (!found) {
                System.out.println("Product not found!");
            }
        }
    }

    public void sortProductsByPrice(){
        products.sort(Comparator.comparing(Product::getPrice));
    }
}
