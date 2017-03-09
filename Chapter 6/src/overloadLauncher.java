import java.util.Scanner;
public class overloadLauncher {

	public static void main(String[] args) {
		// create scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		//store the radius of circle in circleRadius variable
		double circleRadius = scanner.nextDouble();
		System.out.println("Enter the length and width of the rectangle: ");
		//store the length and width of rectangle variables
		double rectangleLength = scanner.nextDouble();
		double rectangleWidth = scanner.nextDouble();
		System.out.println("Enter the radius and height of the cylinder: ");
		//store the height and radius of the cylinder
		double cylinderHeight = scanner.nextDouble();
		double cylinderRadius = scanner.nextDouble();
		
		System.out.println("*******************************************");
		//calling the overload methods
		System.out.println("The area of the circle is: " + overload.area(circleRadius));
		
		System.out.println("The area of the rectangle is: " + overload.area(rectangleLength,rectangleWidth));
		
		System.out.println("The area of the cylinder is: " + overload.area(cylinderRadius,cylinderHeight));
		
	}

}
