package Homework3;

import static org.junit.Assert.*;

import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
	private Problem1Class problem1;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersforProblem1ClassTest () {
		return $(
				// Parameters are: (1, 2, 3, 4, 5, 6)
				// 				    1 = batteryPower, 2 = red, 3 = yellow, 4 = green, 5 = bell, 6 = siren	 
				// Test case 1
				$(0.0, false, false, false, false, true),
				// Test Case 2
				$(49.9, false, false, false, true, false),
				// Test Case 3
				$(75.0, true, false, false, false, false),
				// Test Case 4
				$(124.9, true, true, false, false, false),
				// Test Case 5
				$(250.0, false, true, false, false, false),
				// Test Case 6
				$(250.1, false, false, true, false, false),
				// Test Case 7
				$(0.1, false, false, false, true, false),
				// Test Case 8
				$(50.0, true, false, false, false, false),
				// Test Case 9
				$(75.1, true, true, false, false, false),
				// Test Case 10
				$(125.0, false, true, false, false, false),
				// Test Case 11
				$(1000.0, false, false, true, false, false)
				);
	}
	
	@Before
	public void setUp() throws Exception {
		problem1 = new Problem1Class();
	}

	@Test
	@Parameters(method = "parametersforProblem1ClassTest")
	public void calcLightsTest(double batteryPower, boolean redLight, boolean yellowLight, boolean greenLight, boolean bell, boolean siren) {
		problem1.calcLights(batteryPower);
		assertEquals(redLight, problem1.isRedLight());
		assertEquals(yellowLight, problem1.isYellowLight());
		assertEquals(greenLight, problem1.isGreenLight());
		assertEquals(bell, problem1.isBell());
		assertEquals(siren, problem1.isSiren());
	}

}
