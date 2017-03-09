
public class parkingMeter {
	private double numMinutesPurchased;
	/**
	 * no arg constructor to initialize fields
	 */
	public parkingMeter() {
		numMinutesPurchased = 0.0;	
	}
	/**
	 * @param numMinutesPurchased
	 * constructor to set fields
	 */
	public parkingMeter(double numMinutesPurchased) {
		super();
		this.numMinutesPurchased = numMinutesPurchased;
	}
	
	/*
	 * copy constructor to pass the object
	 * object 2
	 */
	public parkingMeter(parkingMeter object2){
		this.numMinutesPurchased = object2.numMinutesPurchased;
	}
	/**
	 * @return the numMinutesPurchased
	 */
	public double getNumMinutesPurchased() {
		return numMinutesPurchased;
	}
	/**
	 * @param numMinutesPurchased the numMinutesPurchased to set
	 */
	public void setNumMinutesPurchased(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str;
		str = "Number of minutes " + this.numMinutesPurchased + "\n";
		return str;
	}
	
	
	
	
	

}
