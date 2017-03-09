import java.util.Scanner;

public class Num4Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Essay p1 = new Essay(1,2,3,4);
		
		System.out.println("Enter the grammar Score: ");
		double grammar = keyboard.nextDouble();
		while(grammar < 0 || grammar > 30){
			System.out.println("INVALID ");
			System.out.println("Enter the grammar score: ");
			grammar = keyboard.nextDouble();
		
		}
		
		System.out.println("Enter the spelling Score: ");
		double spelling = keyboard.nextDouble();
		while(spelling < 0 || spelling > 20){
			System.out.println("INVALID ");
			System.out.println("Enter the spelling score: ");
			spelling = keyboard.nextDouble();
		
		}
		
		System.out.println("Enter the length Score: ");
		double length = keyboard.nextDouble();
		while(length < 0 || length > 20){
			System.out.println("INVALID ");
			System.out.println("Enter the length score: ");
			length = keyboard.nextDouble();
	
		}
		
		System.out.println("Enter the content Score: ");
		double content = keyboard.nextDouble();
		while(content < 0 || content > 30){
			System.out.println("INVALID ");
			System.out.println("Enter the content score: ");
			content = keyboard.nextDouble();
		
		}
		
		p1.setGrammarGrade((int) grammar);
		p1.setLengthGrade((int) length);
		p1.setContentGrade((int) content);
		p1.setSpellingGrade((int) spelling);
		p1.getOverallGrade();
		
		System.out.println("The grammar grade is " + p1.getGrammarGrade());
		System.out.println("The spelling grade is " + p1.getSpellingGrade());
		System.out.println("The content grade is " + p1.getContentGrade());
		System.out.println("The length grade is " + p1.getLengthGrade());
		System.out.println("The student grade is " + p1.getGrade());
		
	}

}
