package Streams;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class streamUtils {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		//FileCopy("urlContent.txt", "dPath.txt");
		//getDataFromUrl("http://lorempixel.com/400/200/", "image.jpg");
		//mainMenu();
	}

	public static void copy(InputStream ins, OutputStream outs) {
		try 
			{
			byte[] buffer = new byte[512];
			int byteRead = ins.read(buffer);
			while(byteRead != -1){
				outs.write(buffer,0,byteRead);
				byteRead = ins.read(buffer);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void FileCopy(String sPath, String dPath) throws IOException {
		try(
			FileOutputStream outputstream = new FileOutputStream(new File(dPath));
			FileInputStream inputstream = new FileInputStream(new File(sPath));
		)
		{
			// File inputFile = new File(sPath);
			// File outputFile = new File(dPath);
			// if(!outputFile.exists()){
			// 	outputFile.createNewFile();
			// }
			//FileOutputStream outputstream = new FileOutputStream(outputFile);
			//FileInputStream inputstream = new FileInputStream(inputFile);
			copy(inputstream, outputstream);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void getDataFromUrl(String SetUrl, String FilePath) {
		try {
			File outputFile = new File(FilePath);
			if(!outputFile.exists()){
				outputFile.createNewFile();
			}
			FileOutputStream outputstream = new FileOutputStream(outputFile);
			InputStream urlStream = new URL(SetUrl).openStream();
			copy(urlStream, outputstream);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	// public static void mainMenu() throws IOException {
	// 	System.out.println("1: for copy data from one file to another file\n2: for download file from internet");
	// 	int choice = reader.nextInt();
	// 	switch (choice) {
	// 	case 1:
	// 		System.out.println("Enter Source Path: ");
	// 		String sourcePath = reader.nextLine();
	// 		System.out.println("Enter Destination Path: ");
	// 		String destinationPath = reader.nextLine();
	// 		FileCopy(sourcePath, destinationPath);
	// 		break;
	// 	case 2:
	// 		System.out.println("Enter URL: ");
	// 		String url = reader.nextLine();
	// 		System.out.println("Enter Destination Path: ");
	// 		String downloadFileName = reader.nextLine();
	// 		getDataFromUrl(url, downloadFileName);
	// 		break;
	// 	default:
	// 		System.out.println("invalid choice;");
	// 		break;
	// 	}
	// }

}
