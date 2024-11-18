import edu.duke.FileResource;

/**
 * Programming Excercise: Breaking the Caesar Cipher
 */
public class Main {
    public static void main(String[] args) {

        // Testing Assignment 1
        WordLengths word = new WordLengths();
        word.testCountWordLengths("smallHamlet.txt");
        word.testCountWordLengths("romeo.txt");
        word.testCountWordLengths("lotsOfWords.txt");

        //Testing Assignment 2
        CaesarBreaker breaker = new CaesarBreaker();
        System.out.println(breaker.halfOfString("Qbkm Zgis",0));
        System.out.println(breaker.halfOfString("Qbkm Zgis",1));
        System.out.println(breaker.decryptTwoKeysInput("Top ncmy qkff vi vguv vbg ycpx",2,20));


        /*
        for (int i = 0; i < 26; i++) {
            for (int k = 25; k >= 0; k--){
                System.out.println(breaker.decryptTwoKeysInput("Akag tjw Xibhr awoa aoee xakex znxag xwko",i,k));
                System.out.println("\n");
            }
        }*/
        

        /*
        for (int i = 0; i < 26; i++) {
            for (int k = 25; k >= 0; k--){
                //Testing the first five words of mysteryTwoKeysPractice.txt file
                //17,4 key found
                System.out.println(breaker.decryptTwoKeysInput("Xifqvximt tsdtlxzrx iijirvtl ek Uybi",i,k));
                System.out.println("\n");
            }
        }*/


    }
}
