package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTests {
	public Double startingFuel = 10.0;
	public Double goalVelocity = 10.0;
	
	@Test
	public void TurnOn() {
		Car dummy = new Car();
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		assertTrue(dummy.isRunning);
	}
	
	@Test
	public void TurnOnWithoutFuel() {
		Car dummy = new Car();
		dummy.fuelLevel = 0.0;
		
		dummy.startEngine();
		assertFalse(dummy.isRunning);
	}

	@Test
	public void TurnOnMultipleCars() {
		Car tecow = new Car();
		tecow.fuelLevel = startingFuel;
		Car ticow = new Car();
		ticow.fuelLevel = startingFuel;
		
		tecow.startEngine();
		ticow.startEngine();
		assertTrue(ticow.isRunning && tecow.isRunning);
	}
	
	@Test
	public void AccelerateCar() {
		Car dummy = new Car();
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		dummy.accelerate();
		assertTrue(dummy.velocity > 0);
	}
	
	@Test
	public void AccelerateCarNoFuel() {
		Car dummy = new Car();
		dummy.fuelLevel = 0.0;
		
		dummy.startEngine();
		dummy.accelerate();
		assertFalse(dummy.velocity > 0);
	}
	
	@Test
	public void ReverseCar() {
		Car dummy = new Car();
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		dummy.reverse();
		assertTrue(dummy.velocity < 0);
	}
	
	@Test
	public void ReverseCarNoFuel() {
		Car dummy = new Car();
		dummy.fuelLevel = 0.0;
		
		dummy.startEngine();
		dummy.reverse();
		assertTrue(dummy.velocity == 0);
	}
	
	@Test
	public void ActivateBreaksGoingForward() {
		Car dummy = new Car();
		
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		for (int i=0; i<goalVelocity; i++) {
			dummy.accelerate();
		}
		dummy.activateBreaks();
		assertTrue(dummy.velocity < goalVelocity);
	}
	
	@Test
	public void ActivateBreaksGoingForwardNoNegative() {
		Car dummy = new Car();
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		dummy.accelerate();
		
		dummy.activateBreaks();
		dummy.activateBreaks();
		assertTrue(dummy.velocity == 0);
	}
	
	@Test
	public void ActivateBreaksGoingReverse() {
		Car dummy = new Car();
		
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		for (int i=0; i<goalVelocity; i++) {
			dummy.reverse();
		}
		dummy.activateBreaks();
		assertTrue(dummy.velocity > -goalVelocity);
	}
	
	@Test
	public void ActivateBreaksGoingReverseNoNegative() {
		Car dummy = new Car();
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		dummy.reverse();
		
		dummy.activateBreaks();
		dummy.activateBreaks();
		assertTrue(dummy.velocity == 0);
	}
	
	@Test
	public void AccelerateUntilOutOfFuel() {
		Car dummy = new Car();
		
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		for(int i=0; i<startingFuel; i++) {
			dummy.accelerate();
		}
		
		assertTrue(dummy.fuelLevel == 0);
		assertFalse(dummy.isRunning);
	}
	
	@Test
	public void ReverseUntilOutOfFuel() {
		Car dummy = new Car();
		
		dummy.fuelLevel = startingFuel;
		
		dummy.startEngine();
		for(int i=0; i<startingFuel; i++) {
			dummy.reverse();
		}
		
		assertTrue(dummy.fuelLevel == 0);
		assertFalse(dummy.isRunning);
	}
	
}
