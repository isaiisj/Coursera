/**
 * Assignment 2: Caesar Cipher
 */

import edu.duke.*;

public class CaesarCipher {


    // Encrypt method modified to manage Upper and Lower
    public String encrypt(String input, int key){
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+
                alphabet.substring(0,key);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = Character.toUpperCase(encrypted.charAt(i));
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(idx != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //If currChar is already Upper
                if(currChar == encrypted.charAt(i)) {
                    //Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i,newChar);
                }else {
                    encrypted.setCharAt(i,Character.toLowerCase(newChar));
                }
            }
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }


    public void testCaesar(){
        int key = 12;
        FileResource fr = new FileResource("TextToEncrypt.txt");
        String message = fr.asString();
        String encrypted = encrypt(message,key);
        System.out.println("Key is " + key + "\n" + encrypted);
    }


    //EncryptTwoKeys Methods
    public String encryptTwoKeys(String input, int key1, int key2){
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Compute the shifted alphabet
        String shiftedAlphabet1 = alphabet.substring(key1)+
                alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0,key2);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = Character.toUpperCase(encrypted.charAt(i));
            //Find the index of currChar in alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(Character.isLetter(encrypted.charAt(i))){
                char replace;
                //Replace the ith character of  encrypted with newChar
                if(i%2 == 0){
                    //Get the idxth character of shiftedAlphabet1
                    replace = shiftedAlphabet1.charAt(idx);
                }else{
                    //Get the idxth character of shiftedAlphabet2
                    replace = shiftedAlphabet2.charAt(idx);
                }
                if(currChar == encrypted.charAt(i)){
                    encrypted.setCharAt(i,replace);
                }else{
                    encrypted.setCharAt(i,Character.toLowerCase(replace));
                }
            }
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }


}
