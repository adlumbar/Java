import java.util.Scanner;
public class num12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city;
		String str;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your favorite city ? ");
		city = keyboard.next();
		str = city.substring(0,1);
		
		System.out.println(city.length() +" letters long");
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(str);
		
	}

}
