package OOP;

public class innerClass {
    
    class Animal {
        String name;
        String voice;
    }
    
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.name="Lion";
        // animal.voice="hehe";

        // System.out.println(animal.voice);
    }

    void call() {
        Animal animal = new Animal();
        animal.name="Lion";
        animal.voice="hehe";

        System.out.println(animal.voice); 
    }


}
