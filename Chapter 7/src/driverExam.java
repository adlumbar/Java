
public class driverExam {
	//an array of student answers
	private String [] correctAnswers = {"B","D","A","A",
			"C","A","B","A","C","D","B","C","D","A","D",
			"C","C","B","D","A"};
	
	//store the users answers
	private String [] userAnswers;
	int[]missed = new int[correctAnswers.length];
	
	//process the user answers
	public driverExam(String[]Answers){
		userAnswers = new String [Answers.length];
		for (int i = 0; i <Answers.length; i++){
			userAnswers[i] = Answers[i];
		}
	}
	//returns boolean if correct answers > 15
	public boolean passed(){
		if (totalCorrect() >= 15)
			return true;
		else
			return false;
	}
	//correct answers
	public int totalCorrect(){
		int correctCount = 0;
		for (int i = 0; i <correctAnswers.length; i++){
			if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])){
				correctCount++;
			}//end if
		}//end for
		return correctCount;
	}
	
	//total incorrect
	public int totalIncorrect(){
		int incorrectCount = 0;
		for (int i = 0; i <correctAnswers.length; i++){
			if (!userAnswers[i].equalsIgnoreCase(correctAnswers[i])){
				missed[incorrectCount] = i;
				incorrectCount++;
			}//end if
		}//end for
		return incorrectCount;
	}
	
	//missed questions
	public int[] questionsMissed(){
		return missed;
	}
}
