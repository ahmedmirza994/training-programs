package OOP;

public class Truck extends Car {
    private boolean hasTruck;

    public Truck (){
        System.out.println("Welcome to TruckShop");
    }
    
    @Override
    double getPrice() {
        double newPrice = price-(milesDrive*50);
        return newPrice;
    }

}
