import java.util.Scanner;

public class num3Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double userInput;
		Scanner keyboard = new Scanner(System.in);
		num3 num = new num3();
		System.out.println("Enter score number 1:  ");
		userInput = keyboard.nextDouble();
		num.setScore1(userInput);
		System.out.println("Enter score number 2:  ");
		userInput = keyboard.nextDouble();
		num.setScore2(userInput);
		System.out.println("Enter score number 3:  ");
		userInput = keyboard.nextDouble();
		num.setScore3(userInput);

		if (num.getAvg() <= 100 && num.getAvg() >= 90 ){
		System.out.println("The average of the tests is an A!");
		}
		else if (num.getAvg() <= 90 && num.getAvg() >= 80 ){
			System.out.println("The average of the tests is an B");
			}
		else if (num.getAvg() <= 80 && num.getAvg() >= 70 ){
			System.out.println("The average of the tests is an C");
			}
		else if (num.getAvg() <= 70 && num.getAvg() >= 60 ){
			System.out.println("The average of the tests is an D");
			}
		else if(num.getAvg() < 60 ){
			System.out.println("The average of the tests is an F");
			}
	}

}
