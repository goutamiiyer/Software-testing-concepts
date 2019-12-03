package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	
	private Problem3Class problem3;

	@Before
	public void setUp() throws Exception {
		problem3 = new Problem3Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem3TestCaseTable.csv")
	public void calcPrevDayNumTest(int testCaseNo, int month, int day, int year, int result, String mcdc) {
		assertEquals(result, problem3.calcPrevDayNum(month, day, year));
	}

}
