import javax.swing.JOptionPane;

public class validatorLauncher {

	public static void main(String[] args) {
		String input;
		int accountNumber; //account number to validate
		validator val = new validator();
		//get a charge account number
		input = JOptionPane.showInputDialog("Enter your charge account number: ");
		accountNumber = Integer.parseInt(input);
		
		//Determine weather it is a valid number
		if(val.isValid(accountNumber))
			JOptionPane.showMessageDialog(null, "Thats a valid account");
		else JOptionPane.showMessageDialog(null, "Invalid account");
		
		System.exit(0);

	}

}
