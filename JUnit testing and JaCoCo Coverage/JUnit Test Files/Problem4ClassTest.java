package Homework3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	
	private Problem4Class problem4;

	@Before
	public void setUp() throws Exception {
		problem4 = new Problem4Class();
	}

	@Test
	@FileParameters("src/Homework3/Problem4TestCaseTable.csv")
	public void landCraftTest(int testCaseNo, boolean landing, double speed, double altitude,
			Problem4Class.landing action, String bPath, String mcdcStmt) {
		problem4.landCraft(landing, altitude, speed);
		assertEquals(action, problem4.getAction());
	}

}
