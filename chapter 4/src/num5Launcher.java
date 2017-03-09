import java.text.DecimalFormat;
import java.util.Scanner;

public class num5Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		num5 account = new num5();
		double checkTotal = 0;
		System.out.print("Enter your Balance: ");
		account.setBalance(keyboard.nextDouble());
		System.out.print("How many checks are you cashing");
		int checkNum = keyboard.nextInt();
	
	for (int i = 1; i <= checkNum; ++i){
	System.out.print("Enter Ammount for check " + i + ": ");
	checkTotal += keyboard.nextDouble();
	}
	
	account.setCheckNum(checkNum);
	account.setCheckTotal(checkTotal);
	DecimalFormat money = new DecimalFormat("$#,##0.00");
	System.out.print("The Total amount for cashed checks is " +
	money.format(account.getCheckTotal()) + ", Your Service Fees for cashing the check is "+
	money.format(account.getCheckFee()) + ", Your balence is " +
	money.format(account.getBalance())   );
	}

}
