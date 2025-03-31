public class KitchenHelper {
    // Write the method signature here
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

    public static void main(String[] args) {
    	// calling the method
        // Replace this argument with your own value
        
        spiceUpDish(3);
    }
}
