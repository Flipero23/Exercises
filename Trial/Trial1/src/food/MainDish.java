package food;

public class MainDish extends MenuItem{
    protected int cookTime;
    protected boolean isVegetarian;

    public MainDish(String name, String category, double price, int calories, int cookTime, boolean isVegetarian) {
        super(name, category, price, calories);
        this.cookTime = cookTime;
        this.isVegetarian = isVegetarian;
    }

    public MainDish() {
    }

    @Override
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
        System.out.println("Cook time: " + cookTime);
        System.out.println("Is vegetarian?: " + isVegetarian);
    }

    @Override
    double getPrice() {
        return price;
    }
}
