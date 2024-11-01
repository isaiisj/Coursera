/*
* Programming Excercise: Implementing the Caesar Cipher
* */
public class Main {
    public static void main(String[] args) {
        // Testing Assignment 1
        WordPlay test1 = new WordPlay();
        System.out.println(test1.isVowel('A'));
        System.out.println(test1.replaceVowels("Hello World",'*'));
        System.out.println(test1.emphasize("Mary Bella Abracadabra",'a'));

        // Testing Assignment 2
        CaesarCipher cesar = new CaesarCipher();
        System.out.println(cesar.encrypt("FIRST LEGION ATTAK EAST FLANK!",23));
        System.out.println(cesar.encrypt("First Legion",23));
        System.out.println(cesar.encrypt("First Legion",17));
        System.out.println(cesar.encryptTwoKeys("First Legion",23,17));
    }
}
