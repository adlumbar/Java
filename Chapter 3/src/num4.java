import java.util.Scanner;
public class num4 {
	private double ftemp;

	public num4() {
		// TODO Auto-generated constructor stub

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		num4 temp = new num4();
		
		System.out.println("Enter the temperature:   ");
		double userInput = keyboard.nextDouble();
		temp.setFtemp(userInput);

		System.out.println("Fahrenheit:  " +temp.getFtemp());
		System.out.println("Celsius:  " + temp.getCtemp());
		System.out.println("Kalvin:  " +temp.getktemp());
		

	}

	public double getFtemp() {
		return ftemp;
	}

	public void setFtemp(double ftemp) {
		this.ftemp = ftemp;
	}
	public double getCtemp() {
		return (5.0/9.0) * (ftemp - 32);
	}
	public double getktemp() {
		return ((5.0/9.0) * (ftemp - 32)) +273;
	}

}
