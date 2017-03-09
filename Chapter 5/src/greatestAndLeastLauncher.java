import java.util.Scanner;
public class greatestAndLeastLauncher {


		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			greatestAndLeast num = new greatestAndLeast();
			int number = 0;
			while (number != -99){
			System.out.print("Enter a number or -99 to quit");
			number = keyboard.nextInt();
			if (number != -99){
			num.setNumber(number);
			}
		}
			System.out.println("Highest Number you enterd is: " + num.getLarge());
			System.out.println("Lowest Number you enterd is: " + num.getSmall());

		}

	}


