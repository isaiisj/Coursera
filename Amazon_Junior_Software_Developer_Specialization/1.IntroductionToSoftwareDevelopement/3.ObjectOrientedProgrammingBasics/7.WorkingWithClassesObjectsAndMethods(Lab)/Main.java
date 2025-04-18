// TODO 8: Create a new java class named Main
public class Main {
    public static void main(String[] args) {
        // TODO 9: Declare a Rectangle refernce variable, named
        // rectangle, and Circle reference variable named circle
        // Create a Rectangle object with specified length and width
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Create a Circle object with specified radius
        Circle circle = new Circle(3.0);

        // TODO 13: call the calculateRectangleArea mehtod, pass the
        // rectangle reference as an argument, and store the result un
        // a double type of a variable
        // … (Rectangle and Circle objects defined as before)
        //Calculate the area of the rectangle, and store the result in a variable
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);

        // TODO 14: call the calculateCircleArea method, and store the result in a double
        // type of variable
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        // TODO 15: print the respective areas of Rectangle and CIrcle
        System.out.println("Area of Rectangle: " + areaOfRectangle);
        System.out.println("Area of circle: " + areaOfCircle);
    }
}
