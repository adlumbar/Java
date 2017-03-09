
public class largerThan {

	public static void main(String[] args) {
		//an array if integer values
		int array[] = {1,2,3,4,5,6,7,8,9};
		
		//set element n = 3
		int n = 3;
		System.out.println("array elements");
		//print array element
		for (int i = 0; i< array.length; i ++)
			System.out.println(array[i]);
		System.out.println("n = " + n);
		System.out.println("Elements larger than " + n);
		
		//call print larger than
		printLargerThan(array, n);

	}//end main 
	
	/*
	 * The method that
	 *  takes an array and n
	 * and prints the elements which
	 *  are greater than n value
	 */

	private static void printLargerThan(int []array, int n){
		// run for loop that prints elements greater than n
		for (int i = 0; i < array.length; i++){
			//check if element at index i is greater than n
			if (array[i] > n){
				System.out.println("Element: " + array[i]);
			}//end if
		}//end for
	}//end method
}//end class
