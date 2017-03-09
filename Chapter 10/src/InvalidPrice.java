
public class InvalidPrice extends Exception{
	public InvalidPrice(double n){
		super("Error: Price cannot be negative " + n);
	}
}
