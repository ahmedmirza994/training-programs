package KeywordsAndExpressions;

public class pholimor {

	double div(double n1, double n2) {
		double r = n1 + n2;
		return r;
	}
	double div(int n1, int n2) {
		double r = n1 + n2;
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = new pholimor().div(5, 3);
		System.out.println(r);
		r = new pholimor().div(4, 2);
		System.out.println(r);

		pholimor phol = new pholimor();
		System.out.println(phol.div(3, 3)); 
	}

}
