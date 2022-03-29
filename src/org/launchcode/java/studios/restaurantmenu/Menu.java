package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Menu {

    private static ArrayList<MenuItem> menu = new ArrayList<>();


    public static void main(String[] args){
        System.out.println("Let's build a menu!");

        //Some Initial Menu Items:
        MenuItem spaghetti = new MenuItem("Spaghetti", 2.0, "with red sauce, extra garlic and sausage crumbles",  "Main Course", true);
        MenuItem bananaBread = new MenuItem("Banana Bread", 1.50, "Delicious",  "Appetizers");

        addMenuItem(spaghetti);
        addMenuItem(bananaBread);

        System.out.println("Here is our Current Menu at the Restaurant:\n");
        printMenu(menu);

        //user input / prompts to construct menu
        //FUTURE TASK: set an addDish variable to false, when true it will run the userInputAddMenuItem function.
        Boolean addDish = false;
        System.out.println("\nWould you like to add a dish to the menu?: Y/N ?");
        Scanner input = new Scanner(System.in);
        if (input.nextLine().equals("Y")){
            addDish = true;
            /* FUTURE TASK: put the following in it's own method, but also within a
            do while loop (while addDish = true, run the do while loop) - ???
             */
            System.out.println("Great! Please enter the name of your new dish:");
            Scanner in = new Scanner(System.in);
            String name;
            name = in.nextLine();
            System.out.println("You are adding "+ name + " to the Menu. What price will it sell for?:");
            double price;
            price = in.nextDouble();
            System.out.println("Great! "+ name + " will sell for $" +price+ ".  Can we add a description of the dish? Please describe "+name+".");
            Scanner inp = new Scanner(System.in);
            String description;
            description = inp.nextLine();
            System.out.println(name+" | "+price+ " : " +description+"\nIs "+name+" an Appetizer, Main Course, or Dessert?");
            Scanner inpu = new Scanner(System.in);
            String category;
            category = inpu.nextLine();


            MenuItem newItem = new MenuItem(name, price, description, category, true);
            addMenuItem(newItem);

        } else {
            System.out.println("OK, the menu will stay the same.");
        }


        //print menu
        printMenu(menu);


    }

    //methods

    public static ArrayList<MenuItem> addMenuItem(MenuItem aMenuItem){
        menu.add(aMenuItem);
        return menu;
    }

    public static ArrayList<MenuItem> deleteMenuItem(MenuItem aMenuItem){
        menu.remove(aMenuItem);
        return menu;
    }

    public static void printMenu(ArrayList<MenuItem> ourMenu){
        System.out.println("Appetizers:");
        for (MenuItem item : ourMenu) {
            if (item.getCategory().equals("Appetizers")) {
                System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription());
            }
        }
        System.out.println("\nMain Course:");
        for (MenuItem item : ourMenu) {
            if (item.getCategory().equals("Main Course")) {
                System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ "+ item.getDescription());
            }
        }
        System.out.println("\nDesserts:");
        for (MenuItem item : ourMenu){
            if (item.getCategory().equals("Dessert")){
                System.out.println(item.getName()+ " | $"+ item.getPrice()+"\n ~ "+item.getDescription());
            }
        }
    }

}
