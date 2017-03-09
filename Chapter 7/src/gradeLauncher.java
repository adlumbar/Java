import java.util.Scanner;

public class gradeLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//create scanner object
		grade gr = new grade();//create grade object
		
		//sets student
		for(int i = 0; i < 5; i++){
			System.out.println("Enter the students name :");
			String student = keyboard.nextLine();
			gr.setName(student);
			if (i == 0){
				gr.setStudent1();
			}else if(i == 1){
				gr.setStudent2();
			}else if (i == 2){
				gr.setStudent3();
			}else if(i == 3){
				gr.setStudent4();
			}else if(i == 4){
				gr.setStudent5();
			}
			
			gr.getCount();
		}
		//gets student name and prints out average grade
		for(int i = 0; i <gr.getStudentNumber(); i++){
			System.out.println(gr.getName()[i]+ "s Average is "
					+ gr.getAVG()[i]+ " with a letter grade "
					+ "of " + gr.getLetter()[i]);
		}

	}

}
