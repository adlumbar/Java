import java.util.Scanner;
public class employeeLauncher {

	public static void main(String[] args) {
	
		//create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//creating objects
		employee object11 = new employee("Susan Meyers" , 47899 , "accounting" , "Vice President");
		employee object12 = new employee("Susan Meyers" , 47899);
		employee object13 = new employee();
		employee object21 = new employee("Mark Jones" , 39119 , "IT" , "programmer");
		employee object22 = new employee("Mark Jones" , 39119 );
		employee object23 = new employee();
		employee object31 = new employee("Joy Rodgers" , 81774 , "Manufactoring" , "Engineer");
		employee object32 = new employee("Joy Rodgers" , 81774);
		employee object33 = new employee();
		
		
		//display values of the two objects
		System.out.println("   name\t\tID\tPosition\tDepartment" );
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(object11.getName() +" " + object11.getIdNum() +" " + object11.getPosition() +" " +object11.getDepartment());
		System.out.println(object12.getName() +" " + object12.getIdNum() +" " + object12.getPosition() +" " +object12.getDepartment());
		System.out.println(object13.getName() +" " + object13.getIdNum() +" " + object13.getPosition() +" " +object13.getDepartment());
		
		System.out.println(object21.getName() +" " + object21.getIdNum() +" " + object21.getPosition() +" " +object21.getDepartment());
		System.out.println(object22.getName() +" " + object22.getIdNum() +" " + object22.getPosition() +" " +object22.getDepartment());
		System.out.println(object23.getName() +" " + object23.getIdNum() +" " + object23.getPosition() +" " +object23.getDepartment());
		
		System.out.println(object31.getName() +" " + object31.getIdNum() +" " + object31.getPosition() +" " +object31.getDepartment());
		System.out.println(object32.getName() +" " + object32.getIdNum() +" " + object32.getPosition() +" " +object32.getDepartment());
		System.out.println(object33.getName() +" " + object33.getIdNum() +" " + object33.getPosition() +" " +object33.getDepartment());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
