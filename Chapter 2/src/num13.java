import java.util.Scanner;
public class num13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax;
		double tip;
		double total;
		double amt;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your total amount ? ");
		amt = keyboard.nextDouble();
		
		tax = 0.075;
		tip = .18;
		
		total = (amt * 0.075) + (amt * .18) + amt;
		System.out.println(total);
		

	}

}
