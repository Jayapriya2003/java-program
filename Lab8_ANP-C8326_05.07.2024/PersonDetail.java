// Define the Person interface
interface Person {
    void speak();
}

// Implement the interface in the Student class
class Student implements Person {
    @Override
    public void speak() {
        System.out.println("Student says: Hello!");
    }
}

// Implement the interface in the Teacher class
class Teacher implements Person {
    @Override
    public void speak() {
        System.out.println("Teacher says: Good morning, class!");
    }
}

// Main class to demonstrate the usage
public class PersonDetail{
    public static void main(String[] args) {
        // Create objects of Student and Teacher classes
        Person student = new Student();
        Person teacher = new Teacher();
        
        // Call the speak method on Student object
        student.speak();
        
        // Call the speak method on Teacher object
        teacher.speak();
    }
}
