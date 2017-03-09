import java.io.IOException;
import java.util.Scanner;

public class FileArrayLauncher {

	public static void main(String[] args) throws IOException{
		//create a scanner
		Scanner input = new Scanner(System.in);
		//the num array holds numbers to be written
		int [] num = {1,2,3,4,5};
		String filename;
		int [] num2 = new int [num.length];
		
		//read the out put filename from the user
		System.out.print("Enter the file name: ");
		//reading file name from console input
		filename = input.nextLine();
		//calling write and read methods
		FileArray.writeArray(filename , num);
		FileArray.readArray(filename, num2);
		System.out.println("Display the numbers stored in the array");
		
		//displaying numbers read from file
		for(int i = 0; i <num2.length; i++)
			System.out.print(num2[i] +", ");

	}


}
