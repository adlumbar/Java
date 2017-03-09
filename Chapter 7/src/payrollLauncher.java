import java.text.DecimalFormat;
import java.util.Scanner;

public class payrollLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//create scanner object
		payroll pay = new payroll();			  //create payroll object
		//loops thru and stores hours 
			for(int i = 0; i  < pay.getEmployeeId().length; i++){
				System.out.println("For " + pay.getEmployeeId()[i]);
				System.out.println("Enter the hours worked: ");
				pay.setHours(keyboard.nextInt());
				while(pay.getHours()[i] < 0){
					System.out.println("Invalid data how many hours worked: ");
					pay.setHours(keyboard.nextInt());
				}
				//sets the pay rate , doesn't except less than $6
				System.out.println("Enter the Pay Rate: ");
				pay.setPayRate( keyboard.nextDouble());
				while(pay.getPayRate()[i] < 6.00){
					System.out.println("Invalid Data Enter the Pay Rate Again: ");
					pay.setPayRate( keyboard.nextDouble());
				}
				pay.setWages();//sets the wages
				pay.addCount();
			}
			DecimalFormat money = new DecimalFormat("$#,##0.00");//create decimal format
			System.out.println("Enter a employee Id: ");
			int empId = keyboard.nextInt();
			for(int i = 0; i < 7; i++){
				if (empId == pay.getEmployeeId()[i]){
				System.out.println("Employee ID: "+ pay.getEmployeeId()[i]);
				System.out.println("Gross Wage: "+ money.format(pay.getWages()[i]));
				}
			}
	}

}