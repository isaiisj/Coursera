/**
* Assignment 1: Word Play
 */
public class WordPlay {


    // isVowel Method
    public boolean isVowel(char ch){
        // Define our vowels
        String vowels = "AEIOU";
        // Upper case the input to avoid mistakes
        ch = Character.toUpperCase(ch);
        // Check each vowel
        for(int k = 0; k < vowels.length(); k++){
            // If so return true
            if(vowels.charAt(k) == ch){
                return true;
            }
        }
        return false;
    }


    // replaceVowel Method
    public String replaceVowels(String phrase, char ch){
        // we'll use the method we did before -->  isVowel()
        // Iterate through the string phrase
        for(int k = 0; k < phrase.length();k++){
            //If it is a vowel
            if(isVowel(phrase.charAt(k))){
                char c = phrase.charAt(k); // Save kth vowel char
                phrase = phrase.replace(c,ch); // Update phrase
            }
        }
        return  phrase;
    }


    // emphasize Method
    public String emphasize(String phrase,char ch){
        // Create string builder
        StringBuilder emphasize = new StringBuilder(phrase);
        // Iterate the phrase
        for(int k = 0; k < emphasize.length() ;k++){
            char phraseCh = emphasize.charAt(k); // Save kth char of StrBuilder
            // Lower case the character and check if is ch
            if(Character.toLowerCase(phraseCh) == ch){
                // If divisible by 2 put *
                if(k % 2 == 0){
                    emphasize.setCharAt(k, '*'); //Update char
                }
                //Else put +
                else{
                    emphasize.setCharAt(k, '+'); // Update char
                }
            }
        }
        return  emphasize.toString();
    }


}

