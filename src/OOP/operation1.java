package OOP;

public class operation1  {

	// @Override
	// public int sum(int n1, int n2) {
	// 	// TODO Auto-generated method stub
	// 	return n1+n2;
	// }

	// @Override
	// public int sub(int n1, int n2) {
	// 	// TODO Auto-generated method stub
	// 	return n1-n2;
	// }

	// @Override
	// public double div(int n1, int n2) {
	// 	// TODO Auto-generated method stub
	// 	return n1/n2;
	// }

	// @Override
	// public int mul(int n1, int n2) {
	// 	// TODO Auto-generated method stub
	// 	return n1*n2;
	// }

	public static void main(String[] args) {

		// operation1 add = new operation1();

		// System.out.println(add.sum(4, 3));

		operation op = (int n1, int n2) -> (n1 + n2);

		System.out.println(op.sum(5, 54));

	}

}
