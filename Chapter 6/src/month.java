
public class month {

	private int monthNum;
	
	/*
	 * no-arg constructor
	 */
	public month() {
		monthNum = 0;
	}

	/**
	 * @param monthNum
	 */
	public month(int monthNum) {
		int number = 0;
		monthNum = setMonthNum(number);
	}

	/**
	 * month name constructor
	 */
	public month(String m) {
		String upper = m.toUpperCase();
		if(upper.equals("JANUARY"))
			monthNum = setMonthNum(1);
		else if (upper.equals("FEBUARY"));
		monthNum = setMonthNum(2);
		 if (upper.equals("MARCH"));
		monthNum = setMonthNum(3);
		 if (upper.equals("APRIL"));
		monthNum = setMonthNum(4);
		 if (upper.equals("MAY"));
		monthNum = setMonthNum(5);
		 if (upper.equals("JUNE"));
		monthNum = setMonthNum(6);
		 if (upper.equals("JULY"));
		monthNum = setMonthNum(7);
		 if (upper.equals("AUGUST"));
		monthNum = setMonthNum(8);
		 if (upper.equals("SEPTEMBER"));
		monthNum = setMonthNum(9);
		 if (upper.equals("OCTOBER"));
		monthNum = setMonthNum(10);
		 if (upper.equals("NOVEMBER"));
		monthNum = setMonthNum(11);
		 if (upper.equals("DECEMBER"));
		monthNum = setMonthNum(12);
		
		
	}

	/**
	 * @return the monthNum
	 */
	public int getMonthNum() {
		return monthNum;
	}

	/**
	 * @param monthNum the monthNum to set
	 * @return 
	 */
	public int setMonthNum(int monthNum) {
		//valid input 1-12, set default to 1
		if((monthNum >= 1) && (monthNum <= 12)){
			return monthNum;
		}
		else
		return 1;
		
	}
	
	public String getMonthName(){
		switch (monthNum)
		{
		case 1:
			return "JANUARY";
		case 2:
			return "FEBUARY";
		case 3:
			return "MARCH";
		case 4:
			return "APRIL";
		case 5:
			return "MAY";
		case 6:
			return "JUNE";
		case 7:
			return "JULY";
		case 8:
			return "AUGUST";
		case 9:
			return "SEPTEMBER";
		case 10:
			return "OCTOBER";
		case 11:
			return "NOVEMBER";
		case 12:
			return "DECEMBER";
		default:
			return "JANUARY";
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 */
	@Override
	public String toString() {
		return getMonthName();
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * comparsion of passed object with 
	 * current to determine equality
	 */
	public boolean equals2(month m) {
		if (m.getMonthNum() == this.getMonthNum()) {
			return true;
		}
		else 
			return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * comparsion of passed object with 
	 * current to determine equality
	 */
	public boolean equals(month m) {
		if (m.getMonthNum() > this.getMonthNum()) {
			return true;
		}
		else 
			return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * comparsion of passed object with 
	 * current to determine equality
	 */
	public boolean equals1(month m) {
		if (m.getMonthNum() < this.getMonthNum()) {
			return true;
		}
		else 
			return false;
	}

}
