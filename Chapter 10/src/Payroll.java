
public class Payroll {
	private String Name;
	private int ID;
	private int hourlyRate;
	private int hours;
	
	//default constructor
	public Payroll(){
		Name ="";
		ID=0;
		hourlyRate=0;
		hours=0;
	}
	public Payroll(String name,int id){
		Name = name;
		ID = id;
	}
	//mutator functions
	public void setName(String name)throws StringIndexOutOfBoundsException{
		if (name.equals(""))
			throw new StringIndexOutOfBoundsException();
		else 
			name=Name;
	}
	public void setID(int id)throws InvalidID{
		if(id<0)
			throw new InvalidID(id);
		else 
			ID = id;
	}
	public void setHourlyRate(int rate)throws InvalidHourlyRate{
		if(rate>25 || rate <0)
			throw new InvalidHourlyRate(rate);
		else 
			hourlyRate = rate;
	}
	public void setHours(int hrs)throws InvalidHours{
		if(hrs>84 || hrs < 0)
			throw new InvalidHours(hrs);
		else
			hours = hrs;
	}
	
	//accessor functions
	public String getName(){
		return Name;
	}
	public int getId(){
		return ID;
	}
	public int getHourlyRate(){
		return hourlyRate;
	}
	public int getHours(){
		return hours;
	}
	public int grossPay(){
		return (hourlyRate*hours);
	}
}
