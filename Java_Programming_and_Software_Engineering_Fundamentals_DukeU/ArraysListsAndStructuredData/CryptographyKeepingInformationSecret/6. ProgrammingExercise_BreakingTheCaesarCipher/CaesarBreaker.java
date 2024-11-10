/**
 * Assignment 2
 */
public class CaesarBreaker {


    //countLetters Method
    public int countLetters(String s) {
        // Create an array for frecuencies with lenth of 26
        int[] freqs = new int[26];
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // For every character in the string
        for (int i = 0; i < s.length(); i++) {
            // Extract ith character
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

    //maxIndex Method
    private int maxIndex(int[] count){
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            max = Math.max(max,count[i]);
        }
        return max;
    }


    //halfOfString Method
    public String halfOfString(String message, int start){
        String halved = "";
        for (int i = start; i < message.length(); i += 2) {
            halved += message.charAt(i);
        }
        return halved;
    }


    //getKey Method
    public int getKey(String s) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Calculate the index of the encrypted letter in String s that is most likely to be E
        int maxIndex = countLetters(s);
        // Calculate the shift between indexes of encrypted letter and E in the alphabet
        int key = maxIndex - alphabet.indexOf('E');

        System.out.println("The encrypted string: " + s);
        System.out.println("The letter with the highest frequency: " + alphabet.charAt(maxIndex));

        // Return key
        if (key > 0) {
            return key;
        } else {
            return 26 + key;
        }
    }

    //decryptTwoKeys Method
    public String decryptTwoKeys(String encrypted) {
        //Split the string in two strings
        String halved1 = halfOfString(encrypted, 0);
        String halved2 = halfOfString(encrypted, 1);
        int key1 = getKey(halved1);
        int key2 = getKey(halved2);
        System.out.println("The two keys found: " + key1 + ", " + key2);
        CaesarCipher cc = new CaesarCipher();
        String message = cc.encryptTwoKeys(encrypted, 26 - key1, 26 - key2);
        return message;
    }


    //decryptTwoKeys Method
    // To decrypt a specific example because decryption currently only works based on
    // the assumption that the most frequent letter is always E we need to pass key1
    // and key2 as inputs.
    public String decryptTwoKeysInput(String encrypted,int key1, int key2) {
        //Split the string in two strings
        String halved1 = halfOfString(encrypted, 0);
        String halved2 = halfOfString(encrypted, 1);
        System.out.println("The two keys found: " + key1 + ", " + key2);
        CaesarCipher cc = new CaesarCipher();
        String message = cc.encryptTwoKeys(encrypted, 26 - key1, 26 - key2);
        return message;
    }


}
