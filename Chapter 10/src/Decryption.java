import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) throws IOException {
		File file = new File("file2.txt");
		Scanner inputFile = new Scanner(file);
		
		//open and write to file
		PrintWriter outputFile = new PrintWriter("file3.txt");
		
		//read lines from file
		while(inputFile.hasNext()){
			String str = inputFile.nextLine();
			for (int i = 0; i<str.length(); i++){
				char ch = str.charAt(i);
				int code = (int)ch;
				char c = (char)(code - 10);
				outputFile.print(c);
			}
			outputFile.println();
		}
		inputFile.close();
		outputFile.close();
		

	}

}
