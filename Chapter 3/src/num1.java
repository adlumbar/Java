
public class num1 {
	private String [] name = new String[3];
	private String [] department = new String[3];
	private String [] position = new String[3];
	private int [] idNum = new int[3];
	
	//set and return array of ID numbers
	public void SetIdNum(){ 
		this.idNum[0] = 47889;
		this.idNum[1] = 39119;
		this.idNum[2] = 81774;
		}
	
	public int[] GetIdNum() {
		return idNum;
	}
	
	//Set and return array of names
	public void SetName() {		
		this.name[0] ="Susan Meyers";
		this.name[1] = "Mark Jones";
		this.name[2] = "Joy Rodgers";
		
	}
	
	public String[] getName() {
		return name;
		
	}
	
	//set and return array of departments
	public void SetDepartment() {
		this.department[0] ="Accounting";
		this.department[1] = "IT";
		this.department[2] = "Manufacturing";
		}
	
	public String[] getDepartment() {
		return department;
		
	}
	
	//set and return array of positions
	public void SetPosition() {
		this.position[0] ="VP";
		this.position[1] = "Programmer";
		this.position[2] = "Engineer";
		}
	
	public String[] getPosition() {
		return position;
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get names in array and print to console
		num1 num = new num1();
		num.SetName();
		String name[] = num.getName();
		
		num1 num2 = new num1();
		num2.SetPosition();
		String position[] = num2.getPosition();
		
		num1 num3 = new num1();
		num3.SetDepartment();
		String department[] = num3.getDepartment();
		
		num1 num4 = new num1();
		num4.SetIdNum();
		 int idNum[] = num4.GetIdNum();
		
		for(int i = 0; i < 3; i++){
			System.out.printf( "%s    %s         %s          %s \n",idNum[i], name[i],position[i],department[i]);
			
		}		
	}	
}

	

	





