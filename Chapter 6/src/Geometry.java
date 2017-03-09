	public class Geometry {
		private double area; // the area of the shape
		/**
		 * Default constructor
		 */
		public Geometry() {
			// TODO Auto-generated constructor stub
		}
		/**
		 * @return area of the Circle
		 */
		public static double calcArea(double radius){
			return Math.PI * (radius * radius);
		}
		/**
		 * @return area of a Rectangle
		 */
		public static double calcArea(double length, double width){
			return length * width;
		}
		/**
		 * @return area of a Triangle
		 */
		public static double calcArea(double base, double height, double half){
			return base * height * half;
		}

	}



