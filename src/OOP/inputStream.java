package OOP;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class inputStream {

	public static void main(String[] args) throws Exception {
		
		//streamWrite("Aleem");
		streamRead();

	}

	public static void streamWrite(String str) {
		try {
			File file = new File("file.txt");

			FileOutputStream stream = new FileOutputStream(file);
			//String data = "Hello World!!!";

			byte[] content = str.getBytes();

			stream.write(content);
			//stream.flush();
			stream.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("File write successfully");
		}
	}

	public static void streamRead() {
		try {
			File file = new File("file.txt");
			FileInputStream stream = new FileInputStream(file);
			int character = 0;
			while((character = stream.read()) != -1){
				System.out.print((char)character);
			}
			stream.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println(" \nFile read successfully");
		}
	}

}
