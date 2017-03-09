
public class inventoryItemLauncher {

	public static void main(String[] args) {
		inventoryItem inventory1 = new inventoryItem();
		inventoryItem inventory2 = new inventoryItem();
		
		System.out.println("The amount in account 1 is " + inventory1.getBalance());
		System.out.println("The amount in account 2 is " + inventory2.getBalance());
		
	}
}
