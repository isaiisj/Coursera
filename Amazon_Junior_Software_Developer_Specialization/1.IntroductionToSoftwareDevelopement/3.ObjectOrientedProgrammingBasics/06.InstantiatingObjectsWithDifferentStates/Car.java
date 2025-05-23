class Car {
    // Attributes (member variables) define a Car's properties
    String make;
    String model;
    String color;

     // No-argument constructor (no parameters)
    public Car() {
        this.make = "Unknown"; // Set a placeholder make
        this.model = "Unknown"; // Set a placeholder model
        this.color = "Black"; // Set a default color
    }

    // Parameterized constructor to initialize with specific values
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    // Method (action) to accelerate the Car
    public void accelerate() {
        System.out.println("The car is accelerating!");
    }

    // Method (action) to turn the Car
    public void turn() {
        System.out.println("The car is turning!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
