public class Product {
    protected String name;
    protected String category;
    protected double price;
    protected int stockQuantity;

    public Product(String name, String category, double price, int stockQuantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void displayProductInfo(){
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Stock quantity: " + stockQuantity);
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nCategory: " + category + "\nPrice: " + price + "\nStock quantity: " + stockQuantity;
    }
}
