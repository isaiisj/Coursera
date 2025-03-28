/** TODO 1: Import the Scanner **/
import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        /** TODO 2: Create a Scanner variable named "keyboard" **/
        Scanner keyboard = new Scanner(System.in);
        int subChoice;

        /** TODO 3: A variable for getting the day of the week is given below **/
        /**     Initialize the variable to have the value 1 **/
        /** 1- is Monday, 2- is Tuesday and so on **/
        int dayOfTheWeek;
        dayOfTheWeek = 1;

        /** TODO 4: Display a menu to get the day of the week from the user **/
        /**

         ********** MENU *****************
         These are the choices for week of the day. \n Please enter only values from 1-7:
         1. MONDAY
         2. TUESDAY
         3. WEDNESDAY
         4. THURSDAY
         5. FRIDAY
         6. SATURDAY
         7. SUNDAY
         ***********************************

         **/

        System.out.println("************* MENU ***************");
        System.out.println("These are the choices for week of the day\n" +
                "Please enter only values from 1-7");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("WEDNESDAY");
        System.out.println("THURSDAY");
        System.out.println("FRIDAY");
        System.out.println("STAURDAY");
        System.out.println("SUNDAY");

        /** TODO 5: Prompt Toni for input. Also let Toni know the valid choices like (1-7). **/
        System.out.println("Enter your choice of the day (1-7): ");
        dayOfTheWeek = keyboard.nextInt();

        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
        /**         for the input in "dayOfTheWeek" **/
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println("******* SUB MENU FOR MONDAY ********");
                System.out.println("1. Yes, I had my breakfast");
                System.out.println("2. No, I would like one");
                System.out.println("************************************");
                System.out.println("Enter your choice: ");
                subChoice = keyboard.nextInt();
                if (subChoice == 1) {
                    System.out.println("Good, Now you have a catchup meeting at 9AM Prepare your notes");
                } else if (subChoice == 2) {
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                }else {
                    System.out.println("NO such choice available");
                }
                break;

            /** TODO 6(a): Implement all other cases for Tuesday to Sunday **/
            case 2:
                System.out.println(("Tuesday"));
                System.out.println("What language you'll use today?");
                System.out.println("1. C++");
                System.out.println("2. Java");
                subChoice = keyboard.nextInt();
                switch (subChoice){
                    case 1:
                        System.out.println("You chose C++");
                        break;

                    case 2:
                        System.out.println("You chose Java");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
                break;

            case 3:
                System.out.println("Wednesday");
                System.out.println("What type of design you'll use?");
                System.out.println("1. Simple Design");
                System.out.println("2. Complex Design");
                subChoice = keyboard.nextInt();
                if (subChoice == 1) {
                    System.out.println("Let's keep it simple");
                } else if (subChoice == 2) {
                    System.out.println("You like complex things ehh?");
                } else {
                    System.out.println("No valid choice");
                }
                break;

            case 4:
                System.out.println("Thursday");
                System.out.println("What IDE you'll use");
                System.out.println("1. IntelliJ");
                System.out.println("2. Eclipse");
                System.out.println("3. VS Code");
                subChoice = keyboard.nextInt();
                switch (subChoice) {
                    case 1:
                        System.out.println("Wow! Best choice at all");
                        break;

                    case 2:
                        System.out.println("A bit outdated...");
                        break;

                    case 3:
                        System.out.println("The second best choice");
                        break;

                    default:
                        System.out.println("Invalid option");
                }
                break;

            case 5:
                System.out.println("Friday");
                System.out.println("were there errors in tests?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                subChoice = keyboard.nextInt();
                if (subChoice == 1) {
                    System.out.println("Cool go home");
                } else if (subChoice == 2) {
                    System.out.println("Oh No got a problem");
                } else {
                    System.out.println("what does that mean?");
                }
                break;

            case 6:
                System.out.println("Saturday");
                System.out.println("where are you gonna chill at?");
                System.out.println("1. at home");
                System.out.println("2. in a bar");
                System.out.println("3. with friends");
                System.out.println("4. at a nightclub");
                subChoice = keyboard.nextInt();
                switch (subChoice){
                    case 1:
                        System.out.println("wanna netflix recommendation? ");
                        break;

                    case 2:
                        System.out.println("Cool!, maybe a gin and tonic?");
                        break;

                    case 3:
                        System.out.println("Cool!");
                        break;

                    case 4:
                        System.out.println("Take care");
                        break;

                    default:
                        System.out.println("Invalid option");
                }
                break;

            case 7:
                System.out.println("Sunday");
                System.out.println("Just relax today");
                break;

            /** TODO 6(b): Implement "default" to handle Toni entering  **/
            /**            values less than 1 or more than 7 **/

            default:
                System.out.println("Invalid value");
        }

        /** TODO 7: Introduce a "break" after each case code, except the last  **/

        /** TODO 8: Go below the TODO 2 after the creation of Scanner variable  **/
        /**         and declare a variable "subChoice" **/

        /** TODO 9: Move below the display "Monday: It is back to work....." **/
        /**         in case 1 and create a menu  **/
        /** The sub-menu inside case 1 show appear as below:

         *********** SUB MENU FOR MONDAY ******
         * 1. Yes, I had my breakfast
         2. No, I would like one
         **************************************

         **/

        /** TODO 10: After the sub-menu inside case 1, prompt for input on choice **/
        /**         from Toni and store it in the variable subChoice **/

        /** TODO 11: Display appropriate response to Toni, based on value in **/
        /**          variable subChoice using if, if-else, else **/
        /**
         1. When subChoice has value of 1 display -
         Good. Now you have a catchup meeting at 9AM Prepare your notes

         2. When subChoice has value of 2 display -
         Lets us divert on Highway 54 and have a Burger on the drive in

         3. When subChoice has any other value then 1 or 2 display -
         NO such choice available
         **/

        /** TODO 12: On Tuesday ask Toni whether the language he'll be using during **/
        /** coding time is C++ or Java? Then on Wednesday, when Toni designs **/
        /** ask if he uses a "Simple Design" or "Complex Design". Once Toni **/
        /** starts coding on Thursday, you could ask him if the IDE is  **/
        /** "IntelliJ", "Eclipse" or "VS Code". Finally, on Friday, when he runs **/
        /** tests, ask if there were errors in the tests. **/

        /** TODO 13: For case 2 (Tuesday), case 4 (Thursday), and case 7 (Sunday)**/
        /** use a nested switch statement **/
        /** For the remaining days (case 1, case 3, case 5, and case 6) **/
        /** the activities are straightforward and do not depend on another variable **/
        /** so a simple if-else statement is used. **/

    } //end of main method

} //end of the main class
