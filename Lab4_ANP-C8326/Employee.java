class Employee {
    // Member variables
    int id;
    String name;

    // Parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display the details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        Employee obj1 = new Employee(201, "jaya");
        Employee obj2 = new Employee(202, "priya");

        // Displaying the details of the objects
        obj1.display();
        obj2.display();
    }
}