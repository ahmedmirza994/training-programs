package Arrays;

import java.util.Scanner;

public class Main {
    private static Scanner reader = new Scanner(System.in);
    // public static void main(String[] args) {
        
    //     int[] myIntArray = new int[10];
    //     for (int i = 0; i < myIntArray.length; i++) {
    //         myIntArray[i] = i * 10;
    //     }
    //     printArray(myIntArray);    
    // }

    // public static void printArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println("Element " + i + ", value is " + array[i]);
    //     }
    // }
    
    // public static void main(String[] args) {
    //     int[] myIntegers = getIntegers(5);
    //     for (int i = 0; i < myIntegers.length; i++) {
    //         System.out.println("Element " + i + ", value is " + myIntegers[i]);
    //     }
    //     System.out.println("The Average is: " + getAvg(myIntegers));
    // }

	// private static int[] getIntegers(int number) {
    //     System.out.println("Enter " + number + " integer values. \r");
    //     int[] values = new int[number];
    //     for (int i = 0; i < values.length; i++) {
    //         values[i] = reader.nextInt();
    //     }
    //     return values;
    // }
    
    // public static double getAvg(int[] array) {
    //     int sum= 0;
    //     for (int i = 0; i < array.length; i++) {
    //         sum = sum + array[i];
    //     }
    //     return (double) sum / (double)array.length;
    // }
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        // int[] array = new int[5];
        // getIntegers(array);
        // printArray(array);
        // sortIntegers(array);
        boolean quit = false;
        int choice = 0;
            printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: " );
            choice = reader.nextInt();

            switch (choice) {
                case 0:
                    printInstruction();
                break;            
                case 1:
                    GroceryList.printGroceryList();
                break;
                case 2:
                    addItem();
                break;
                case 3:
                    modifyItem();
                break;
                case 4:
                    removeItem();
                break;
                case 5:
                    searchItem();
                break;
                case 6:
                    quit = true;
                break;     
            }
        }

    }

    public static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please Enter the grocery Item: ");
        GroceryList.addGroceryItem(reader.next());
    }

    public static void modifyItem() {
        System.out.print("Enter Old Item: ");
        String oldItem = reader.next();
        System.out.print("Enter New Item: ");
        String newItem = reader.next();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter Item.");
        String removeItem = reader.next();
        groceryList.removeGroceryItem(removeItem);
    }

    public static void searchItem() {
        System.out.println("Enter an item for Search.");
        String search = reader.next();
        if(groceryList.findItem(search) >= 0){
            System.out.println("Found " + search + " in our grocery list.");
        } else {
            System.out.println("No item found.");
        }

    }
    // private static int[] getIntegers(int[] array) {
        
    //     System.out.println("Enter Array Values.\r");
    //     for (int i = 0; i < array.length; i++) {
    //         array[i] = reader.nextInt(); 
    //     }
    //     return array;
    // }

    // private static void printArray(int[] array) {
    //     System.out.println("Array before Sorted: ");
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println(i + " element is "+ array[i]);
    //     }
    // }
    
    // private static void sortIntegers(int[] array) {
    //     int temp;
    //     System.out.println("Array after Sorted: ");
    //     for (int i = 0; i < array.length; i++) {
    //         for (int j = 0; j < array.length-1; j++) {
    //             if(array[j] < array[j+1]){
    //                 temp = array[j];
    //                 array[j] = array[j+1];
    //                 array[j+1] = temp;
    //             }
                
    //         }
    //     }
    // 	for (int i = 0; i < array.length; i++) {
    //         System.out.println(i + " element is "+ array[i]);
    //     }
    // }
    



}
