import java.util.Scanner;

public class num11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int male;
		int female;
		double percentf;
		double percentm;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many males ? ");
		male = keyboard.nextInt();
		System.out.println("How many females ");
		female = keyboard.nextInt();
		
		total = male + female;
		percentf = female / total;
		percentm = male / total;

		System.out.println("There are " +percentf + " girls and " + percentm + " guys.");
		

	}

}
