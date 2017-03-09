import java.util.Scanner;

public class driverExamLauncher {

	public static void main(String[] args) {
		System.out.println("Drivers ED Exam");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("20 question test, mark A,B,C,D");
		
		//inputting String 
		String []answers = new String[20];
		String answer;
		for (int i =0;i<20;i++){
			do{
				System.out.print((i + 1) + ":");
				answer = keyboard.nextLine();
			}//end do
			while(!isValidAnswer(answer));
			answers[i] = answer;
		}//end for
		
		driverExam exam = new driverExam(answers);
		//result
		System.out.println("RESULTS");
		//outputting total correct
		System.out.println("Total Correct: " + exam.totalCorrect());
		//outputting total incorrect
		System.out.println("Total Incorrect: " + exam.totalIncorrect());
		
		String passed = exam.passed() ?"YES" : "NO";
		
		//result pass or fail
		System.out.println("Passed: " + passed);
		if(exam.totalIncorrect() > 0){
			System.out.println("The incorrect answers are: ");
			int missedIndex;
			for (int i = 0; i< exam.totalIncorrect(); i ++){
				missedIndex = exam.questionsMissed()[i] +1; 
				System.out.print(" " + missedIndex);
			}//end for
		}//end if
	}//end main
	
	//Returns true when the answer is valid 
	public static boolean isValidAnswer(String answer){
		return "A".equalsIgnoreCase(answer) ||
				"B".equalsIgnoreCase(answer) ||
				"C".equalsIgnoreCase(answer) ||
				"D".equalsIgnoreCase(answer);
	}

}//end class
