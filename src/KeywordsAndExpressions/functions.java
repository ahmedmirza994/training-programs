package KeywordsAndExpressions;

public class functions {
    int sum = 0;
    public void Draw() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void sum() {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }
    
    public void sum(int x, int y) {
        int a = x;
        int b = x;
        sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // new functions().Draw();
        // new functions().Draw();
        // new functions().Draw();
        new functions().sum();
        new functions().sum(4,4);
    }
}
