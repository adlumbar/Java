import javax.swing.JOptionPane;//needed to import JOptionPane
public class sumOfNumbers {
	
	private int number;
	private int sum;
	public sumOfNumbers() {
	}
	/**
	 * @return the sum
	 */
	public int getSum() {
		for (int i = 1; i <= number; i++){
			//calculating the sum 
			sum += i;
		}
		return sum;
	}
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfNumbers num = new sumOfNumbers();
		int number;
		String input;
		//get a positive integer value
		input = JOptionPane.showInputDialog("Enter a positive Integer value :  ");
		number = Integer.parseInt(input);
		num.setNumber(number);
		//Display total sum
		JOptionPane.showInputDialog(null, "Sum of the total numbers is " + num.getSum());
		
		System.exit(0);
	}
}
