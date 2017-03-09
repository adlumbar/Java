import java.util.Scanner;

public class lotteryLauncher {

	public static void main(String[] args) {
		lottery lot = new lottery();
		System.out.println("Lottery Application \n");
		System.out.println("There are five numbers between 0 and 9. Try to gueess!! \n");
		
		//Asks the user to enter 5 numbers
		Scanner keyboard = new Scanner(System.in);
		int numbers [] = new int[5];
		System.out.print("Enter numbers");
		for (int i = 0; i <numbers.length; i++){
			numbers[i] = keyboard.nextInt();
		}
		//function call to compare number
		int match = lot.compareNumbers(numbers);
		if (match == 5){
			System.out.println("You Win !!!!");
		}
		else{
			System.out.println("Numbers did not match");
		}

	}//end main

}//end class Launcher
