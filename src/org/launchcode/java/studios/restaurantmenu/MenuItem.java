package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.demos.lsn4classes2.Course;

import java.util.Locale;

public class MenuItem {

    //fields
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newMenuItem;

    //constructors
    public MenuItem (String name, Double price, String description, String category, Boolean newMenuItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newMenuItem = newMenuItem;
    };

    public MenuItem(String name, Double price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    };

    public MenuItem(String name, Double price){
        this.name = name;
        this.price = price;
    };

    public MenuItem(){};




    //GETTERS
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public Boolean getNewMenuItem(){
        return newMenuItem;
    }

    //SETTERS
    public void setName(String aName) {
        name = aName;
    }
    public void setPrice(Double aPrice) {
        price = aPrice;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNewMenuItem(Boolean newMenuItem) {
        this.newMenuItem = newMenuItem;
    }


    // METHODS
    //equals()
    public boolean equals(Object toBeCompared){
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        MenuItem theMenuItem = (MenuItem) toBeCompared;
        if (theMenuItem.getName() == getName() && theMenuItem.getCategory()==getCategory()){
            return true;
        }else{
            return false;
        }
    }

//    public static boolean isMenuItemNew(MenuItem toBeCompared){
//        MenuItem theMenuItem = (MenuItem) toBeCompared;
//        if (theMenuItem.getNewMenuItem() == getNewMenuItem()){
//            return true;
//        }else{
//            return false;
//        }
//    }

    //validate that the category is an appetizer, main course or dessert?
    public static boolean validateCategory(String userCategoryInput){
        String userInput = userCategoryInput.toLowerCase();
        if (userInput.equals("appetizer") || userInput.equals("main course") || userInput.equals("dessert")){
            return true;
        }else{
            return false;
        }

    }
}
