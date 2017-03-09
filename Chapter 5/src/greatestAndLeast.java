
	public class greatestAndLeast {
	private int number;
	// small is set to max int to catch any possible number
	private int small = 80219834;
	// large is set to max negative int to catch any possible number
	private int large =  -80219834;

	/**
	* @return the number
	*/
	public int getNumber() {
	return number;
	}

	/**
	* @param number the number to set
	*/
	public void setNumber(int number) {
	this.number = number;
	int low = number;
	int high  = number;
	if(low < small){
	setSmall(low);
	}
	if(high > large){
	setLarge(high);
	}
}

	/**
	* @return the small
	*/
	public int getSmall() {
	return small;
	}

	/**
	* @param small the small to set
	*/
	public void setSmall(int small) {
	this.small = small;
	}

	/**
	* @return the large
	*/
	public int getLarge() {
	return large;
	}

	/**
	* @param large the large to set
	*/
	public void setLarge(int large) {
	this.large = large;
	}
	

}
