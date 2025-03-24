public class Main {
    public static void main(String[] args) {
        // The string given
        String stringToTravel = "TONI says ice cream PER scoop";
        // The variable to count the number of vowels
        int countVowels = 0;
        // Converting the string to its lowercase
        stringToTravel = stringToTravel.toLowerCase();
        for(int indexPosition = 0; indexPosition<stringToTravel.length(); indexPosition++) {
            // this method charAt() returns the character at the index number given
            char ch = stringToTravel.charAt(indexPosition);
            if(! (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch==' ' )) {
                countVowels++;
            }
        }
        System.out.println("The total number of consonants in the String is: " + countVowels);
    }
}
