package OOP;

public class generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a1={"Ahmed","Ali","Arslan"};
		Integer[] a2={1,2,3,4,5};
		print(a1);
		print(a2);
	}

	static <T>void print(T[] arg) {
		for (T s : arg) {
			System.out.println(s);
		}
	}

}
