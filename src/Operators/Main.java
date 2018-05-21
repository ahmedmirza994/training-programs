package Operators;

public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = "+result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result +=2;
        System.out.println("Result is now " + result);
        result *=10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        result = Math.abs(-23123);
        System.out.println("Result is now " + result);
        //if statements
        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien");
            isAlien = true;
        if (isAlien) {
            System.out.println("It is an alien");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("Hot Dogs!!! A Century");
        }
        //AND
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore != 100)) {
            System.out.println("Top score greater than Second Top Score and equal to 100");
        }
        //OR 
        if ((topScore > secondTopScore) || (topScore != 100)) {
            System.out.println("Top score greater than Second Top Score and equal to 100");
        }
        Boolean isCar = false;
        Boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("it is true");
        }

        double var = 20;
        double secondVar = 80;

        double output = (var + secondVar) * 25;

        output = output % 40;
        if (output <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}
