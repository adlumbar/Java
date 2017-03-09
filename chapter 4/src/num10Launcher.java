import java.util.Scanner;


public class num10Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("Enter a temperature: ");
		double temperature = keyboard.nextDouble();
	
		// close keyboard
		keyboard.close();
	
		num10 freezeAndBoilingPoints = new num10();
		FreezeAndBoiling freezeAndBoiling = new FreezeAndBoiling(temperature);
	
		// Display elements will freeze.
		if (freezeAndBoiling.EABoiling()) {
			System.out.println("Ethyl alcohol will freeze.");
		}
	
		if (freezeAndBoiling.OFreezing()) {
			System.out.println("Oxygen will freeze.");
		}
	
		if (freezeAndBoiling.WFreezing())
			System.out.println("Water will freeze.");
	
		// Display if elements will boil.
		if (freezeAndBoiling.EABoiling()) {
			System.out.println("Ethyl alcohol will boil.");
		}
	
		if (freezeAndBoiling.OBoiling()) {
			System.out.println("Oxygen will boil.");
		}
	
		if (freezeAndBoiling.WBoiling()) {
			System.out.println("Water will boil.");
		}
	}

}
