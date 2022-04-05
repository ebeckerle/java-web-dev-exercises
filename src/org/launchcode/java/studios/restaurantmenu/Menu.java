package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Date;

public class Menu {

    private static ArrayList<MenuItem> menu = new ArrayList<>();


    public static void main(String[] args){
        System.out.println("Let's build a menu!");

        //Some Initial Menu Items:
        MenuItem spaghetti = new MenuItem("Spaghetti", 2.0, "with red sauce, extra garlic and sausage crumbles",  "Main Course", true);
        MenuItem bananaBread = new MenuItem("Banana Bread", 1.50, "Delicious",  "Appetizers", false);

        addMenuItem(spaghetti);
        addMenuItem(bananaBread);

        System.out.println("Here is our Current Menu at the Restaurant:\n");
        printMenu(menu);
        System.out.println("\nWould you like to add a dish to the menu?: Y/N ?");
        Scanner input = new Scanner(System.in);
        String response;
        response = input.nextLine();
        MenuItem newMenuItem = new MenuItem();

        do {
//            MenuItem newMenuItem = new MenuItem();
            System.out.println("Great! Please enter the name of your new dish:");
            Scanner in = new Scanner(System.in);
            String name;
            name = in.nextLine();
            newMenuItem.setName(name);

            System.out.println("You are adding "+ name + " to the Menu. What price will it sell for?:");
            double price;
            price = in.nextDouble();
            newMenuItem.setPrice(price);

            System.out.println("Great! "+ name + " will sell for $" +price+ ".  Can we add a description of the dish? Please describe "+name+".");
            Scanner inp = new Scanner(System.in);
            String description;
            description = inp.nextLine();
            newMenuItem.setDescription(description);

            System.out.println(name+" | "+price+ " : " +description+"\nIs "+name+" an Appetizer, Main Course, or Dessert?");
            Scanner inpu = new Scanner(System.in);
            String category;
            category = inpu.nextLine();
            if (MenuItem.validateCategory(category)){
                newMenuItem.setCategory(category);
            }else{
                System.out.println("I am sorry, that is not an item we can put on our menu, bc we don't have a "+category+ " category.");
            }

            newMenuItem.setNewMenuItem(true);
            addMenuItem(newMenuItem);
//            printMenuItem(newMenuItem);
            printMenu(menu);
//            response = "N";

        } while (response.equals("Y"));

//        printMenu(menu);

    }


// OLD MAIN _____________________________
//    public static void main(String[] args){
//        System.out.println("Let's build a menu!");
//
//        //Some Initial Menu Items:
//        MenuItem spaghetti = new MenuItem("Spaghetti", 2.0, "with red sauce, extra garlic and sausage crumbles",  "Main Course", true);
//        MenuItem bananaBread = new MenuItem("Banana Bread", 1.50, "Delicious",  "Appetizers", false);
//
//        addMenuItem(spaghetti);
//        addMenuItem(bananaBread);
//
//        System.out.println("Here is our Current Menu at the Restaurant:\n");
//        printMenu(menu);
//
//        //user input / prompts to construct menu
//        //FUTURE TASK: set an addDish variable to false, when true it will run the userInputAddMenuItem function.
//        Boolean addDish = false;
//        System.out.println("\nWould you like to add a dish to the menu?: Y/N ?");
//        Scanner input = new Scanner(System.in);
//        if (input.nextLine().equals("Y")){
//            addDish = true;
//            /* FUTURE TASK: put the following in it's own method, but also within a
//            do while loop (while addDish = true, run the do while loop) - ???
//             */
//            System.out.println("Great! Please enter the name of your new dish:");
//            Scanner in = new Scanner(System.in);
//            String name;
//            name = in.nextLine();
//            System.out.println("You are adding "+ name + " to the Menu. What price will it sell for?:");
//            double price;
//            price = in.nextDouble();
//            System.out.println("Great! "+ name + " will sell for $" +price+ ".  Can we add a description of the dish? Please describe "+name+".");
//            Scanner inp = new Scanner(System.in);
//            String description;
//            description = inp.nextLine();
//            System.out.println(name+" | "+price+ " : " +description+"\nIs "+name+" an Appetizer, Main Course, or Dessert?");
//            Scanner inpu = new Scanner(System.in);
//            String category;
//            category = inpu.nextLine();
//
//
//            MenuItem newItem = new MenuItem(name, price, description, category, true);
//            addMenuItem(newItem);
//
//        } else {
//            System.out.println("OK, the menu will stay the same.");
//        }
//
//
//        //print menu
//        printMenu(menu);
//
//
//    }

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
                if (item.getNewMenuItem()){
                    System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription()+"*NEW");
                } else {
                    System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription());
                }
            }
        }

        System.out.println("\nMain Course:");
        for (MenuItem item : ourMenu) {
            if (item.getCategory().equals("Main Course")) {
                if (item.getNewMenuItem()){
                    System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription()+"*NEW");
                } else {
                    System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription());
                }
            }
        }
        System.out.println("\nDesserts:");
        for (MenuItem item : ourMenu){
            if (item.getCategory().equals("Dessert")){
                if (item.getNewMenuItem()){
                    System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription()+"*NEW");
                } else {
                    System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription());
                }
            }
        }

        System.out.println("This Menu was last Updated: " + new Date());
    }

    public static void printMenuItem(MenuItem item){
        if (item.getNewMenuItem()){
            System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription()+"*NEW");
        } else {
            System.out.println(item.getName() + " | $"+ item.getPrice()+"\n ~ " + item.getDescription());
        }

    }

}
