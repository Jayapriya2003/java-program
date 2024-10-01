// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class extending Animal class
class Dog extends Animal {
    // Overriding sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class extending Animal class
class Cat extends Animal {
    // Overriding sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test the functionality
public class MainSound {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.sound(); 
        myCat.sound(); 
    }
}