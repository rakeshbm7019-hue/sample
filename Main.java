// Simple OOP Example
class Car {
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    void drive() {
        System.out.println(brand + " is driving!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);

        // Call methods
        car1.drive();
        car2.drive();
    }
}
