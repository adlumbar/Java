import java.util.Scanner;

public class num10 {

private String name;
private String type;
private int age;
//setting variables
	public num10() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		//getting inputs
		Scanner keyboard= new Scanner(System.in);
		num10 num = new num10();
		System.out.print("Enter pets name: ");
		String name = keyboard.nextLine();
		num.setName(name);
		System.out.print("Enter pet type: ");
		String type = keyboard.nextLine();
		num.setType(type);
		System.out.print("Enter your pets age: ");
		int age = keyboard.nextInt();
		num.setAge(age);
		System.out.printf("Your %s, named %s is %d years old", num.getType(),
		num.getName(), num.getAge());

		}
	}
