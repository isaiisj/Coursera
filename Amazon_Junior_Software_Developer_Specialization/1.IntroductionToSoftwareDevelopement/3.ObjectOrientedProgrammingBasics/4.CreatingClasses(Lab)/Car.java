// TODO 1: Use intelliJ to create a new project called car-simulation-project

// TODO 2: Click on src folder and select new Java class

// TODO 3: Create a class called Car

public class Car {
    // TODO 4: Create variables with apropiate data types (make, model, color, year)
    String make; // stores the car's make (like Ford, Toyota)
    String model; // stores the car's specific model name (like Mustang, Camry)
    String color; // stores the car's color (like Red, Silver)
    int year; // stores the car's manufacturing year (like 2020)

    // TODO 5: Create a method named getCarDetails inside Car class and return a String
    public String getCarDetails() {
        // build, and return a string by building each car property with a label
        // and using new line character \n
        return "Make: " + make + "\nModel: " + model + "\nColor: " +
                color + "\nYear: " + year;
    }

}
