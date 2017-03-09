import java.text.DecimalFormat;
import java.util.Scanner;

	public class GemoetryLauncher {

		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in); //create scanner object
			final double Half = 0.5;	//variable for half = 0.5
			int choice;					//choice variable
			
			/*
			 *select your choice in do while loop
			 */
		do{
			System.out.println("Geometry Calculator: \n"
					+ "1. Calculate the Area of a Circle\n"
					+ "2. Calculate the Area of a Rectangle\n"
					+ "3. Calculate the Area of a Triangle\n"
					+ "4. Quit");
			choice = keyboard.nextInt();//stores choice variable
			
			while(choice < 1 || choice > 4){
				System.out.println("Incorect Data Re-Enter your choice: \n"
						+ "1. Calculate the Area of a Circle\n"
						+ "2. Calculate the Area of a Rectangle\n"
						+ "3. Calculate the Area of a Triangle\n"
						+ "4. Quit");
				choice = keyboard.nextInt();//stores choice variable
			}
			
			DecimalFormat multiple = new DecimalFormat("#,##0.000");//create decimal format object
			switch (choice){//switch and case to determine which area to get or to quit
			case 1:
				System.out.print("Enter the radius");
				double radius = keyboard.nextDouble();//stores the radius variable
				System.out.println("The Area is: " +
						multiple.format(Geometry.calcArea(radius)));
				break;
			case 2:
				System.out.print("Enter the Length: ");//stores the length variable
				double length = keyboard.nextDouble();
				System.out.print("Enter the Width");//stores the width variable
				double width = keyboard.nextDouble();
				System.out.println("The Area is: " +
						multiple.format(Geometry.calcArea(length, width)));
				break;
			case 3:
				System.out.print("Enter the Base: ");//stores the base variable
				double base = keyboard.nextDouble();
				System.out.print("Enter the Height");
				double height = keyboard.nextDouble();//stores the height variable
				System.out.println("The Area is: " +
						multiple.format(Geometry.calcArea(base , height ,Half)));
				break;
			case 4:
				System.out.println("run again");
			}
		} while(choice != 4);
		}
	}