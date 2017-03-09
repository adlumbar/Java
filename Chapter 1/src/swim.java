
public class swim {

	boolean wateriswarm; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swim one = new swim(false);
		swim two = new swim(true);
		
	}
	public swim(Boolean wateriswarm) {
		// TODO Auto-generated constructor stub
		if (wateriswarm == true){
			System.out.println("The water is warm, go for a swim!");
			}	
		else System.out.println("the water is cold, get out!");
	}

	

}
