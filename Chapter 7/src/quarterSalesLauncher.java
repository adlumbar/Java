import java.text.DecimalFormat;
import java.util.Scanner;

public class quarterSalesLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		quarterSales sale = new quarterSales();
		final int division = 6;
		final int quarter = 4;
		double [][] sales = new double [quarter][division];//2D array for quarter and division
		DecimalFormat money = new DecimalFormat("$#,##0.00");
		
		for(int a = 0; a < quarter; a++ ){
			for(int b = 0; b < division; b++){
				System.out.println("Enter the Sales for Quarter " + (a+ 1) + " Division " + (b + 1));
				sales[a][b] = keyboard.nextDouble();
				while(sales[a][b] < 0){
					System.out.println("Re-Enter the Sales for Quarter " + (a+ 1) + " Division " + (b + 1));
					sales[a][b] = keyboard.nextDouble();
				}
				sale.setTotalSales(sales[a][b]);
			}
			sale.counter();
		}
		// displays all the sales
		System.out.println("\tDiv 1. \tDiv 2. \tDiv 3. \tDiv 4. \tDiv 5. \tDiv 6. \t");
		for(int a = 0; a < quarter; a++ ){
			System.out.print("QRT " + (a+ 1)+ "   ");
			for(int b = 0; b < division; b++){
				System.out.print(money.format(sales[a][b]) + "\t");
				
			}
			System.out.print("\n");
		}
		
		// division increase or decrease
		for(int b = 0; b < division; b++){
			for(int a = 0; a < quarter; a++ ){
			
				if (a > 0){
					double total = sales[a][b] - sales[a-1][b];
					System.out.println("For Division " + (b+1) + " quarter " + (a+1) +  " there was a " + money.format(total) + " Change");
				} 
			}
			
		}
		
		// gets the total sales per quarter
		for(int a = 0; a < quarter; a++ ){
			System.out.println("The Total sales for quarter" + (a + 1) + " is " + money.format(sale.getTotalSales()[a]));
		}
		
		//gets the increase or decrease for the company
		for(int a = 0; a < quarter; a++ ){
			if (a != 0){
				double company = sale.getTotalSales()[a] - sale.getTotalSales()[a-1];
				System.out.println("The companys change for quarter " +(a+ 1)+ " is " + money.format(company));
			}
			
		}

		//gets the average amount of sales for the quarter
		for(int a = 0; a < quarter; a++ ){
			sale.setAverageSales(a);
			System.out.println("For quarter " + (a+1) + " the average is " + money.format(sale.getAverageSales()));
		}
		
		
		//gets the division with the highest for quarter
		for(int a = 0; a < quarter; a++ ){
		
			double high = sales[a][0]; 
			int team = 1;
			for(int b = 0; b < division; b++){
				if(sales[a][b] > high){
					high = sales[a][b];
					team = b + 1;
				}
			}
			System.out.println("The Division with the highest sales is division: " + team);
		}
	}

}