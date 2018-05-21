package HelloWorld;

public class ByteShortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int minValue = -2147483648; // 2.471B to -2.471B
		//int maxValue = 2147483647;
		//byte minByteValue = -128;
		//byte maxByteValue = 127;
		byte byteVar = 100;
		short shortVar = 1000;
		int intVar = 100000;
		
		long longVar = 50000 + 10 * (byteVar + shortVar + intVar);
		System.out.println(longVar);

		float pound = 0.45359237f;

		double kilo = (pound * 200);
		System.out.println(kilo);
		
	}

}
