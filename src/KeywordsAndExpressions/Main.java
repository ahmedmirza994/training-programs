package KeywordsAndExpressions;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        // a mile is equal to 1.609344km
        double km = (100 * 1.609344);
        int highScore = 50;
        
        if (highScore == 50) {
            System.out.println("this is an expression");
        }

        System.out.print("Enter DOB: ");
        int DOB = reader.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - DOB;
        System.out.println("Your age is " + age);
    }
}
