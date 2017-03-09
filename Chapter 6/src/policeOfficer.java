public class policeOfficer {
    private String name; //Officers Name
    private int badgeNum; //Officer's badge number
    private parkedCar parkedCar; //Parked car object
    private parkingMeter parkingMeter; //parking meter object
    private parkingTicket parkingTicket; //parking ticket object
    /**
     * No arg constructor to initialize the field 
     * values
     */
    public policeOfficer() {
        this.name = "";
        this.badgeNum = 0;
    }
    //constructor to set name badgenum parked car parkingmeter
    public policeOfficer(String name, int badgeNum, parkedCar parkedCar, parkingMeter parkingMeter) {
        this.name = name;
        this.badgeNum = badgeNum;
        this.parkedCar = new parkedCar(parkedCar);
        this.parkingMeter = new parkingMeter(parkingMeter);
    }
    //constructor to set name badgenum parked car parkingmeter
    public policeOfficer(policeOfficer policeOfficer , parkedCar parkedCar, parkingMeter parkingMeter, parkingTicket parkingTicket) {
	
    	this.parkedCar = new parkedCar(parkedCar);
    	this.parkingMeter = new parkingMeter(parkingMeter);
    	this.parkingTicket = new parkingTicket(parkingTicket);
    }
   
    //
    public policeOfficer(policeOfficer policeOfficer){
    	this.name = policeOfficer.name;
    	this.badgeNum = policeOfficer.badgeNum;
    }
    /*
     * 
     * Copy constructor to duplicate a 
     * police officer object
     */
    public policeOfficer(String name, int badgeNum){
    	this.name = name;
    	this.badgeNum= badgeNum;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBadgeNum() {
        return badgeNum;
    }
    public void setBadgeNum(int badgeNum) {
        this.badgeNum = badgeNum;
    }
    public parkedCar getParkedCar() {
        return new parkedCar(parkedCar);
    }
    public void setParkedCar(parkedCar parkedCar) {
        this.parkedCar = new parkedCar(parkedCar);
    }
    public parkingMeter getParkingMeter() {
        return new parkingMeter(parkingMeter);
    }
    public void setParkingMeter(parkingMeter parkingMeter) {
        this.parkingMeter = new parkingMeter(parkingMeter);
    }
    
    public parkingTicket getParkingTicket() {
        return parkingTicket;
    }
    public void setParkingTicket(parkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
    
    //see if the car is over minutes
    public void examineCar(){
    	if ((parkedCar.getNumMinutesParked() > parkingMeter.getNumMinutesPurchased())){
    		issueParkingTicket();
    	}
    }
    //issue the parking ticket to 
    public void issueParkingTicket(){
    	System.out.println("Parking ticket" +
    					"\n ******************** \n" +
    			"Car Info :" + "\n" + parkingTicket.getParkedCarReport(parkedCar)+
    			"police Officer Info : " + parkingTicket.getPoliceOfficerReport() +
    			"Fine: " + parkingTicket.getParkingFine(parkedCar, parkingMeter));
    			
    }
    
    @Override
    public String toString() {
        String str;
        str = "Officer Name: " + name + "\n" + 
                "Badge Number: " + badgeNum + "\n"  ;
                
        return str;
    }
    
    
    
}
