package OOP;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car1 = new Car();
		Car.Owner = "Ahmed";
		// car1.type="BMW";
		// car1.model=2018;
		car1.price=10000;
		car1.milesDrive=23;
		System.out.println(car1.getPrice());

		// System.out.println(car1.getType());
		// System.out.println(car1.Owner);

		// Car car2 = new Car();
		// System.out.println(car2.Owner);

		Truck truck1 = new Truck();
		Truck.Owner="Mirza";
		truck1.tyres=12;
		truck1.type="12 Wheeler";
		truck1.price=12324;
		truck1.milesDrive=23;
		System.out.println(truck1.getType());
		System.out.println(truck1.getPrice());
		System.out.println(truck1.Owner);
	}

}
