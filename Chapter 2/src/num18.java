
public class num18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating variables
		int totalshares;
		double perstock;
		double commish1, commish2;
		double perstock2;
		double totalamt;
		double totalamt2;
		
		//setting variables 
		totalshares = 1000;
		perstock = 32.87;
		perstock2 = 33.92;
		totalamt = totalshares * perstock;
		totalamt2 = totalshares * perstock2;
		commish1 = totalamt * .02;
		commish2 = totalamt2 * 0.02;
		
		//printing out to console
		System.out.println("The amount of money Joe paid for stock is " + totalamt);
		System.out.println("The amount of commission earned when stock was bought is " + (totalamt*0.02));
		System.out.println("The amount Joe sold is stock for is " + totalamt2);
		System.out.println("The amount of commission earned when stock was sold is " + (totalamt2*0.02));
		System.out.println("profits = $" + ((totalamt2 - commish2) - (totalamt - commish1)));
		

	}

}
//(totalsold - amountpaid) - (commish1 + commish2)