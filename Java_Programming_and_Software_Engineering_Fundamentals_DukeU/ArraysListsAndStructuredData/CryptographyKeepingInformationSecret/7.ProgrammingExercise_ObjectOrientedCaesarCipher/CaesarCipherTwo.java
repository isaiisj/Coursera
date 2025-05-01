public class CaesarCipherTwo {
    private String alphabet;
    private String shiftedAlphabet1;
    private String shiftedAlphabet2;
    private int mainKey1;
    private int mainKey2;

    // Constructor
    public CaesarCipherTwo(int key1, int key2){
        this.shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0,key1);
        this.shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0,key2);
        this.mainKey1 = key1;
        this.mainKey2 = key2;
    }

    // encrypt method
    public String encrypt(String input){
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
                // Find its position in normal abc
                int pos = alphabet.indexOf(chUpper);
                // Find it in one of the encrypted alphabets, depending on index
                char replacee;
                if (i % 2 == 0) {
                    replacee = shiftedAlphabet1.charAt(pos);
                } else {
                    replacee = shiftedAlphabet2.charAt(pos);
                }
                // Replace it with letter found in encrypted abc (in correct case)
                if (chUpper == ch) {
                    encrypted.setCharAt(i, replacee);
                } else {
                    encrypted.setCharAt(i, Character.toLowerCase(replacee));
                }
            }
        }
        return encrypted.toString();
    }

    // decrypt method
    public String decrypt(String input){
        CaesarCipherTwo cc2 = new CaesarCipherTwo(26 - mainKey1, 26 - mainKey2);
        return cc2.encrypt(input);
    }


}
