import java.util.Scanner;

public class distanceTraveledLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistanceTraveled distance = new DistanceTraveled();
		double speed;
		double hours;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the speed in MPH:  ");
		speed = keyboard.nextDouble();
		
		//check condition for negative input value
		while (speed < 0){
			System.out.print("Enter the speed in MPH: ");
			speed = keyboard.nextDouble();
		}
		distance.setSpeed(speed);
		
		
		System.out.print("Enter the amount of hours traveled: ");
		hours = keyboard.nextDouble();
		while (hours < 1){
	
			System.out.print("Enter the amount of hours traveled: ");
			hours = keyboard.nextDouble();
		}
		
		for (int i = 1; i <= hours ; i++){
			distance.setHours(i);
			//calculating distance value
				System.out.println( i + "         " + distance.getDistance1() + " miles");
		}
	
		}

}
