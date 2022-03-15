package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        /* DECLARING REFERENCE VARIABLES I thought I needed to find the area of the circle.
        including some I did not use.
         */
        //        int radius;
        double radius;
        double pi = Math.PI;
        int area;



//      /*  YOUR FIRST TASK - prompts user for the radius of a circle and then calculates its area and prints the result
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?: ");
//        /* - decided not to make the reference variable radius an integer, but instead a double
//         - radius = input.nextInt();
//        radius = input.nextDouble();

//
//      /* YOUR NEXT TASK - Add a second Java file to your program to delegate the area calculation away from the printing task.
//
//      /* BONUS MISSIONS - 1 - ADD VALIDATION
        if (input.hasNext("[A-Za-z]*") || input.nextDouble()<= 0  || !input.hasNextDouble()){
            System.out.println("Error");
        } else if (input.hasNextDouble() || input.hasNextInt()){
            radius = input.nextDouble();
            System.out.println("The area of a circle with a radius of " + radius + " is: " + Circle.getArea(radius));
        }


//        if (input.hasNext() || input.nextDouble()<= 0){
//            do {
//                System.out.println("Error, What is the radius of the circle?: ");
////                System.out.println("Error");
//            }while(input.hasNext() || input.nextDouble()<= 0);
//        } else {
//            radius = input.nextDouble();
//            System.out.println("The area of a circle with a radius of " + radius + " is: " + Circle.getArea(radius));
//        }

//        input.close();

//        while (input.hasNext() || input.nextDouble()<=0) {
////            Scanner input = new Scanner(System.in);
//            Scanner newInput = new Scanner(System.in);
//            System.out.println("Error, What is the radius of the circle?: ");
////            newInput.close();
//            if (newInput.nextDouble()>0) {
//                radius = newInput.nextDouble();
//
//                newInput.close();
//            }
//        }

//        do {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Error, What is the radius of the circle?: ");
//        } while (input.hasNext() || input.nextDouble()<=0);

//        if (input.nextDouble()>0) {
//            radius = input.nextDouble();
//            System.out.println("The area of a circle with a radius iof " + radius + " is: " + Circle.getArea(radius));
//        };
//        while (input.hasNext() || input.nextDouble()<=0) {
//           Scanner newInput = new Scanner(System.in);
//           System.out.println("Error, What is the radius of the circle?: ");
//           if (newInput.nextDouble()>0) {
//                break;
//           }
//        };

//        if (input.hasNext() || input.nextDouble()<=0) {
//            while (input.hasNext() || input.nextDouble()<=0) {
//                Scanner newInput = new Scanner(System.in);
//                System.out.println("Error, What is the radius of the circle?: ");
//                if (newInput.nextDouble()>0) {
//                    break;
//                }
//            }
//        }else {
//            radius = input.nextDouble();
//            System.out.println("The area of a circle with a radius iof " + radius + " is: " + Circle.getArea(radius));
//        }

//        Scanner input;
//        do {
//            input = new Scanner(System.in);
//            System.out.println("What is the radius of the circle?: ");
//            if (input.hasNext() || input.nextDouble() <= 0) {
//                System.out.println("Error");
//            }
//            if (input.nextDouble()>0){
//                radius = input.nextDouble();
//                System.out.println("The area of a circle with a radius iof " + radius + " is: " + Circle.getArea(radius));
//                break;
//            }
//
//        } while (input.hasNext() || input.nextDouble() <= 0);


//        System.out.println("Type of : "+ input.getClass().getSimpleName());
//        radius = input.nextDouble();

        input.close();
//        System.out.println("The area of a circle with a radius of " + radius + " is: " + Circle.getArea(radius));

//        area = (int) (pi * radius * radius);
//        System.out.println("Miles per Gallon: " + Circle.getArea(radius));
//        System.out.println("Type of : "+ radius.getClass().getSimpleName());


        //NOTES from CLASS




    }
}
