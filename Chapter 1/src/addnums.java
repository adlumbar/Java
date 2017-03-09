
public class addnums {

	int num1, num2, result; 
	
	public addnums(int one , int two) {
		// TODO Auto-generated constructor stub
		num1 = one;
		num2 = two;
		 result = one + two;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addnums num1 = new addnums(2,3);
		addnums num2 = new addnums(3,4);
		addnums num3 = new addnums(5,6);
		addnums num4 = new addnums(7,8);
		addnums num5 = new addnums(9,10);
		

	}

}
