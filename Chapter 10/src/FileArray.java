import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileArray {
	public static void writeArray(String filename, int[] num) throws IOException{
		//open file using file output stream
		//create file stream
		FileOutputStream fstream = new FileOutputStream(filename);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		//display the numbers
		System.out.println("The number in the array are: ");
		for (int i = 0; i <num.length; i++)
			System.out.print(num[i] + ", ");
		
		System.out.println("\n" + "Writing the numbers in the array" +
				"to the file" + filename + "...");
		//write the array elements to the file
		for(int i = 0; i< num.length; i++)
			outputFile.writeInt(num[i]);
		System.out.print("Done! \n");
		outputFile.close();
	}
	
	public static void readArray(String filename, int [] num2) throws IOException{
		boolean endOfFile = false;
		//create a file stream
		FileInputStream fstream = new FileInputStream(filename);
		DataInputStream inputfile = new DataInputStream(fstream);
		//display output
		System.out.println("\n Reading numbers from the file" + filename);
		
		//try catch for invalid file
		int i =0;
		while(!endOfFile){
			try {
				num2[i] = inputfile.readInt();
				i++;
			}catch (FileNotFoundException e){
				System.out.println("File not found");
			}catch (EOFException e){
				endOfFile = true;
			}
			System.out.println("Done!\n");
		}
	}
}
