package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the Rectangle?: ");
        length = input.nextInt();


        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the width of the Rectangle?: ");
        width = input2.nextInt();

        input.close();
        input2.close();

        area = length * width;
        System.out.println("The Area of your Rectangle is: " + area);
    }
}
