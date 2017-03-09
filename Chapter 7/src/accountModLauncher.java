import javax.swing.JOptionPane;
import java.io.*;
public class accountModLauncher {

	public static void main(String[] args) throws IOException{
		String input;
		int accountNumber; //account number to validate
		accountMod mod = new accountMod();
		//get a charge account
		input = JOptionPane.showInputDialog("Enter your account number: ");
		accountNumber = Integer.parseInt(input);
		//Determine weather it is valid
		if(mod.isValid(accountNumber))
			JOptionPane.showMessageDialog(null, "Thats valid ");
		else 
			JOptionPane.showMessageDialog(null, "invalid account number");
		System.exit(0);
		

	}

}
