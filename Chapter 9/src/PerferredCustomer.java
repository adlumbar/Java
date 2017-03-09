public class PerferredCustomer extends Customer {

		public PerferredCustomer(String name, String address, String telephone, String number) {
		super(name, address, telephone, number);
		// TODO Auto-generated constructor stub
	}
		private double custSpent;
		private double percent;
		 {
}
		/**
		 * @return the custSpent
		 */
		public double getCustSpent() {
			return custSpent;
		}
		/**
		 * @param custSpent the custSpent to set
		*/
		public void setCustSpent(double custSpent) {
			this.custSpent = custSpent;
			if (custSpent <= 500){
				setPercent(5);
			}else if (custSpent <= 1000){
				setPercent(6);
			}else if (custSpent <= 1500){
				setPercent(7);
			}else{
				setPercent(10);
			}
	}
	/**
	 * @return the percent
	 */
	public double getPercent() {
		return percent;
	}
	/**
	 * @param percent the percent to set
	 */
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public String toString(){
		String str = "";
		str = "Name: " + getName() + 
				"\nAddress: " + getAddress() +
				"\nTotal Customer spent: " + getCustSpent()+ 
				"\nDiscount percent: %" + getPercent();
		return str;
	}
}
