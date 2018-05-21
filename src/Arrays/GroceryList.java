package Arrays;

import java.util.ArrayList;

public class GroceryList {
    //private int[] myNumbers = new int[50];
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void addGroceryItem(String item) {
        groceryList.add(item); 
    }

    public static void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            groceryList.set(position , newItem);
            System.out.println("Grocery item " + (position+1) + " has been modified.");   
        }
        else {
            System.out.println("Item not found to modify.");
        }
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        //String theItem = groceryList.get(position);
        if (position >= 0) {
            groceryList.remove(position);
            System.out.println(item + " is removed from " + position+1 + " position."); 
        }
        else {
            System.out.println("Item not found to modify.");
        }
        
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem); 
    }

    public static void main(String[] args) {
    
    }
}
