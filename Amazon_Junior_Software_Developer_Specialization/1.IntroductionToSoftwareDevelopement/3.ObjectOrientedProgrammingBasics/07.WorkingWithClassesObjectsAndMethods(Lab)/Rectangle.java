// TODO 1: Create a java class named Rectangle
public class Rectangle {
    // TODO 2: Declare two member variables of double type
    // length: Stores the length of the rectangle
    // Stores the width of the rectangle
    // member variables to store the length and width of a rectangle
    double length;
    double width;

    // TODO 3: Add a No-argument constructor r that enables you
    //  to create a rectangle object without specifying an initial
    //  value for its properties.
    // No-argument constructor with default values
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // TODO 4: a Parameterized constructor that helps you have
    //  control over the initial state of your objects.
    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
