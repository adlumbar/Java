import java.util.Scanner; //need for user input
public class distanceFile {
private double speed;
private double hours;
private double distance1;


	/**
 * @return the speed
 */
public double getSpeed() {
	return speed;
}


/**
 * @param speed the speed to set
 */
public void setSpeed(double speed) {
	this.speed = speed;
}


/**
 * @return the hours
 */
public double getHours() {
	return hours;
}


/**
 * @param hours the hours to set
 */
public void setHours(double hours) {
	this.hours = hours;
}


/**
 * @return the distance1
 */
public double getDistance1() {
	
		//calculating distance value
		distance1 = speed * hours;
		
	return distance1;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		distanceFile distance = new distanceFile();
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

