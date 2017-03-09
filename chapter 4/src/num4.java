import java.util.Scanner;
public class num4 {

	private int totalUnits;
	
	public num4(){
		
	}

	public int getTotalUnits() {
		return totalUnits;
	}

	public void setTotalUnits(int totalUnits) {
		this.totalUnits = totalUnits;
	}

	public double getTotalPrice() {
		
		return totalUnits * 99.0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalUnits;
		
		
		num4 num = new num4();
		System.out.println("How many units would you like to buy ?! ");
		Scanner keyboard = new Scanner(System.in);
		totalUnits = keyboard.nextInt();
		num.setTotalUnits(totalUnits);
		
		if (totalUnits < 10 ){
			System.out.printf("%.2f", num.getTotalPrice());
		}
		else if (totalUnits >= 10 && totalUnits <= 19){
			System.out.println("You recieve a 20% discount !! Total price is");
			System.out.printf("%.2f", (num.getTotalPrice() -(num.getTotalPrice() * .2)) );
		}
		
		else if (totalUnits >= 20 && totalUnits <= 49){
			System.out.println("You recieve a 30% discount !! Total price is");
			System.out.printf("%.2f", (num.getTotalPrice() -(num.getTotalPrice() * .3)) );
		}
		else if (totalUnits >= 50 && totalUnits <= 99){
			System.out.println("You recieve a 40% discount !! Total price is");
			System.out.printf("%.2f", (num.getTotalPrice() -(num.getTotalPrice() * .4)) );
		}
		else if (totalUnits >= 100){
			System.out.println("You recieve a 50% discount !! Total price is");
			System.out.printf("%.2f", (num.getTotalPrice() -(num.getTotalPrice() * .5)) );
		}
	}

}
