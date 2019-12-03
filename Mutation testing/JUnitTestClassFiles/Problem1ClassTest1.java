package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest1 {
	
	private Problem1Class problem1;

	@Before
	public void setUp() throws Exception {
		problem1 = new Problem1Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem1TestCaseTable.csv")
	public void determineTotalTest(int testCaseNo, double cart, boolean coupon, int memberPoints, int items, boolean member, double taxRate, 
			double result, String bPath, String mcdc, String factorstr) {
		
		assertEquals(result, problem1.determineTotal(cart, member, items, coupon, memberPoints, taxRate), 0.006);
		
	}

}
