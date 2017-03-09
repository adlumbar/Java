import java.util.Scanner; //need for user input
public class penniesForPay {
private double firstDaySalary;
private double currentSalary;
private int daysWorked;
private double dollarsPerPenny;


	/**
 * @return the firstDaySalary
 */
public double getFirstDaySalary() {
	return firstDaySalary;
}



/**
 * @param firstDaySalary the firstDaySalary to set
 */
public void setFirstDaySalary(double firstDaySalary) {
	this.firstDaySalary = firstDaySalary;
}



/**
 * @return the currentSalary
 */
public double getCurrentSalary() {
	currentSalary  = firstDaySalary * dollarsPerPenny;
	/*for (int i = 1; i <= daysWorked; i++ ){
		//double the salary every day except the first day
		if (i!= 1){
			currentSalary *= 2;}
	}*/
	firstDaySalary += currentSalary ;
	return currentSalary;
}


/**
 * @return the dollarsPerPenny
 */
public double getDollarsPerPenny() {
	dollarsPerPenny = 0.01;
	return dollarsPerPenny;
}



/**
 * @param dollarsPerPenny the dollarsPerPenny to set
 */
public void setDollarsPerPenny(double dollarsPerPenny) {
	this.dollarsPerPenny = dollarsPerPenny;
}



/**
 * @return the daysWorked
 */
public int getDaysWorked() {
	for (int i = 1; i <= daysWorked; i++ ){
		//double the salary every day except the first day
		if (i!= 1){
			currentSalary *= 2;
	}}
	return daysWorked;
}



/**
 * @param daysWorked the daysWorked to set
 */
public void setDaysWorked(int daysWorked) {
	this.daysWorked = daysWorked;
}



	public static void main( String [] args) {

		penniesForPay penny = new penniesForPay();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of days worked:  ");
		penny.setDaysWorked(keyboard.nextInt());
		penny.setDollarsPerPenny(0.01);

		
		//check condition for negative input value
		while (penny.getDaysWorked() < 1){
			System.out.println("ERROR! days worked cannot be less than 1 ");
			System.out.println("Enter the number of days worked: ");
			penny.setDaysWorked(keyboard.nextInt());
		}
		//Prompt for first day salary
		System.out.println("Enter first day salary in pennies: ");
		penny.setFirstDaySalary(keyboard.nextDouble());
		
		//format output
		System.out.println("\n Salaries for each day \n");
		System.out.println(" Day         Salary($)");
		System.out.println("------------------------------");
		
		
		for(int i =1; i <= penny.getDaysWorked(); i++){
			System.out.printf(" %-6d%14.2f\n",i, penny.getCurrentSalary());
		}
					
	}
	
}


