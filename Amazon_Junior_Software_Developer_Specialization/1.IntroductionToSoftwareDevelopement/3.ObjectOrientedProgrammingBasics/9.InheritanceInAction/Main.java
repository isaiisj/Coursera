public class Main {
    public static void main(String[] args) {

        // Create a Car object using the parameterized constructor
        Car tesla = new Car("Tesla", "Model S", "Red");

        // Use inherited methods
        tesla.accelerate();		
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.brake();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.adjustSeat(2);

    }
}
