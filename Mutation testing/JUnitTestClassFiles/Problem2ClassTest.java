package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {
	
	private Problem2Class problem2;

	@Before
	public void setUp() throws Exception {
		problem2 = new Problem2Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem2TestCaseTable.csv")
	public void autoBrakingTest(int testCaseNo, double distance, double speed, boolean cruiseEngaged, 
			boolean applyBrakes, double brakingFactor, String bPath, String mcdc) {
		
		problem2.autoBraking(distance, speed, cruiseEngaged);
		assertEquals(brakingFactor, problem2.getBrakingFactor(), 0.001);
		assertEquals(applyBrakes, problem2.isApplyBrakes());
	}

}
