public class landTract {
	private double length; //variable that stores length
	private double width; //variable that stores width
	private double area;
	
	public landTract() {
	
	}
	
	public landTract(double length, double width) {
		this.length = length;
		this.width = width;	
	}
	

	//method that returns the area
	public double area(){
		area = length * width;
		return area;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		landTract other = (landTract) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area)) {
			return false;
		}
		return true;
	}

	public String toString(){
		String str;
		str = "The area is " + area();
		return str;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}


	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

}