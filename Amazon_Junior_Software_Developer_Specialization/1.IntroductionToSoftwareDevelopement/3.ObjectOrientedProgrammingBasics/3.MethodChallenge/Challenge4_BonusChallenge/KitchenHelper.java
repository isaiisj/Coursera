public class KitchenHelper {
    // Your method signature
    public static double calculateIngredientQuantity(int servings, double originalQuantity)
    {
        // Your code here!
        // Calculate the adjusted ingredient quantity
        double adjustedQuantity = servings * originalQuantity;
        // replace 0.0 with the adjusted quantity
        return adjustedQuantity;
    }

    // Your method signature
    public static void spiceUpDish(int spiceLevel)
    {
        // Your code here!
        // Print a message suggesting spices based on the spiceLevel
        switch(spiceLevel){
            case 1:
                System.out.println("You can add some salt and pepper.");
                break;
            case 2:
                System.out.println("You can add some paprika and cumin.");
                break;
            case 3:
                System.out.println("You can add some chili powder and garlic powder.");
                break;
            case 4:
                System.out.println("You can add some cayenne pepper and curry powder.");
                break;
            case 5:
                System.out.println("You can add some ghost pepper and habanero pepper");
            default:
                System.out.println("Invalid spice level. Please enter a number between 1 and 5");
        }
    }

    // Your method signature
    public static void greetGuest(String name, String timeOfDay)
    {
        // Your code here!
        // Print a personalized greeting based on arguments
        System.out.println("Hi " + name + " , Good " + timeOfDay + "!");
    }

    public static void main(String[] args) {
        // calling the methods with different arguments

        // Replace these arguments with your own values
        double newQuantity = calculateIngredientQuantity(4, 2.5);
        System.out.println("The new quantity is: " + newQuantity);

        spiceUpDish(3);
        
        greetGuest("Harry", "Morning");
    }
}
