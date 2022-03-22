package org.launchcode.java.studios.countingcharacters;

import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;

public class Count {

    /* ***** STUDIO *** ORIGINAL ASSIGNMENT WITHOUT BONUS MISSIONS
    - */

/*
    public static void main(String[] args) {
        String theString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        // take string and convert into an array
        char[] charactersInString = theString.toCharArray();
        // Initialize the HashMap to hold the characters and their count
        HashMap<Character, Integer> charCount = new HashMap<>();

        // loop through the Array of characters
        for (int i = 0; i<charactersInString.length; i++) {
            int count = 1;
            //If the Hashmap already contains the character in one of it's keys, than increase the count by 1,
            // or else, add that character and the count of 1 as a new key/value pair to the charCount HashMap.
            if (charCount.containsKey(charactersInString[i])){
                int newCount;
                newCount = charCount.get(charactersInString[i]) + 1;
                charCount.put(charactersInString[i], newCount);
            }
            else {
                charCount.put(charactersInString[i], count);
            }
        }

        System.out.println(charCount);
    }
*/


    /****** STUDIO *** BONUS MISSIONS */

    public static void main(String[] args) {
        String theString;

        // Ask user for a string.
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string & we can count the occurence of each character in your string: ");
        //Exclude non-alphabetic characters, but only works if it's only non alphabetic characters, not a combo
        if (!input.hasNext("[A-Za-z]*") ) {
            System.out.println("The Character Counter does not count non alphabetic characters. '" + input.nextLine() + "' has been thrown out.");
        }
        theString = input.nextLine();
        //Make the character counts case-insensitive
        theString = theString.toLowerCase();

        // take string and convert into an array
        char[] charactersInString = theString.toCharArray();
        // Initialize the HashMap to hold the characters and their count
        HashMap<Character, Integer> charCount = new HashMap<>();

        // loop through the Array of characters
        for (char c : charactersInString) {
            int count = 1;
            //If the Hashmap already contains the character in one of it's keys, than increase the count by 1,
            // or else, add that character and the count of 1 as a new key/value pair to the charCount HashMap.
            if (charCount.containsKey(c)) {
                int newCount;
                newCount = charCount.get(c) + 1;
                charCount.put(c, newCount);
            } else {
                charCount.put(c, count);
            }
        }

        System.out.println(charCount);
    }



}
