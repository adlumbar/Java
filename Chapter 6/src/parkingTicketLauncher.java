
public class parkingTicketLauncher {

	public static void main(String[] args) {
		parkedCar car = new parkedCar("Mazda" , "Miata" ,"LMD456", 185);
		parkingMeter meter= new parkingMeter(30);
		policeOfficer officer1 = new policeOfficer("officer Lutes" ,45678 );
		parkingTicket ticket = new parkingTicket(meter, car, officer1);
		policeOfficer officer2 = new policeOfficer(officer1, car , meter , ticket);
		officer2.examineCar();
			

	}

}
