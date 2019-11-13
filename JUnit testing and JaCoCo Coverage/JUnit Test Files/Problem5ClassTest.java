package Homework3;

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
	@FileParameters("src/Homework3/Problem5TestCaseTable.csv")
	public void calcYtest(int testCaseNo, double x, double y, String bPath) {
		problem5.calcY(x);
		assertEquals(y, problem5.calcY(x), 0.001);
	}

}
