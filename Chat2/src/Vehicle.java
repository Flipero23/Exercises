public class Vehicle {
    protected String model;
    protected String manufacturer;

    public Vehicle(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void displayInfo(){
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class Car extends Vehicle{
    protected int numDoors;

    public Car(String model, String manufacturer, int numDoors) {
        super(model, manufacturer);
        this.numDoors = numDoors;
    }

    public void playMusic(){
        System.out.println("The car's music system is playing!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numDoors);
    }
}

class Truck extends Vehicle{
    protected double cargoCapacity;

    public Truck(String model, String manufacturer, double cargoCapacity) {
        super(model, manufacturer);
        this.cargoCapacity = cargoCapacity;
    }

    public void loadCargo(){
        System.out.println("The truck is loading cargo!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo capacity: " + cargoCapacity + "kg");
    }
}
