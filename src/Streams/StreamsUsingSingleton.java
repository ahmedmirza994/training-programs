package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class StreamsUsingSingleton {
	
	private static volatile StreamsUsingSingleton SUS = null;
	
	private StreamsUsingSingleton(){
		
	}
	
	public static StreamsUsingSingleton getInstance() {
		if(SUS == null){
			SUS = new StreamsUsingSingleton();
		}
		return SUS;
	}
	
	public void copy(InputStream ins, OutputStream outs) {
		try
		// (InputStream ins = new InputStream()) 
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
	
	public void FileCopy(String sPath, String dPath) throws IOException {
		try {
			File inputFile = new File(sPath);
			File outputFile = new File(dPath);
			if(!outputFile.exists()){
				outputFile.createNewFile();
			}
			FileOutputStream outputstream = new FileOutputStream(outputFile);
			FileInputStream inputstream = new FileInputStream(inputFile);
			copy(inputstream, outputstream);
			System.out.println("Data move from one file to other file successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void getDataFromUrl(String SetUrl, String FilePath) {
		try {
			File outputFile = new File(FilePath);
			if(!outputFile.exists()){
				outputFile.createNewFile();
			}
			FileOutputStream outputstream = new FileOutputStream(outputFile);
			InputStream is = new URL(SetUrl).openStream();
			copy(is, outputstream);
			System.out.println("File Download Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void main(String[] args) throws IOException {
		StreamsUsingSingleton.getInstance().FileCopy("urlContent.txt", "dPath.txt");
		StreamsUsingSingleton.getInstance().getDataFromUrl("http://lorempixel.com/400/200/", "image.jpg");
	}
	

}
