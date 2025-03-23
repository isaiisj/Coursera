public class Main {
    public static void main(String[] args) {
        int moneyLeftWithToni = 200;
        if (moneyLeftWithToni >= 300) {
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop some souvenirs");
        }   
        // Put your else-if statements here.
        // Advice: Use best practice and use curly braces always.
        // Tip 1: The 2nd condition needs to be checked for only >=200.
        // Since it moves 1st else-if only when the value is < 300.
        // Tip 2: The 3rd condition needs to be checked for only >=100.
        // Tip 3: The 4th condition needs to be checked for only >=50.
        // Tip 4: Last condition can be an else. It will cover everything.
        else if (moneyLeftWithToni >= 200){
            System.out.println("Go to Hoover Dam");
        }
        else if (moneyLeftWithToni >= 100){
            System.out.println("Go to Area 51");
        }
        else if (moneyLeftWithToni >= 50){
            System.out.println("Have an ice cream");
        }
        else {
            System.out.println("Think about the money spent");
        }

        System.out.println("On trip to parents.");
    }
}
