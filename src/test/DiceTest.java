package test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.nagesh.learneroo.*;

public class DiceTest {

	Dice dice = new Dice();
	
	@Test
	public void rollingTwoInequalNumbers_shouldReturnTheirSum() {
		assertEquals(5, dice.roll(2, 3));
	}

	@Test
	public void rollingTwoEqualNumbers_shouldReturnDoubleTheirSum() {
		assertEquals(20, dice.roll(5, 5));
	}
	
	@Test
	public void rollingAnyInvalidValues_shouldReturnNegativeOne() {
		assertEquals(-1, dice.roll(0, 7));
	}
	
}
