import java.util.Scanner;

public class Num1Launcher
{
    
    public static void main(String[] args)
    {
        String name; 
        String number; 
        String hireDate; 
        int shift;
        double payRate; 
         
        Scanner s = new Scanner(System.in);
         
        System.out.println("Enter your name: ");
        name = s.nextLine();
         
        System.out.println("Enter your employee number: ");
        System.out.println("(Format: NNN-L)");
        number = s.nextLine();
                 
        System.out.println("Enter your hire date: ");
        hireDate = s.nextLine();
         
        System.out.println("Enter your payrate: ");
        payRate = s.nextDouble();
         
        System.out.println("Enter your shift (day=1, night=2): ");
        shift = s.nextInt();
         
         
         
        //Production worker object
        ProductionWorker myWorker = new ProductionWorker(name, number, hireDate, shift, payRate);
        
        // create a new basic employee object
        Employee ee = new Employee("George Jackman", "123-A", "3/3/2012");

        // print out the basic employee object
        System.out.println("\nThis is a basic employee object: ");
        System.out.println(ee);

        // create a Production Worker object
        ProductionWorker pw1 = new ProductionWorker("John Doe", "456-B", "9/7/2011", 2, 30.00);

        // create a copy of the first Production Worker object
        ProductionWorker pw2 = new ProductionWorker(pw1);

        // print out the first Production Worker object
        System.out.println("\nThis is the first Production Worker object: ");
        System.out.println(pw1);

        // print out the second Production Worker object
        System.out.println("\nThis is the second Production Worker object: ");
        System.out.println(pw2);

        // create a Shift Supervisor object
        ShiftSupervisor ss1 = new ShiftSupervisor("Billy Bob", "789-C", "8/8/1988", 1500, 3000);

        // create a copy of the first Shift Supervisor object
        ShiftSupervisor ss2 = new ShiftSupervisor(ss1);

        // print out the first Shift Supervisor object
        System.out.println("\nThis is the first Shift Supervisor object: ");
        System.out.println(ss1);

        // print out the second Shift Supervisor object
        System.out.println("\nThis is the second Shift Supervisor object: ");
        System.out.println(ss2);

        // create a Team Leader object
        TeamLeader tl1 = new TeamLeader("Jane Johnson", "901-D", "11/10/2011", 1, 15.00, 1500, 100, 50);

        // create a copy of the first Team Leader object
        TeamLeader tl2 = new TeamLeader(tl1);

        // print out the first Team Leader object
        System.out.println("\nThis is the first Team Leader object: ");
        System.out.println(tl1);

        // print out the second Team Leader object
        System.out.println("\nThis is the second Team Leader object: ");
        System.out.println(tl2);
         
        System.out.println("---------- Employee Info -----------");
        System.out.println("Name: " + myWorker.getName());
        System.out.println("Employee Number: " + myWorker.getNumber());
        System.out.println("Hire Date: " + myWorker.getHireDate());
        System.out.println("Pay Rate: " +myWorker.getPayRate());
        System.out.println("Shift: " +myWorker.getShift());
    }
     
     
}