
public class parkedCar {

	private String make, 
					model,
					licenseNum;
	private double numMinutesParked;
	
	/*
	 * No-arg constructor to intialize
	 */
	public parkedCar() {
		this.make ="";
		this.model ="";
		this.licenseNum = "";
		this.numMinutesParked = 0.0;
	}
	
	

	/**
	 * @param make
	 * @param model
	 * @param licenseNum
	 * @param numMinutesParked
	 */
	public parkedCar(String make, String model, String licenseNum, double numMinutesParked) {
		this.make = make;
		this.model = model;
		this.licenseNum = licenseNum;
		this.numMinutesParked = numMinutesParked;
	}

	public parkedCar(parkedCar object2){
		this.make = object2.make;
		this.model = object2.model;
		this.licenseNum = object2.licenseNum;
		this.numMinutesParked = object2.numMinutesParked;
	}
	


	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the licenseNum
	 */
	public String getLicenceNum() {
		return licenseNum;
	}

	/**
	 * @param licenseNum the licenseNum to set
	 */
	public void setLicenceNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	/**
	 * @return the numMinutesParked
	 */
	public double getNumMinutesParked() {
		return numMinutesParked;
	}

	/**
	 * @param numMinutesParked the numMinutesParked to set
	 */
	public void setNumMinutesParked(double numMinutesParked) {
		this.numMinutesParked = numMinutesParked;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str ;
		str = "make:" + this.make + "\n"
		+ "model: " + this.model + "\n"
		+ "license number: " + this.licenseNum + "\n";
		
		return str;
	}
	
	
	
	

}
