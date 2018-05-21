package KeywordsAndExpressions;

import java.util.Scanner;

public class Arrays {
    static Scanner reader  = new Scanner(System.in);
    public static void main(String[] args) {
        String jobs[] = new String[3];
        // for (int i = 0; i < jobs.length; i++) {
        //     jobs[i] = reader.nextLine();
        // }

        jobs[0] = "Developer";
        jobs[1] = "Programmer";
        jobs[2] = "Tester";

        for (int i = 0; i < jobs.length; i++) {
            System.out.print(i + " job is : " + jobs[i]);
            System.out.print(" \t len : " + jobs[i].length());
            System.out.print(" \t First Character : " + jobs[i].charAt(0));
            System.out.print(" \t Last Character : " + jobs[i].charAt(jobs[i].length()-1) + "\n");
        }


    }
}
