
public class num10 {

	public class FreezeAndBoiling {

		public double temperature;
		public FreezeAndBoiling(double t) {
			temperature = t;
		}
		public double getTemperature() {
			return temperature;
		}
		public boolean EAFreezing() {

			if (temperature <= -173.0) {
				return true;
			} else {
				return false;
			}
		}
		public boolean EABoiling() {

			if (temperature >= 172.0) {
				return true;
			} else {
				return false;
			}
		}

		 //Method 
		public boolean OFreezing() {

			if (temperature <= -362.0) {
				return true;
			} else {
				return false;
			}
		}		
		 //Method 
		public boolean OBoiling() {
			if (temperature >= -306.0) {
				return true;
			} else {
				return false;
			}
		}
		  //Method freeze
		public boolean WFreezing() {

			if (temperature <= 32.0) {
				return true;
			} else {
				return false;
			}
		}
		 // Method 
		public boolean WBoiling() {

			if (temperature >= 212.0) {
				return true;
			} else {
				return false;
			}
		}
	}
}

