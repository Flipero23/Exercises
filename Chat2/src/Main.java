import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vehicle 1:");
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Doors: ");
        int doors = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nVehicle 2:");
        System.out.print("Model: ");
        String model2 = scanner.nextLine();
        System.out.print("Manufacturer: ");
        String manufacturer2 = scanner.nextLine();
        System.out.print("Cargo capacity: ");
        double cargoCapacity = scanner.nextDouble();
        System.out.println();

        Car car = new Car(model,manufacturer,doors);
        Truck truck = new Truck(model2,manufacturer2,cargoCapacity);

        Main main = new Main();

        Vehicle[] vehicles = {car, truck};

        main.displayAllVehicles(vehicles);

    }

    public void displayAllVehicles(Vehicle[] vehicles){
        for (int i=0;i< vehicles.length;i++){
            vehicles[i].displayInfo();
            if(vehicles[i]instanceof Car){
                ((Car) vehicles[i]).playMusic();
            } else if (vehicles[i] instanceof Truck) {
                ((Truck) vehicles[i]).loadCargo();
            }
            System.out.println();
        }
    }
}

