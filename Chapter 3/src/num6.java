import java.util.Scanner;
public class num6 {
//setting private variables
	private int id;
	private double hours;
	private double pay;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	//getting user-inputs
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		num6 num = new num6();
		
		System.out.println("Enter ID number:  ");
		int id = keyboard.nextInt();
		num.setId(id);
		
		System.out.println("Enter hours:  :  ");
		double hours = keyboard.nextDouble();
		num.setHours(hours);
		
		System.out.println("Enter pay:  ");
		double pay = keyboard.nextDouble();
		num.setPay(pay);
		//printing out to console
		System.out.printf("ID number: %d  Rate: %.2f Hours: %.2f Total: %," + ".2f" , num.getId(), num.getPay(), num.getHours(), num.getPay() * num.getHours());
		
		
	}
}
