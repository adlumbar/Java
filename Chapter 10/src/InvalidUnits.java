
public class InvalidUnits extends Exception {
	public InvalidUnits(int n){
		super("Error: Units cannot be negative " + n);
	}
}
