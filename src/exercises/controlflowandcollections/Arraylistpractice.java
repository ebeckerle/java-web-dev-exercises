package exercises.controlflowandcollections;

import java.util.ArrayList;

public class Arraylistpractice {

    public static void main(String[] args) {
    // 1. WITHIN MAIN CREATE a list with at least 10 integers and call your method on the list.(findSumEvenNumbers() method)
        // saw this syntax on geeks for geeks, thought it looked DRYier than using add(), but can't get it to work?? (Iam only seeing the .asList with Strings???
//        ArrayList<Integer> arrayListPractice = new ArrayList<Integer>(
//                Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
//        );
        ArrayList<Integer> arrayListPractice = new ArrayList<Integer>();
        arrayListPractice.add(1);
        arrayListPractice.add(1);
        arrayListPractice.add(2);
        arrayListPractice.add(3);
        arrayListPractice.add(5);
        arrayListPractice.add(8);
        arrayListPractice.add(13);
        arrayListPractice.add(21);
        arrayListPractice.add(34);
        arrayListPractice.add(55);
        arrayListPractice.add(89);



//        System.out.println(arrayListPractice.findSumEvenNumbers(arrayListPractice));

    }

}
