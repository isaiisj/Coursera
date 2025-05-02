// TODO 10: Create a new java class named ShapeMetricCalculator
public class ShapeMetricCalculator {
    // TODO 11: Define a mehtod named calculateRectamgleArea
    // The method is static and return a double type
    // method to calculate the area of a rectangle object
    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    // TODO 12: Define a static mehtod named calculateCircleArea
    // method to calculate the area of a circle object
    public static double calculateCircleArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }
}
