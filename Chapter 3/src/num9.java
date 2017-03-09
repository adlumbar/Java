import java.util.Scanner;
public class num9 {
	private double radius;
	private double pi = 3.14159;
	//radius and pi variables
	public num9(){
		radius = 0.0;
	}
	
	num9(double r){
		radius = r;
	}
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return pi * radius * radius;
	}
	
	public double getDiameter(){
		return radius * 2;
	}
	
	public double getCircum(){
		return 2 * pi * radius;
	}
	
	public static void main (String []args){
		num9 num = new num9();
		double r;
		//userinputs
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter radius:  ");
		r = keyboard.nextInt();
		num.setRadius(r);
		//printing to console
		System.out.println("Area of the circle:  " + num.getArea());
		System.out.println("Diameter of the circle:  " + num.getDiameter());
		System.out.println("Circumfrence of the circle:  " + num.getCircum());
	}
	
	

}
