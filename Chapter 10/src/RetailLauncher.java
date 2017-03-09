
public class RetailLauncher {
	public static void main(String [] args) throws Exception{
		RetailItem r1,r2,r3;
		String str ="Shirt";
		//retail item with 3 objects
		try{
			r1=new RetailItem("Jacket", 6,59.95);
			r2=new RetailItem("Designer Jeans" , 40, 34.95);
			r3=new RetailItem();
			//function call to set values
			r3.setDescription(str);
			r3.setUnits(20);
			r3.setPrice(-24.95);
			System.out.println("____________________________________________________________");
			System.out.println("\tDescription\tUnits on Hand\tPrice");
			System.out.println("____________________________________________________________");
			
			//accessor function calls
			System.out.println("Item #1\t" + r1.getDescription() +
					"\t\t" + r1.getUnits() +"\t\t" + r1.getPrice());
			System.out.println("Item #2\t" + r2.getDescription() +
					"\t\t" + r2.getUnits() +"\t\t" + r2.getPrice());
			System.out.println("Item #3\t" + r3.getDescription() +
					"\t\t" + r3.getUnits() +"\t\t" + r3.getPrice());
		}
		catch (InvalidPrice e){
			System.out.println(e.getMessage());
		}
		catch (InvalidUnits e){
			System.out.println(e.getMessage());
		}
		
	}
}
