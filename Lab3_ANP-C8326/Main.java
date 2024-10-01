// Define a class Car
class Car{
    String brand;
    String model;
    int year;

    // Constructor with brand, model, and year parameters
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Constructor with brand and model parameters (defaulting year to 2023)
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 2023; // Default value for year
    }

    // Method to display car information
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// Main class to test the Car class
public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Tesla", "Model 3");

        // Displaying information using displayInfo method
        car1.displayInfo();
        car2.displayInfo();
    }
}
