import java.util.Scanner;

public class roomLauncher {

	public static void main(String[] args) {

	    final double CARPET_PRICE_PER_SQFT = 8.0;

	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    // Display intro.
	    System.out.println("Please enter the following information "
	            + "carpet cost of a room." + "\nPlease enter the room's "
	            + "dimension in feet.");

	    // Get the length of the room.
	    System.out.print("Enter the length of room: ");
	    double length = keyboard.nextDouble();

	    // Get the width of the room.
	    System.out.print("Enter the width of room: ");
	    double width = keyboard.nextDouble();

	    //close keyboard
	    keyboard.close();

	    // Create RoomDimension and RoomCarpet objects.
	    roomLauncher calculatorProgram = new roomLauncher();
	    roomDimension dimensions = new roomDimension(length, width);
	    roomCarpet roomCarpet = new roomCarpet(dimensions, CARPET_PRICE_PER_SQFT);

	    // Print the object calling the toString
	    System.out.println(roomCarpet);
	}
}