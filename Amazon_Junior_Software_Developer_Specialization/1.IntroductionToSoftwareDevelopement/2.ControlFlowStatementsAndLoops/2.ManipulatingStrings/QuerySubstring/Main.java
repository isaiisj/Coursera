public class Main {
    public static void main(String[] args) {


        //set the default string value
        String stringToBeDisplayed = "Next year, please";

        //set string that is set by you
        String howWasLastYear = "he was good in his activities";

        //check if the string "howWasLastYear" has the word "good" 
        //in it (it is case sensitive)
        if(howWasLastYear.contains("good")) {

            //if the word "good" is found change the value to be displayed
            stringToBeDisplayed = "You get a gift from Santa";

        }

        // this area is the common area after the "if" condition
	      // which is always executed 
        System.out.println("Santa's Result: " + stringToBeDisplayed);
    }
}
