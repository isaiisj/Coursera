/** TODO 10: Extend the Shape class creating a Circle class **/
public class Circle extends Shape {
    /** TODO 11: Declare an instance variable called radius **/
    private float radius;
    private String color;

    /** TODO 12: Provide a constructor to initialize the object **/
    Circle(float r) {
        this.radius = r;
        this.color = "Red";
    }

    /** TODO 13: Use the formula PI * radius * radius to calculate the area **/
    @Override
    public float calculateArea() {
        float area = (float)Math.PI * this.radius * this.radius;
        return area;
    }

    /** TODO 14: Override the draw mehtod and linecolor **/
    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius= " + this.radius);
    }

    @Override
    public void lineColor() {
        System.out.println("The color of this shape is: " + this.color);
    }

    @Override
    public float calculatePerimeter() {
        float perimeter = 2 * (float)Math.PI * radius;
        return perimeter;
    }
}
