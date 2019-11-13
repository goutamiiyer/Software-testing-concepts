package Homework3;

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
	@FileParameters("src/Homework3/Problem3TestCaseTable.csv")
	public void setWarningsTest(int testCaseNo, double distance, boolean cruiseRequested, double speed,
			boolean redLight, boolean yellowLight, boolean greenLight, boolean caution, boolean warning,
			boolean cruiseEngaged, String bPath, String mcdcStmt) {
		problem3.setWarnings(cruiseRequested, distance, speed);
		assertEquals(redLight, problem3.isRedLight());
		assertEquals(yellowLight, problem3.isYellowLight());
		assertEquals(greenLight, problem3.isGreenLight());
		assertEquals(caution, problem3.isCaution());
		assertEquals(warning, problem3.isWarning());
		assertEquals(cruiseEngaged, problem3.isCruiseEngaged());
	}

}
