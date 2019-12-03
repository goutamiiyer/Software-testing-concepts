package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {
	
	private Problem5Class problem5;

	@Before
	public void setUp() throws Exception {
		problem5 = new Problem5Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem5TestCaseTable.csv")
	public void determineTotalTestTwo(int testCaseNo, double cart, boolean coupon, 
			int memberPoints, int items, boolean member, double taxRate, 
			double result, String bPath, String mcdc) {
		
		assertEquals(result, problem5.determineTotal(cart, member, items, coupon, memberPoints, taxRate), 0.006);
	}

}
