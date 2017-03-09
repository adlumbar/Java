
public class MonthLauncher {

	public static void main(String[] args) throws Exception {
		try{
			//creating object
			Month object1=new Month();
			Month object2=new Month("April");
			//set function call
			object1.setMonthNumber(14);
			System.out.println("MONTH: "+object1.toString());
		}
		catch(InvalidNumber e){
			System.out.println(e.getMessage());
		}

	}

}
