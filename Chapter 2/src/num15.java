import java.util.Scanner;
public class num15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total;
		double flour;
		double butter;
		double sugar;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many cookies would you like ? ");
		total = keyboard.nextDouble();
		
		butter = total * (1.0/48);
		sugar = total *  (1.5/48); 
		flour = total *(2.75/48);
		
		System.out.println("The amount of butter need is " + butter +" cups" );
		System.out.println("The amount of flour need is " + flour +" cups");
		System.out.println("The amount of sugar need is " + sugar +" cups");
	
		
		
		
		
		
		
		

	}

}
