import java.text.DecimalFormat;

public class parkingTicket {
	private parkingMeter parkingMeter;
	private parkedCar parkedCar;
	private policeOfficer policeOfficer;
	

	/**
	 * @param parkingMeter
	 * @param parkedCar
	 * @param policeOfficer
	 */
	public parkingTicket(parkingMeter parkingMeter, parkedCar parkedCar, policeOfficer policeOfficer) {
		this.parkingMeter = new parkingMeter (parkingMeter);
		this.parkedCar = new parkedCar(parkedCar);
		this.policeOfficer = new policeOfficer (policeOfficer);
	}
	
	 public parkingTicket(parkingTicket parkingTicket){
	    	this.parkingMeter = new parkingMeter(parkingTicket.parkingMeter);
	    	this.parkedCar = new parkedCar(parkingTicket.parkedCar);
	    	this.policeOfficer = new policeOfficer(parkingTicket.policeOfficer);
	    }
	/*
	 * returns a string with objects make , model
	 *  and license plate number 
	 * 
	 */
	public String getParkedCarReport(parkedCar parkedCar){
		return new parkedCar(parkedCar).toString();
		
	}
	
	public String getPoliceOfficerReport(){
		return new policeOfficer(policeOfficer).toString();
	}
	
	/*
	 * returns a string with parking fine
	 */
	public String getParkingFine(parkedCar parkedCar, parkingMeter parkingMeter){
		//Create a decimal Formatter 
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		double fine = 0;
		 String str = "";
		double minutesOver = parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased();
		//Determine if the car is illegally parked 	
			if (minutesOver > 0){ 
				fine += 25; //base fine for the first hour
				
				if(minutesOver > 60.0 ){
					//Calculate the number of hours that the car is illegally parked and multiply
					// the (minutesOver -1 *)
					fine += Math.ceil((minutesOver - 60.0)/60.0) * 10.0;
					
					
				}//End if
		}//End if
		
		str += "fine:" + formatter.format(fine);
		
		return str;
		
		
	}//End getParkingFine

}//End class
