import java.util.Scanner;
import java.text.DecimalFormat; //need for format
public class averageRainfallLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		averageRainfall rain = new averageRainfall();
		
		int years; // years
		System.out.print("How many years are you calculating: ");
		years = keyboard.nextInt(); // sets years
		while(years < 1){
		System.out.print("Invalid data; RE-Enter the amount of years are you calculating: ");
		years = keyboard.nextInt();
		}//end while
		
		rain.setYears(years);
		rain.setAvg(0);
		
		DecimalFormat multiple = new DecimalFormat("#,##0.00");
		System.out.println("For " + years + " year the average rainfall is " +
		multiple.format(rain.getAvg()));

		}
		
		
		
		
		

	}


