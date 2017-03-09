
public class Month {
	private int monthNumber;
	
	/*
	 * no-arg constructor
	 */
	public Month(){
		
	}
	
	/*
	 * month number constructor
	 */
	public Month(int number)throws InvalidNumber{
		setMonthNumber(number);
	}
	
	/*
	 * month name constructor
	 */
	public Month(String m)throws StringIndexOutOfBoundsException,InvalidNumber{
		String upper = m.toUpperCase();
		if(upper.equals("JANUARY"))
			setMonthNumber(1);
		else if(upper.equals("FEBRUARY"))
			setMonthNumber(2);
		else if(upper.equals("MARCH"))
			setMonthNumber(3);
		else if(upper.equals("APRIL"))
			setMonthNumber(4);
		else if(upper.equals("MAY"))
			setMonthNumber(5);
		else if(upper.equals("JUNE"))
				setMonthNumber(6);
		else if(upper.equals("JULY"))
				setMonthNumber(7);
		else if(upper.equals("AUGUST"))
				setMonthNumber(8);
		else if(upper.equals("SEPTEMBER"))
				setMonthNumber(9);
		else if(upper.equals("OCTOBER"))
				setMonthNumber(10);
		else if(upper.equals("NOVEMBER"))
				setMonthNumber(11);
		else if(upper.equals("DECEMBER"))
			setMonthNumber(12);
		else
			throw new StringIndexOutOfBoundsException();
	}
	
	/*
	 * Month number mutator
	 */
	public void setMonthNumber(int number)throws InvalidNumber{
		//input validation
		//valid input 1-12 otherwise default to 1
		if((number < 1) || (number > 12))
			throw new InvalidNumber();
		else
			monthNumber = number;
	}
	
	/*
	 * acessor for month number
	 * 
	 */
	public int getMonthNumber(){
		return monthNumber;
	}
	
	/*
	 * month name generator
	 */
	public String getMonthName(){
		switch(monthNumber){
		case 1 :
			return "JANUARY";
		case 2 :
			return "FEBRUARY";
		case 3 :
			return "MARCH";
		case 4 :
			return "APRIL";
		case 5 :
			return "MAY";
		case 6 :
			return "JUNE";
		case 7 :
			return "JULY";
		case 8 :
			return "AUGUST";
		case 9 :
			return "SEPTEMBER";
		case 10 :
			return "OCTOBER";
		case 11 :
			return "NOVEMBER";
		case 12 :
			return "DECEMBER";
		default :
			return "JANUARY";
		}
	}
	
	/*
	 * to string overload
	 */
	public String toString(){
		return getMonthName();
	}
	
	/*
	 * 
	 * comparsion of passed object with current 
	 * to determine equality with boolean
	 */
	public boolean greaterThan(Month m){
		if(this.getMonthNumber() > m.getMonthNumber())
			return true;
		else
			return false;
	}
	public boolean lessThan(Month m){
		if (this.getMonthNumber() < m.getMonthNumber())
			return true;
		else
			return false;
	}
	
}
