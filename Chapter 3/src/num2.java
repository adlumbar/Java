
public class num2 {
	
private int yearModel; 
private String make;
private int speed;


public num2() {
	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
	num2 car = new num2();
	car.setYearModel(2016);
	car.setMake("Audi");
	car.setSpeed(30);
	for (int i=0; i < 5; i++){
		car.getaccelerate();
		System.out.println(car.getSpeed());
		
	}
	for (int i = 0; i < 5; i++){
		car.getbrakeing();
		System.out.println(car.getbrakeing());
	}
	
	
}


public int getYearModel() {
	return yearModel;
}

public void setYearModel(int yearModel) {
	this.yearModel = yearModel;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getaccelerate(){
	return speed += 5;
}

public int getbrakeing(){
	return speed -= 5;
}

}


