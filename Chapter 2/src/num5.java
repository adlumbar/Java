import java.util.Scanner;
public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amtcookie;
		int calorie;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		//Get the amount of cookies eaten
		System.out.print("How many cookies did you eat?");
		
		amtcookie = keyboard.nextDouble();
		calorie = 75;
	    total = calorie * amtcookie;
	    
	    System.out.println("You have consumed " + total + " calories!");
		keyboard.close();

	}

}
