package Streams;
import java.io.*;

public class inputAndOutputSreams {

	public static void main(String[] args) {
		try {

            File inputFile = new File("file.txt");
            File outputFile = new File("newFile.txt");
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(fw);
            String line;

            while((line = br.readLine())!= null) {
                bw.write(line);
            }
            br.close();
            bw.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }

	}

}
