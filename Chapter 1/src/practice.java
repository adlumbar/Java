
public class practice {
	int addressNum;
	boolean delivery;
	String name;

	public practice(String n, boolean delivery) {
		// TODO Auto-generated constructor stub
		this.name = n;
		System.out.println("hello, " + name + " would you like a delivery?");
		
		
		if (addressNum >= 2500 && delivery == true){
		System.out.println("We deliver");
		}	
	else System.out.println("We dont deliver!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	practice name1 = new practice("george" , true);
	practice name2 = new practice("tim", false);
	
	}

}
