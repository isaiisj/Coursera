/** TODO 2: Declare a Rectangle class
 * that extends form Shape class
 * **/
public class Rectangle extends Shape {
    /** TODO 3: Implement rectangles's properties
     * like width and height and color if you
     * decided your method like color to have an
     * argument or not.
     * **/
    private float width;
    private float height;
    private String color;

    /** TODO 4: Provide with a constructor your
     *  Rectangle class to initialize the object
     * **/
    Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
        this.color = "Blue";
    }

    /** TODO 5: Override calculateArea() methods
     * use the formula area = width * height
     * **/
    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }

    /** TODO 6: Override draw() mehtod
     * the draw() mehtod appears once the user
     * has provided their inputs.
     * You can add the implementation of lineColor too
     * **/
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width= " + this.width + " height= " + this.height);
    }

    @Override
    public void lineColor() {
        System.out.println("The color of this shape is: " + this.color);
    }

    @Override
    public float calculatePerimeter() {
        float perimeter = this.width + this.width + this.height + this.height;
        return perimeter;
    }
}
