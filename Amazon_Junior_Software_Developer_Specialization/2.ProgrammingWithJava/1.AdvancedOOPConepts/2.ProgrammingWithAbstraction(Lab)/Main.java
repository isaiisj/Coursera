import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /** TODO 7: Ask the user to input a specific width and height
         * as well as the color if you decided to implement it
         * **/
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle: ");
        System.out.print("Enter Width:");
        float w = keyBoard.nextFloat();
        System.out.print("Enter height: ");
        float h = keyBoard.nextFloat();

        /** TODO 8: The next step is to use variables
         * to initialize the Rectangle object.
         * **/
        Rectangle rct = new Rectangle(w,h);

        /** TODO 9: Call the overridden methods **/
        rct.draw();
        System.out.println("Area: " + rct.calculateArea());
        System.out.println("Area: " + rct.calculatePerimeter());
        rct.lineColor();

        /** TODO 15: Ask the user to input the radius **/
        System.out.println("Calculating Area of Circle: ");
        System.out.println("enter radius: ");
        float r = keyBoard.nextFloat();

        /** TODO 16: Construct a circle based on the user's inputs **/
        Circle cr = new Circle(r);

        /** Todo 17: Call the overridden methods **/
        cr.draw();
        System.out.println("Area: " + cr.calculateArea());
        System.out.println("Perimeter: " + cr.calculatePerimeter());
        cr.lineColor();

        /**TODO 18: Run the program, the input should look like the one below
         * Calculating Area of Rectangle:
         * Enter Width:20
         * Enter height: 30
         * Drawing Rectangle with width=20.0 height=30.0
         * Area: 600.0
         * Calculating Area of Circle:
         * Enter radius:5
         * Drawing Circle with radius=5.0
         * Area: 78.53982
         * **/

        /** TODO 19: Implement an abstract method in the Rectangle and
         * Circle class, anc call the methods in the main class. Remember
         * the formula for perimeters.
         * Rectangle: perimeter = width+ width + height + height
         * Circle: perimeter = 2 * Math.PI * radius
         * **/

    }
}
