package food;

public abstract class MenuItem {
    protected String name;
    protected String category;
    protected double price;
    protected int calories;
    abstract void printDetails();
    abstract double getPrice();

    public MenuItem(String name, String category, double price, int calories) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.calories = calories;
    }

    public MenuItem() {
    }
}
