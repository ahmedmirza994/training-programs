package KeywordsAndExpressions;

import java.util.Scanner;

public class Switch {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Index : ");
        int index = reader.nextInt();

        switch (index) {
            case 1: //block of code
                System.out.println("He is male");
                break;
            case 2:
                System.out.println("She is female");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }

}
