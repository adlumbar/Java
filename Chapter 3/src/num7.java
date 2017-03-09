import java.util.Scanner;
public class num7 {
	double widgets;
	
	public num7(){
		widgets = 0;
	}
	
	public void SetWidgets(double num){
		widgets = num;
	}
	
	public void GetDays(){
		double days;
		days = widgets / 160;
		System.out.println("Number of days to produce is:  " + days + " days");
	}
	
	public static void main (String[] args){
		double number;
		Scanner keyboard = new Scanner(System.in);
		num7 num = new num7();
		System.out.println("enter the number of widgets:  ");
		number = keyboard.nextDouble();
		num.SetWidgets(number);
		num.GetDays();
	}
}
