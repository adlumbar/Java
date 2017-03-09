
public class InvalidID extends Exception {
	public InvalidID(int n){
		super("Error: Cannot be negative or zero " + n);
	}
}
