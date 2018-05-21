package OOP;

import java.util.Scanner;

public class exceptions {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5};

		try {
			// int x = reader.nextInt();
			// System.out.println(x);
			for(int i=0;i<10;i++){
				System.out.println(array[i]);
			}
		} 
		catch (NullPointerException e) {
			//TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End");
		}
	}

}
