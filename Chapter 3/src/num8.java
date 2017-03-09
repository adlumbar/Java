
import java.util.Scanner;

public class num8 {
	//setting score variables
private double score1;
private double score2;
private double score3;
public num8(){
score1 = 0;
score2 = 0;
score3 = 0;
}
public num8(int s1, int s2, int s3){
score1 = s1;
score2 = s2;
score3 = s3;
}
//get set
public double getScore1() {
return score1;
}

public void setScore1(double userInput) {
this.score1 = userInput;
}

public double getScore2() {
return score2;
}

public void setScore2(double userInput) {
this.score2 = userInput;
}

public double getScore3() {
return score3;
}

public void setScore3(double userInput) {
this.score3 = userInput;
}
public double getAvg(){
return (score1 + score2 + score3)/3;
}
public static void main(String [] args){
	//getting user inputs
double userInput;
Scanner keyboard = new Scanner(System.in);
num8 num = new num8();
System.out.println("Enter score number 1:  ");
userInput = keyboard.nextDouble();
num.setScore1(userInput);
System.out.println("Enter score number 2:  ");
userInput = keyboard.nextDouble();
num.setScore2(userInput);
System.out.println("Enter score number 3:  ");
userInput = keyboard.nextDouble();
num.setScore3(userInput);

//printing out averages
System.out.println("The average of the tests is " + num.getAvg());
}

}
