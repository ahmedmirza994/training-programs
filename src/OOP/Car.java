package OOP;

public class Car {
    String type;
    int model;
    int tyres;
    double price;
    double milesDrive;
    static String Owner;
    Owners owners; //aggregation
    public Car() {
        System.out.print("Welcome to CarShop ");
        owners = new Owners();
        owners.firstName="Ahmed";
        owners.lastName="Mirza";

        System.out.println(owners.firstName + " " + owners.lastName);
    }

    double getPrice() {
        double newPrice = price-(milesDrive*100);
        return newPrice;
    }

    String getType() {
        return type;
    }

}
