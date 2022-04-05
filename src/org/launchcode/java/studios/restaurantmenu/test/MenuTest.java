package org.launchcode.java.studios.restaurantmenu.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studios.restaurantmenu.Menu;
import org.launchcode.java.studios.restaurantmenu.MenuItem;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MenuTest {

    MenuItem test_menu_item;
    MenuItem test_menu_item2;
    ArrayList<MenuItem> test_menu = new ArrayList<>();
    @Before
    public void createMenuItem(){test_menu_item = new MenuItem("French Fries", 1.75, "Crispy, soft & Warm with our special blend of spices", "Appetizer", true);}
    public void createMenuItem2(){test_menu_item2 = new MenuItem("Cheeseburger", 2.25, "Vegetarian burger on whole wheat bun", "Main Course", true);}


//TESTS
//- add a menu item to the menu with user input
    @Test
    public void testAddMenuItem(){
        ArrayList<MenuItem> expected = new ArrayList<>();
        expected.add(test_menu_item);
        test_menu = Menu.addMenuItem(test_menu_item);
        assertEquals(expected, test_menu);
    }

//- remove a menu item from the menu with user input

    @Test
    public void testDeleteMenuItem(){
        ArrayList<MenuItem> expected = new ArrayList<>();
        expected.add(test_menu_item);
        expected.add(test_menu_item2);
        expected.remove(test_menu_item);
        test_menu = Menu.addMenuItem(test_menu_item);
        test_menu = Menu.addMenuItem(test_menu_item2);
        test_menu = Menu.deleteMenuItem(test_menu_item);
        assertEquals(expected, test_menu);
    }


//-if new menu item user inputs puts in a category other than appetizer, main course, or dessert,
//return I am sorry, that is not an item we can put on our menu, bc we don't have a "user input" category.
//
//-if new menu item user inputs is already on the menu in some form or another - the names are
//the same, accounting to be case-insensitive, and for any extra spaces in the string
//
//- will print individual menu item
//
//- will print complete menu
//
//- when printing the full menu, the date of the last menu update is displayed
//
//- do the new menu items print with the "*NEW" designation?

}
