import java.util.Random;
public class lottery {
	private int lotteryNumbers[]; //lottery numbers
	public lottery(){
		Random rand = new Random(System.currentTimeMillis());
		lotteryNumbers = new int[5];
		for (int i = 0; i < lotteryNumbers.length; i++){
			lotteryNumbers[i] = Math.abs(rand.nextInt()) % 10;
		}
	}
	//The method is to compare the corresponding elements 
	//in the two arrays
	
	public int compareNumbers(int[] usersNumbers){
		int match = 0;
		if(usersNumbers.length == lotteryNumbers.length){
			for (int i = 0; i< lotteryNumbers.length; i++){
				if (usersNumbers[i] == lotteryNumbers[i]){
					match++;
				}//end nested if
			}//end for
		}//end if
		return match;
	}
}
