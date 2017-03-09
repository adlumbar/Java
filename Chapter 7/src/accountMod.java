import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
public class accountMod {
//array of valid numbers
	private int [] valid;
	public accountMod()throws IOException{
		valid = new int[20];
		String inputfile;
		//get a file name
		inputfile=JOptionPane.showInputDialog("Enter a file Name: ");
		File file = new File(inputfile);
		Scanner keyboard = new Scanner(file);
		int i = 0;
		while(keyboard.hasNext()){
			//read value from the file
			valid[i] = keyboard.nextInt();
			i++;
		}
		//close the file
		keyboard.close();
	}
	/*
	 * Method that uses a sequential search to
	 * determine weather a number appears in the array
	 */
	public boolean isValid(int number){
		boolean found = false; //search flag
		int index = 0; //array index
		//search the valid array
		while(!found && index < valid.length){
			if (valid[index]==number)
				found=true;
			else
				index++;
		}//end while
		//return the status of the search
		return found;
	}//end method
}//end class
