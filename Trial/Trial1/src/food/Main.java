package food;

import java.util.*;

public class Main {

    private static List<MainDish> mainDishes = new ArrayList<>();
    private static List<Dessert> desserts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu:");
            System.out.println("1. Add Main Dish");
            System.out.println("2. Add Dessert");
            System.out.println("3. Display all menu items");
            System.out.println("4. Find item with longest cook time");
            System.out.println("5. Find most expensive item");
            System.out.println("6. Calculate average price");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addMainDish(scanner);
                    break;
                case 2:
                    addDesert(scanner);
                    break;
                case 3:
                    displayAllItems();
                    break;
                case 4:
                    longestCookTime();
                    break;
                case 5:
                    mostExpensive();
                    break;
                case 6:
                    calculateAveragePrice();
                    break;
                case 7:
                    System.out.println("Exiting the app");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        }

    }


    private static void addMainDish(Scanner scanner){
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Category: ");
        String category = scanner.nextLine();

        System.out.println("Price: ");
        double price = scanner.nextDouble();

        System.out.println("Calories: ");
        int calories = scanner.nextInt();

        System.out.println("Cook time: ");
        int cookTime = scanner.nextInt();

        System.out.println("Is vegetarian?: ");
        boolean vegetarian = scanner.nextBoolean();

        MainDish mainDish = new MainDish(name,category,price,calories,cookTime,vegetarian);
        mainDishes.add(mainDish);
    }

    private static void addDesert(Scanner scanner){
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Category: ");
        String category = scanner.nextLine();

        System.out.println("Price: ");
        double price = scanner.nextDouble();

        System.out.println("Calories: ");
        int calories = scanner.nextInt();

        System.out.println("Sugar content: ");
        int sugar = scanner.nextInt();

        System.out.println("Has nuts?: ");
        boolean nuts = scanner.nextBoolean();

        Dessert dessert = new Dessert(name,category,price,calories,sugar,nuts);
        desserts.add(dessert);
    }

    private static void displayAllItems(){
        System.out.println("List of main dishes: ");
        mainDishes.stream().forEach(mainDish -> mainDish.printDetails());
        System.out.println();

        System.out.println("List of desserts: ");
        desserts.stream().forEach(Dessert::printDetails);
    }

    private static void longestCookTime(){
        MainDish longestCookTimeDish = mainDishes.stream().max(Comparator.comparingInt(dish -> dish.cookTime)).get();

        System.out.println("Dish with longest cook time: ");
        longestCookTimeDish.printDetails();

    }

    private static void mostExpensive(){
        MainDish mostExpensiveMainDish = mainDishes.stream().max(Comparator.comparingDouble(max -> max.price)).get();
        System.out.println("The most expensive main dish is: ");
        mostExpensiveMainDish.printDetails();

        Dessert mostExpensiveDessert= desserts.stream().max(Comparator.comparingDouble(max -> max.price)).get();
        System.out.println("\nMost expensive dessert is: ");
        mostExpensiveDessert.printDetails();

    }

    private static void calculateAveragePrice(){
        double sum = 0.0;
        int count = 0;

        for(MainDish mainDish : mainDishes){
            sum += mainDish.price;
            count++;
        }

        for (Dessert dessert : desserts){
            sum += dessert.price;
            count++;
        }

        double averagePrice = sum/count;
        System.out.println("Average price: " + averagePrice);
    }
}

