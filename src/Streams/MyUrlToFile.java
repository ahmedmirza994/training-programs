package Streams;

import java.net.URL;
import java.net.URLConnection;
import java.io.*;

public class MyUrlToFile {
	public static String output;
	public static void main(String[] args) {

		output  = getUrlContents("http://lorempixel.com/400/200/");
		System.out.println(output);
		writeFileFromUrl();

	}

	public static String getUrlContents(String theUrl) {
		StringBuilder content = new StringBuilder();

		try {
			
			
			URL url = new URL(theUrl); //create a url object
			URLConnection urlConnection = url.openConnection(); //open connection

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String line;
			// read from the urlconnection via the bufferedreader
			while ((line = bufferedReader.readLine()) != null){
				content.append(line + "\n");
				
			}
			bufferedReader.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return content.toString();
	}

	public static void writeFileFromUrl() {
		try {

//			File outputFile = new File("urlContent.txt");
			File outputFile = new File("urlContent.jpg");
			FileWriter fw = new FileWriter(outputFile);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);

			if(!outputFile.exists()){
				outputFile.createNewFile();
			}

			bufferedWriter.write(output);
			bufferedWriter.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
