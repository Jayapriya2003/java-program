class Shape {
    // Method in the superclass
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    // Overriding the draw method in the subclass
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    // Overriding the draw method in the subclass
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class MainShape {
    public static void main(String[] args) {
        Shape myShape = new Shape();       // Create a Shape object
        Shape myCircle = new Circle();     // Create a Circle object
        Shape myRectangle = new Rectangle(); // Create a Rectangle object

        myShape.draw();      // Calls the method from Shape class
        myCircle.draw();     // Calls the overridden method from Circle class
        myRectangle.draw();  // Calls the overridden method from Rectangle class
    }
}