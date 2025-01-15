package food;

public class Dessert extends MenuItem{
    protected int sugarContent;
    protected boolean hasNuts;

    public Dessert(String name, String category, double price, int calories, int sugarContent, boolean hasNuts) {
        super(name, category, price, calories);
        this.sugarContent = sugarContent;
        this.hasNuts = hasNuts;
    }

    public Dessert() {
    }

    @Override
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
        System.out.println("Sugar content: " + sugarContent);
        System.out.println("Has nuts?: " + hasNuts);
    }

    @Override
    double getPrice() {
        return price;
    }
}
