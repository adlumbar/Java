
	class FuelGauge {

		final static int MAXIMUM_GALLONS = 15;

		private int gallons;

		public FuelGauge() {
			gallons = 0;
		}

		/**
		 * Constructor should initialize the number of gallons of gas. If the
		 * gallons is greater than the max it will default to the max.
		 * 
		 * TODO: If gallons is greater than max throw GasOverflowException
		 * 
		 * @param gallons
		 */
		public FuelGauge(int gallons) {
			if (gallons <= MAXIMUM_GALLONS) {
				this.gallons = gallons;
			} else {
				gallons = MAXIMUM_GALLONS;
			}
		}

		public int getGallons() {
			return gallons;
		}

		/**
		 * Method will add one gallon, if gallon is greater than the max for the
		 * tank then a message will be output.
		 */
		public void addGallons() {
			if (gallons < MAXIMUM_GALLONS) {
				gallons++;
			} else {
				// TODO: see constructor, throw GasOverflowException
				System.out.println("Too much fuel");
			}
		}

		/**
		 * Burn fuel will reduce the gallons in the tank by 1, if the fuel tank
		 * is empty then a message will be outputed.
		 * 
		 * TODO: Instead of outputting out of fuel, throw a
		 * GasTankEmptyException
		 */
		public void burnFuel() {
			if (gallons > 0) {
				gallons--;
			} else {
				System.out.println("out of fuel");
			}
		}
	}