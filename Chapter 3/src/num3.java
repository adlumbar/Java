
public class num3 {
	//setting private variables
	private String name;
	private String address;
	private int age;
	private String phone;

	public num3() {
		// TODO Auto-generated constructor stub
		
	}
	//get / sets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num3 personal = new num3();
		personal.setAddress("3889 Stanton Court");
		personal.setAge(21);
		personal.setName("Adam");
		personal.setPhone("716-748-5112");
		num3 family = new num3();
		family.setAddress("45 Main Street");
		family.setName("Mitch");
		family.setAge(24);
		family.setPhone("716-868-4545");
		//printing to console
		System.out.println(family.getName());
		System.out.println(family.getAddress());
		System.out.println(family.getAge());
		System.out.println(family.getPhone());
		System.out.println("");
		System.out.println(personal.getName());
		System.out.println(personal.getAddress());
		System.out.println(personal.getAge());
		System.out.println(personal.getPhone());
		
		
	}

}
