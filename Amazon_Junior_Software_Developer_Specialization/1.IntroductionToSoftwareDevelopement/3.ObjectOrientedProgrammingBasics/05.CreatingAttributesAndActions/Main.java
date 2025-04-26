public class Main {
    public static void main(String[] args) {
        // Create a red Colorado
        Car colorado = new Car();
        colorado.make = "Chevrolet";
        colorado.model = "Colorado";
        colorado.color = "Red";

        // Create a blue Mustang
        Car mustang = new Car();
        mustang.make = "Ford";
        mustang.model = "Mustang";
        mustang.color = "Blue";
        
       // Make the Colorado accelerate
        colorado.accelerate();

       // Make the Mustang turn
        mustang.turn();

        // Print the Colorado
        System.out.println(colorado);

       // Print the Mustang
        System.out.println(mustang);
    }
}
