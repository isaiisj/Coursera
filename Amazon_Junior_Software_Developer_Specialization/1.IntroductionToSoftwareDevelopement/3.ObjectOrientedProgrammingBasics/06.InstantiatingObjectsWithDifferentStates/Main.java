public class Main {
    public static void main(String[] args) {
        // Create a red Colorado with a no-argument constructor
        Car colorado = new Car();
        // Change the default make "Unknown" to "Chevrolet"
        colorado.make = "Chevrolet";
        // Change the default model "Unknown" to "Colorado"
        colorado.model = "Colorado";
        // Change the default color "Black" to "Red"
        colorado.color = "Red";

       // Make the Colorado accelerate
       colorado.accelerate();
       
       // Create a blue Mustang with the parameterized constructor
       Car mustang = new Car("Ford", "Mustang", "Blue");

       // Make the Mustang turn
       mustang.turn();

       // Print the Colorado
       System.out.println(colorado);

       // Print the Mustang
       System.out.println(mustang);

    }
}
