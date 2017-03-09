import java.text.DecimalFormat;
import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sec;
		double min;
		double hours;
		double days;
		
		System.out.println("Enter How many seconds there are :  ");
		Scanner keyboard = new Scanner(System.in);
		sec = keyboard.nextDouble();
		
		min = sec / 60;
		hours = sec / 3600;
		days = sec / 86400;
		
		DecimalFormat some = new DecimalFormat("#,##0.00");
		
		if(sec < 60){
			System.out.println("There are " + some.format(sec) +" seconds");
		}
		
		else if (sec >= 60 && sec < 3600){
			System.out.println("There are " + some.format(min)  + " minutes " + " and there are " + some.format(sec) + " seconds");
		}
		else if ( sec >= 3600 && sec < 86400 ){
			System.out.println("There are "+ some.format(hours) + " hours " + some.format(min) + " minutes" + some.format(sec) + " seconds");
		}
		else if (sec >= 86400){
			System.out.println("There are " + some.format(days) + " days " + some.format(hours) + " hours " + some.format(min) + " minutes " + some.format(sec) + " seconds"  );
		}
	}

}
