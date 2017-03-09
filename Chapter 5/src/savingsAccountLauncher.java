import java.text.DecimalFormat;
import java.util.Scanner;
public class savingsAccountLauncher {
	public static void main(String[] args) {
		//initiates the Scanner
		Scanner keyboard = new Scanner(System.in);
		double startBalance; //variable to hold the original balance
		double anualIntrest; // holds the annual interest
		int months;// months
		double deposit;//deposit
		double withdrawn;// withdrawn
		System.out.print("What is your starting balance :");
		startBalance = keyboard.nextDouble();// sets the balance
		savingsAccount bal = new savingsAccount(startBalance);//pushes the balance to the constructor and initiates it
		
		System.out.print("What is the anual intrest rate: ");
		anualIntrest = keyboard.nextDouble();// sets the annual Interest Rate
		bal.setMonthlyIntrest(anualIntrest);//passes the annual Interest to monthly interest
		
		System.out.print("How many months have passed since the acount was created: ");
		months = keyboard.nextInt();// gets the number of months
		
			for(int i = 1; i <= months; ++i){// for loop runs the number of months the user entered
		System.out.print("How much was deposited in month " + i + ": ");
		deposit = keyboard.nextDouble();// sets deposit
		bal.deposit(deposit);// passes it to deposit method
		
		bal.setTotalDeposit(deposit);// passes deposit to the total deposit setter
		System.out.print("How much was withdrawn in month " + i + ": ");
		withdrawn = keyboard.nextDouble();//sets withdrawn
		bal.withdrawn(withdrawn); // passes it to the withdrawn method
		bal.setTotalWithdraw(withdrawn);// passes withdrawn to the total withdrawn setter
		bal.intrest();// gets the interest
		}
			
		DecimalFormat money = new DecimalFormat("$#,##0.00");//sets format for money
		DecimalFormat percent = new DecimalFormat("#0.00%");//sets format to percent
		// displays the balance
		System.out.println("The ending balance is: "+ money.format(bal.getBalance()));
		//displays the total amount deposited
		System.out.println("The total amount of deposits is: " +
		money.format(bal.getTotalDeposit()));
		//displays the total amount of withdraws
		System.out.println("The total amount of withdrawals is: " +
		money.format(bal.getTotalWithdraw()));
		//display the monthly interest rate
		System.out.println("Your monthly Intrest rate is: " +
		percent.format(bal.getMonthlyIntrest()));
		// displays the total mount of money earned from interest
		System.out.println("The total amount of intrest earned is: " +
		money.format(bal.getTotalIntrest()));
		}
		}

