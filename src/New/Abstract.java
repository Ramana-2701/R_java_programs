package New;

abstract class Shape { // Abstract class
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Concrete method
    public void displayColor() {
        System.out.println("Color: " + color);
    }

    // Abstract method (no implementation)
    abstract double calculateArea();
}

class Circle extends Shape { // Subclass extending Shape
    double radius;

    public Circle(String color, double radius) {

        //Invoking the Constructor in abstract class using "Super" Keyword.
        super(color);
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Abstract {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayColor();
        System.out.println("Area: " + circle.calculateArea());
    }
}
