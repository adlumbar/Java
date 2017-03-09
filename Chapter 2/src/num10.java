import java.util.Scanner;
public class num10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test1;
		double test2;
		double test3;
		double totalScore;
		double avg;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter first test score ");
		test1 = keyboard.nextDouble();
		System.out.println("enter second test score ");
		test2 = keyboard.nextDouble();
		System.out.println("enter second test score ");
		test3 = keyboard.nextDouble();
		//enters test scores and gets avg
		totalScore = test1 + test2 + test3;
		avg = totalScore / 3;
		
		System.out.println("The average of your tests is " + avg);
		
		

	}

}
