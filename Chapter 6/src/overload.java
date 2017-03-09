
public class overload {
	
	// constant variable
	static final double pi = Math.PI;
	// area method with radius as parameter
	public static double area(double radius) {
		return pi * radius * radius;
	} 
		
	//area method with length and width as parameters
	public static double area(double length,double width){
		return length * width;
	}
	
	//area method with radius and height as parameters
	public static double area(float radius, double height){
		return pi * (radius * radius) * height;
	}
	
	
//unused constructor
	public overload() {
		// TODO Auto-generated constructor stub
	}

}
