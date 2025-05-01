import edu.duke.FileResource;

public class TestCaesarCipher {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // countLetters method
    private int countLetters(String s) {
        int[] freqs = new int[26];
        // For every character in the string
        for (int i = 0; i < s.length(); i++) {
            // Extract character
            char ch = s.charAt(i);
            // If character is a letter
            if (Character.isLetter(ch)) {
                // Identify its position in the alphabet
                int index = alphabet.indexOf(Character.toUpperCase(ch));
                // Use this position to update its freq in the freqs array
                freqs[index]++;
            }
        }
        // Return the index of the largest letter frequency
        return maxIndex(freqs);
    }

    // maxIndex method
    private int maxIndex(int[] values){
        // set max to first index
        int max = 0;
        // foreach to set max number
        for (int value: values) {
            max = Math.max(max,value);
        }
        return max;
    }

    // breakCaesarCipher
    public void breakCaesarCipher(String input){
        // Calculate the frequency of all letters using countLetters and
        // compute the index of the largest frequency using maxIndex
        int index = countLetters(input);
        int shift = index - alphabet.indexOf('E');

        // Use the shift to determine the key
        int key;
        if (shift > 0) {
            key = shift;
        } else {
            key = 26 + shift;
        }

        // Create a CaesarCipher object with that key and call decrypt on input
        CaesarCipher cc = new CaesarCipher(key);
        String decrypted = cc.decrypt(input);

        System.out.println("The decrypted message: ");
        System.out.println(decrypted);
    }

    /*
    // simpleTests method
    public void simpleTests(){
        //FileResource fr = new FileResource();
        //String message = fr.asString();

        String message = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        CaesarCipher cc = new CaesarCipher(18);
        String encrypted = cc.encrypt(message);
        System.out.print("The encrypted message is: ");
        System.out.println(encrypted);

        // Decrypt file using the same key it was encrypted with
        String decrypted = cc.decrypt(encrypted);
        System.out.print("The decrypted message is: ");
        System.out.println(decrypted);

        // Decrypt file by determining the key it was encrypted with
        breakCaesarCipher(encrypted);
    }*/
}
