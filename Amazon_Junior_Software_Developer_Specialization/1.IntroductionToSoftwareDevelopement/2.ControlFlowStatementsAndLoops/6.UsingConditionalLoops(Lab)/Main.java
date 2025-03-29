import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);


        while (choice != 5) {

            // TODO 2: Display the current state of the car (engine state, gear, speed)
            System.out.println("---- Car Dashboard ----");
            System.out.println("Speed: " + speed);
            System.out.println("Gear: " + gear);
            System.out.println("Car on: " + isEngineOn);

            // TODO 3: Add print statements for each variable you want to display or options available to the user
            // 1. Turn on/off the engine
            // 2. Change gear (P, D, R)
            // 3. Accelerate
            // 4. Brake
            // 5. Exit
            System.out.println("Menu");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. brake");
            System.out.println("5. Exit");

            // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
            System.out.println("Enter your choice: ");
            choice = keyboard.nextInt();

            // TODO 5: Implement a switch statement to handle the different menu choices
            switch (choice) {
                case 1:
                    isEngineOn = !isEngineOn;
                    break;

                case 2:
                    System.out.println("Enter gear (P, D, R): ");
                    gear = keyboard.next().toUpperCase();
                    break;

                case 3:
                    if (isEngineOn && !gear.equals("P")) {
                        speed += 10; // speed = speed+10
                    } else {
                        System.out.println("Cannot accelerate while engine is off or in Park (P) gear.");
                    }
                    break;

                case 4:
                    if (!isEngineOn && speed == 0) {
                        System.out.println("Car is not moving");
                    }else if(isEngineOn && speed != 0) {
                        speed -= 10;
                    }
                    break;

                case 5:
                    choice = 5;
                    break;

                default:
                    System.out.println("Choose a valid option");
            }

        }


        // TODO 6: Make sure the program runs until the user decides it's time to stop.
        //  Consider enclosing TODO 2 -> TODO 5 above in a while loop!


    }
}
