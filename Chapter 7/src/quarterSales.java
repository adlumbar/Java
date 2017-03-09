public class quarterSales {

	private final int division = 6; //array for the division
	private final int quarter = 4; //array for the quarter
	private double totalSales[] = new double[quarter];
	private double averageSales;
	private int count = 0;
	
	public void counter(){
		count++;
	}
	/**
	 * @return the totalSales
	 */
	public double[] getTotalSales() {
		return totalSales;
	}
	/**
	 * @param totalSales the totalSales to set
	 */
	public void setTotalSales(double sales) {
		totalSales[count] += sales;
	}
	/**
	 * @return the average Sales
	 */
	public double getAverageSales() {
		return averageSales;
	}
	/**
	 * @param aVGSales the average Sales to set
	 */
	public void setAverageSales(int i) {
		averageSales = totalSales[i] / division;
	}
	
}