import java.util.ArrayList;
public class arraylist {
	public static void main(String []args){
		//create an array list to hold some names
		ArrayList<String> nameList = new ArrayList<String>();
		//add names to array list
		nameList.add("Jimmy");
		nameList.add("Billy");
		nameList.add("Phil");
		
		System.out.println("The Array List has" + nameList.size() +
				"objects in it");
	}
}
