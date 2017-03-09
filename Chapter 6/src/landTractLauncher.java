import java.util.Scanner;
public class landTractLauncher {
	
	public static void main(String[]args){
		
		Scanner keyboard = new Scanner(System.in);
		
		double length;
		double width;
		
		System.out.println("Enter the length of number one: ");
		length = keyboard.nextDouble();
		System.out.println("Enter the width of number one: ");
		 width= keyboard.nextDouble();
		
		landTract one = new landTract(length , width);
		
		System.out.println("Enter the length of number two: ");
		length = keyboard.nextDouble();
		System.out.println("Enter the width of number two: ");
		width = keyboard.nextDouble();
		
		landTract two = new landTract(length, width);
		
		System.out.println(one.toString());
		System.out.println(two.toString());
		
		if (one.equals(two)){
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		
	}

}
