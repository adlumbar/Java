
public class employee {
	
	private String name;
	private String department;
	private String position;
	private int idNum;
	
	public employee(){
		setName("");
		setDepartment("");
		setPosition("");
		setIdNum(0);
	}
	
	public employee(String n , int num, String pos,String dept){
		setName(n);
		setDepartment(dept);
		setPosition(pos);
		setIdNum(num);
	}
	
	public employee(String n, int num){
		setName(n);
		setDepartment("");
		setPosition("");
		setIdNum(num);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the idNum
	 */
	public int getIdNum() {
		return idNum;
	}

	/**
	 * @param idNum the idNum to set
	 */
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	

}
