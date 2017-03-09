import java.util.Scanner;
public class num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double stateTax;
		double countyTax;
		double purchase;
		double totalTax;
		double totalPrice;
		
		Scanner keyboard = new Scanner(System.in);
		//Get the amount of total price
		System.out.print("What is the Total Price of your purchase?? ");
		
		purchase = keyboard.nextDouble();
		countyTax = 0.02;
		stateTax = 0.055;
		totalTax = stateTax + countyTax;
		totalPrice = (totalTax * purchase) + purchase;
		
		System.out.println("The total price is $" + totalPrice);
		

	}

}
