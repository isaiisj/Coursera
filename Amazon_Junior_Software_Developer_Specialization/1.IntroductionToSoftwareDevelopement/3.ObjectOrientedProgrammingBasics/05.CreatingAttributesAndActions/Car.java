class Car {
    // Attributes (member variables) define a Car's properties
    String make;
    String model;
    String color;
   
   // Method (action) to accelerate the Car
    public void accelerate() {
        System.out.println("The car is accelerating!");
    }

    // Method (action) to turn the Car
    public void turn() {
        System.out.println("The car is turning!");
    }

    // toString method
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
