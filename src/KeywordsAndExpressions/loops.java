package KeywordsAndExpressions;

public class loops {
    public static void main(String[] args) {
        
        int array[] = {1,3,2,4,5};
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int var : array) {
            System.out.println(var);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
