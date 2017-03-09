public class num5 {
	private String [] item = new String[3];
	private String [] clothing = new String[3];
	private int [] units = new int[3];
	private double [] price = new double[3];
	
	//set and return array of price
	public void SetPrice(){ 
		this.price[0] = 59.95;
		this.price[1] = 34.95;
		this.price[2] = 24.95;
		}
	
	public double[] GetPrice() {
		return price;
	}
	
	//Set and return array of item
	public void SetItem() {		
		this.item[0] ="Item # 1";
		this.item[1] = "Item # 2";
		this.item[2] = "Item # 3";
		
	}
	
	public String[] getItem() {
		return item;
		
	}
	
	//set and return array of clothing
	public void SetClothing() {
		this.clothing[0] ="Jacket";
		this.clothing[1] = "Jeans";
		this.clothing[2] = "Shirt";
		}
	
	public String[] getClothing() {
		return clothing;
		
	}
	
	//set and return array of units
	public void SetUnits() {
		this.units[0] =12;
		this.units[1] = 40;
		this.units[2] = 20;
		}
	
	public int[] getUnits() {
		return units;
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get names in array and print to console
		num5 num = new num5();
		num.SetItem();
		String item[] = num.getItem();
		
		num5 num2 = new num5();
		num2.SetUnits();
		int units[] = num2.getUnits();
		
		num5 num3 = new num5();
		num3.SetClothing();
		String clothing[] = num3.getClothing();
		
		num5 num4 = new num5();
		num4.SetPrice();
		double price[] = num4.GetPrice();
		
		System.out.println("Description    Units on hand       Price");
		System.out.println("===========================================");
		for(int i = 0; i < item.length; i++){
			System.out.printf(" %s      %d    %s     %.2f \n", item[i], units[i], clothing[i], price[i]);
		
		}		
	}	
}
