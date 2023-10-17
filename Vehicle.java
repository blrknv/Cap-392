class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println("Starting the " + year + " " + brand + " vehicle.");
    }

    void stop() {
        System.out.println("Stopping the " + year + " " + brand + " vehicle.");
    }
}

class Car extends Vehicle {
    Car(String brand, int year) {
        super(brand, year);
    }

    void accelerate() {
        System.out.println("Accelerating the " + year + " " + brand + " car.");
    }

    void brake() {
        System.out.println("Applying brakes to the " + year + " " + brand + " car.");
    }
}

public class  Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);

        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
    }
}
