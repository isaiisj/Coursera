public class CaesarCipher {

    //Write down the alphabet
    private String alphabet;
    //Compute the shifted alphabet
    private String shiftedAlphabet;

    private int mainKey;

    //CaesarCipher constructor
    public CaesarCipher(int key){
        this.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        this.mainKey = key;
    }

    // encrypt method
    public String encrypt(String input) {
        // Make passed String dynamically mutable
        StringBuilder encrypted = new StringBuilder(input);
        // For each character
        for (int i = 0; i < encrypted.length(); i++) {
            // Get character
            char ch = encrypted.charAt(i);
            // If char is a letter
            if (Character.isLetter(ch)) {
                // Convert to uppercase (regardless if it is already)
                char chUpper = Character.toUpperCase(ch);
                // Find its position in normal and encrypted abc
                int pos = alphabet.indexOf(chUpper);
                char replace = shiftedAlphabet.charAt(pos);
                // Replace it with letter found in encrypted abc (in correct case)
                if (chUpper == ch) {
                    encrypted.setCharAt(i, replace);
                } else {
                    encrypted.setCharAt(i, Character.toLowerCase(replace));
                }
            }
        }
        return encrypted.toString();
    }

    // decrypt method
    public String decrypt (String input){
        CaesarCipher cc = new CaesarCipher(26 - mainKey);
        return cc.encrypt(input);
    }

}
