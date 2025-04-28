public class KitchenHelper {
    // Write the method signature here
    public static void greetGuest(String name, String timeOfDay)
    {
        // Your code here!
        // Print a personalized greeting based on arguments
	    // For example, Hi Bob, Good Afternoon!
        System.out.println("Hi " + name + " , Good " + timeOfDay + "!");
    }

    public static void main(String[] args) {
    	// calling the method
        // Replace these arguments with your own values
        
        greetGuest("Harry", "Morning");
    }
}
