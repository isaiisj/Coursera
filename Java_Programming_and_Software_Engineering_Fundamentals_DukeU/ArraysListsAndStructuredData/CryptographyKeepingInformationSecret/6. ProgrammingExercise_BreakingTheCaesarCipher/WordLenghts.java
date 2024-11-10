/**
 * Assignment 1
 */

import edu.duke.FileResource;
public class WordLengths {


    // countWordLengths Method
    private void countWordLengths(FileResource resource, int[] counts){
        // For every word in the file
        for(String word : resource.words()){
            int len = 0;
            // For every letter in the word
            for (int i = 0; i < word.length(); i++) {
                // Get ith character
                char ch = word.charAt(i);
                //End when find a non character
                if(!Character.isLetter(ch)){
                    break;
                }
                len++;
            }
            // Add 1 to the element in counts that has the same length
            // If len is larger than the last index, then count it as the largest index
            //[0,0,0,0,1,...,0] First word Laer.
            //[0,0,1,0,1,0,...,0] Second word My
            int lastIndex = counts.length - 1;
            //System.out.println("lastIndex: " + lastIndex);
            //System.out.println("Len: " + len);
            //System.out.println(word);
            if (len > lastIndex){
                counts[lastIndex]++;
            }else{
                counts[len]++;
            }
        }
    }


    // testCountWordLength Method
    public void testCountWordLengths(String filename){
        //Create File Resource to read txt
        FileResource file = new FileResource(filename);
        //Create an Array to store integers
        int[] counts = new int[31];
        //Call method countWordLengths
        countWordLengths(file, counts);

        // Print information about the word lengths
        System.out.println("Note this file has words that are:");
        /*Arrays are passed by reference so once a function modifies
         *an array we just can se the info or do something else.
         * */
        for (int k = 0; k < counts.length; k++) {
            if (counts[k] > 0) {
                System.out.println(counts[k] + " words of length " + k);
            }
        }
        System.out.println("The most common word length in the file is " + indexOfMax(counts));

    }


    // indexOfMax Method
    private int indexOfMax(int[] values){
        int max = 0;
        for (int i = 0; i < values.length; i++) {
            max = Math.max(max,values[i]);
        }
        return max;
    }


}
