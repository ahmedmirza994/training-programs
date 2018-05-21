package OOP;

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck1 = new Truck();
		Truck.Owner="Mirza";
		truck1.tyres=12;
		truck1.type="12 Wheeler";
		truck1.price=12324;
		truck1.milesDrive=23;
		// System.out.println(truck1.getType());
		// System.out.println(truck1.getPrice());
		// System.out.println(truck1.Owner);

		Car mycar = (Car)truck1;
		System.out.println(mycar.Owner);
	}

}
