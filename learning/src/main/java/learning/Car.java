package learning;

public class Car {
	Double engine;
	Double fuelLevel;
	Double velocity;
	boolean isRunning;
	
	/**
	 * Default creator
	 * @return Car object with default values
	 */
	public Car() {
		engine = 1.0;
		fuelLevel = 0.0;
		velocity = 0.0;
		isRunning = false;
	}
	
	/**
	 * Constructor to specify engine power, other parameters are defaults
	 * @param _engine = Engine power eg: 1.0
	 */
	public Car(Double _engine) {
		engine = _engine;
		fuelLevel = 0.0;
		velocity = 0.0;
		isRunning = false;
	}
	
	/**
	 * Checks if there is at least 1 unit of fuel necessary to actuate the car.
	 * 
	 * If there isn't fuel, the engine will be turned off
	 */
	public boolean checkFuel() {
		if (fuelLevel>0) return true;
		
		else {
			isRunning = false;
			return false;
		}
	}
	
	/**
	 * Sets the Car's fuelLevel
	 * @param _fuel
	 * @return success state (true/false)
	 */
	public boolean setFuel(Double _fuel) {
		fuelLevel = _fuel;
		return true
	}
	
	public double getEnginePower() {
		if(this.engine!=null) return this.engine;
		else return 1.0;
	}
	
	/**
	 * Changes isRunning from false to true, representing that the engine is Running.
	 * The fuel cost for turning on the engine is determined by the engine
	 * 
	 * Checks if there is fuel and if the engine is not running.
	 */
	public void startEngine() {
		if (isRunning) {
			System.out.println("Failed to Start Engine: Engine is already running!");
		}
		else {
			if (checkFuel()){
				fuelLevel-= getEnginePower();
				isRunning = true;
			} 
			else {
				System.out.println("Failed to Start Engine: No fuel!");
			}
		}
	}
	
	/**
	 * Accelerates the car, positive velocity change
	 * 
	 * Checks if the car is on and if there is fuel;
	 * If there is no fuel, the engine will be turned off!
	 * 
	 * The velocity change and fuel consumption is determined by the engine
	 */
	public void accelerate() {
		if (this.isRunning && checkFuel() ) {
			System.out.println("Going VRROOOOOOMMMMMMMMMMMMMM!");
			velocity+= getEnginePower();
			fuelLevel-= getEnginePower();
		}
		else {
			System.out.println("Acceleration failed! No fuel or the car is turned off");
		}
	}
	
	/**
	 * Reverse gear of the car, negative velocity change
	 * 
	 * Checks if the car is on and if there is fuel;
	 * If there is no fuel, the engine will be turned off!
	 * 
	 * The velocity change and fuel consumption is determined by the engine
	 */
	public void reverse() {
		if (this.isRunning && checkFuel() && this.velocity<=0) {
			System.out.println("Going reverse!");
			velocity -= getEnginePower();
			fuelLevel -= getEnginePower();
		}
		else {
			System.out.println("Reverse acceleration failed! No fuel, the car is turned off of not stationary");
		}
	}
	
	/**
	 * Breaks the car, negative velocity change
	 * 
	 * If the car is moving, reduces velocity;
	 */
	public void activateBreaks() {
		if (this.velocity > 0) {
			System.out.println("Breaking: RRREEEEEE!");
			velocity--;
			velocity = (this.velocity < 0)? 0 : this.velocity;
		}
		else {
			System.out.println("Breaking in reverse mode: rrreeee!");
			velocity ++;
			velocity = (this.velocity > 0)? 0 : this.velocity;
		}
	}
	
}
