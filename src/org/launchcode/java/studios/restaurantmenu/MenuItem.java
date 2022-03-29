package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    //fields
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newMenuItem = false;

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

    //validate that the category is an appetizer, main course or dessert?
}
