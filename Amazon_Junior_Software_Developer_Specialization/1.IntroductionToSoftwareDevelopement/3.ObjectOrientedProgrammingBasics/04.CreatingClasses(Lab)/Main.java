// TODO 6: Create a new java class named Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** TODO 7: Inside main method declare a Car reference variable named **/
        /** myFirstCar and initizalize it with an object using the new keyword **/
        Car myFirstCar = new Car();

        // TODO 8: Assign values to the variables of the Car using dot operator
        myFirstCar.make = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.color = "Black";
        myFirstCar.year = 2019;

        // TODO 9: Call the getCarDetails method myFirstCar using dot operator

        // display the car details for myFirstCar
        myFirstCar.getCarDetails();

        // TODO 10: Inside the main method, declare an array of car objects, and name ir cars of size 5
        Car[] cars = new Car[5];

        // Todo 11: Import Scanner before main method and delcare it
        Scanner scanner = new Scanner(System.in);

        // Todo 12: Write a for loop inside the main method to loop through th cars arrays

        // loop through the array of cars
        for(int index = 0; index < 5; index++) {
            // Todo 13: Inside the loop, create a new car object using index position

            // prompt the user for make, model, color and year ans assign the variables to the car
            cars[index] = new Car(); // create a new car object at current index

            // prompt the user for details
            System.out.println("Enter details for car " + (index + 1));

            //get user input and assign to 'make' of the car object at current index
            System.out.println("Make: ");
            cars[index].make = scanner.nextLine();

            // repeat for model, color and year
            System.out.println("Model: ");
            cars[index].model = scanner.nextLine();

            System.out.println("Color: ");
            cars[index].color = scanner.nextLine();

            System.out.println("Year: ");
            cars[index].year = scanner.nextInt();

            // consume the newLine character after nextInt()
            scanner.nextLine();
        }

        /** TODO 14: Inside the main method, write another for loop to iterate **/
        /** thorugh the cars arrays. call getCarDetails method, store the return **/
        /** value from the method in a variable called carDetails and print it **/

        // call getCarDetails for each car object in the collection
        System.out.println("Your Car Collection");
        for(int index = 0; index < 5; index++) {
            String carDetails = cars[index].getCarDetails();
            System.out.println(carDetails);
        }
    }
}
