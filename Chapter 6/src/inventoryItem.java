public class inventoryItem {
	
	private double units; //units
	
	//constructor that sets inventoryItem to zero
	public inventoryItem() {
		units = 0.0;
	}
	
	public inventoryItem(inventoryItem obj){
		units = obj.units;
	}
	
	//constructor that sets starting units passed as an argument
	public inventoryItem(double startBalance){
		units = startBalance;
	}
	
	//constructor sets starting units into string 
	public inventoryItem(String str){
		units = Double.parseDouble(str);
	}
	
	//deposit method makes deposit into account
	public void deposit(double amount){
		units += amount;
	}
	
	//withdraw method subtracts from account
	public void withdraw(double amount){
		units -= amount;
	}
	
	//withdraws amount as string
	public void withdraw(String str){
		units -= Double.parseDouble(str);
	}
	
	//setBalance method sets the new account units
	public void setBalance(double b){
		units = b;
	}
	
	//sets units as string
	public void setBalance(String str){
		units = Double.parseDouble(str);
	}
	
	//return units in the units field
	public double getBalance(){
		return units;
	}


	
	
}