import java.util.Scanner;
public class num9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gallons;
		double miles;
		double MPG;
		
		Scanner keyboard = new Scanner(System.in);
		//Get the amount of miles
		System.out.print("How many miles did you drive ? ");
		
		miles = keyboard.nextDouble();
		
		Scanner keyboard1 = new Scanner(System.in);
		System.out.println("How many gallons did you use ? ");
		
		gallons = keyboard.nextInt();
		
		MPG = miles/gallons;
		
		System.out.println("your miles per gallon is ..." + MPG + " Miles Per Gallon!");
		
		

	}

}
