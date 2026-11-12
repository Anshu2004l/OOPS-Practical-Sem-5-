

class Vehicle {

    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {

    String model = "Fortuner";

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.start();       // Inherited method
        c1.displayCar();  // Own method
    }
}

