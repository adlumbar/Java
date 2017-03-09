import java.util.Scanner;
public class num6 {
	
	private double weight;
	private double distance;
	
	public num6() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num6 weights= new num6();
		System.out.println("Whats the weight of your package in Kilograms? ");
		Scanner keyboard = new Scanner(System.in);
		double userInput = keyboard.nextDouble();
		System.out.println("Enter the distance: ");
		Scanner keyboard1 = new Scanner(System.in);
		double userInput1 = keyboard.nextDouble();
		double weight = userInput;
		double distance = userInput1;
		weights.setWeight(weight);
		weights.setDistance(distance);
		
		if (weight < 2){
			System.out.println("Your shipping is $1.10");
		}
		else if (weight > 2 && weight <=6){
			System.out.println("Your shipping is $2.20");
		}
		else if (weight > 6 && weight <= 10){
			System.out.println("Your shipping is $3.70");
		}
		else if (weight > 10){
			System.out.println("Your shipping is $4.80");
		}
		
		System.out.println(" for " + distance + "miles!");

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}



}
