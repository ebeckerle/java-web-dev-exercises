package exercises.controlflowandcollections;

import java.util.Scanner;


public class Arraypractice {

    public static void main(String[] args) {
        // 1. CREATE and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        double[] practiceArray = new double[]{1, 1, 2, 3, 5, 8};

        System.out.println("Fox keep sleeping please!");
        System.out.println(practiceArray); /* how come this yields the result: [D@e9e54c2 in the console? */
        System.out.println(practiceArray[2]);
        System.out.println(practiceArray[3]);
        System.out.println(practiceArray[4]);
        System.out.println(practiceArray.length);

        // 2. LOOP through the array and print out each value
        for (int i = 0; i<practiceArray.length; i++){
            System.out.println(practiceArray[i]);
        }

        // 2. MODIFY the loop to only print the odd numbers.
        for (int i = 0; i<practiceArray.length; i++){
            if (practiceArray[i] % 2 == 1){
                System.out.println(practiceArray[i]);
            }
        }

        //3. DIVIDE the string at each space and store the individual words in an array
        String foxString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] foxArray = new String[100];
//        foxArray = foxString.split(" ");
        System.out.println(foxString.split(" "));
        System.out.println(foxString);
        System.out.println(foxString.split(" ")[0]);
//        System.out.println(foxString.split(" ").toString(foxString.split(" ")));
    }


}
