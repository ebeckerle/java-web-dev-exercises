package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        int milesDriven;
        int gasConsumed;
        int milesPerGallon;

        Scanner input1 = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        milesDriven = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("How much gas have you consumed?: ");
        gasConsumed = input2.nextInt();

        input1.close();
        input2.close();

        milesPerGallon = milesDriven / gasConsumed;
        System.out.println("Miles per Gallon: " + milesPerGallon);
    }
}
