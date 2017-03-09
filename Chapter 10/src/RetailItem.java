
public class RetailItem {
	private String description;
	private int units;
	private double price;
	
	public RetailItem(){
		
	}
	
	//constructor with arguements
	public RetailItem(String des, int u, double p)throws InvalidPrice,InvalidUnits{
		description = des;
		if(u<0)
			throw new InvalidUnits(u);
			else 
				units = u;
		units = u;
		if(p<0)
			throw new InvalidPrice(p);
		else
			price=p;
	}
	//mutator function for des
	public void setDescription(String des){
		description = des;
	}
	//mutator function for price
	public void setPrice(double p)throws InvalidPrice{
		if (p<0)
			throw new InvalidPrice(p);
		else 
			price = p;
	}
	//mutator function for units on hand
	void setUnits(int u)throws InvalidUnits{
		if(u<0)
			throw new InvalidUnits(u);
		else
			units = u;
	}
	//accessor for units
	public int getUnits(){
		return units;
	}
	//accessor for des
	public String getDescription(){
		return description;
	}
	//accessor for price
	public double getPrice(){
		return price;
	}
}
