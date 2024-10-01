// Vehicle class
class Vehicle {
    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }
}

// Speed class (assuming it stores speed related information)
class Speed {
    private double currentSpeed;

    public Speed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }
}

// Van class extending Vehicle and containing Speed as a property
class Van extends Vehicle {
    private Speed speed;

    public Van(String manufacturer, int year, Speed speed) {
        super(manufacturer, year);
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }

    // Method to print details of Van object
    public void printDetails() {
        System.out.println("Van Details:");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Year: " + getYear());
        System.out.println("Current Speed: " + speed.getCurrentSpeed());
    }
}

// Main class to demonstrate the usage
public class Main2 {
    public static void main(String[] args) {
        // Create a Speed object
        Speed vanSpeed = new Speed(60.5); // Example speed value

        // Create a Van object
        Van myVan = new Van("Ford", 2020, vanSpeed);

        // Print details of the Van object
        myVan.printDetails();
    }
}