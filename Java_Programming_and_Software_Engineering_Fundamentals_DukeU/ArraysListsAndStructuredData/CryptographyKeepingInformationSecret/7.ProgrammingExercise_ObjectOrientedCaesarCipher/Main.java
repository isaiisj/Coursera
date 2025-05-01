public class Main {
    public static void main(String[] args) {
        /*
        String message = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        CaesarCipher cc = new CaesarCipher(15);
        String encrypted = cc.encrypt(message);
        System.out.print("The encrypted message is: ");
        System.out.println(encrypted);

        // Decrypt file using the same key it was encrypted with
        String decrypted = cc.decrypt(encrypted);
        System.out.print("The decrypted message is: ");
        System.out.println(decrypted);

        TestCaesarCipher test = new TestCaesarCipher();
        test.breakCaesarCipher(encrypted);*/


        String message2 = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        CaesarCipherTwo cc2 = new CaesarCipherTwo(21, 8);
        String encryptedFile2 = cc2.encrypt(message2);
        System.out.println("The encrypted file: ");
        System.out.println(encryptedFile2);

        // Decrypt file using the same keys it was encrypted with
        String decryptedFile2 = cc2.decrypt(encryptedFile2);
        System.out.println("The decrypted file: ");
        System.out.println(decryptedFile2);


        TestCaesarCipherTwo test2 = new TestCaesarCipherTwo();
        test2.breakCaesarCipherTwo(encryptedFile2);
    }
}
