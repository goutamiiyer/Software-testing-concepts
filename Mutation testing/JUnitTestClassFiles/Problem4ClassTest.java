package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.easymock.EasyMock;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	
	double batteryPower;
	Problem4ServerData mockobj;
	Problem4Class problem4;

	@Before
	public void setUp() throws Exception {
		problem4 = new Problem4Class();
		mockobj = EasyMock.strictMock(Problem4ServerData.class);
	}

	@Test
	@FileParameters("src/Homework5/Problem4TestCaseTable.csv")
	public void calcLightsTest(int testCaseNo, double batteryPower, boolean redLight, 
			boolean yellowLight, boolean greenLight, boolean bell, boolean siren, String bPath) {
		
		EasyMock.expect(mockobj.getBatteryPower()).andReturn(batteryPower);
		EasyMock.replay(mockobj);
		
		problem4.calcLights(mockobj);
		assertEquals(redLight, problem4.isRedLight());
		assertEquals(yellowLight, problem4.isYellowLight());
		assertEquals(greenLight, problem4.isGreenLight());
		assertEquals(bell, problem4.isBell());
		assertEquals(siren, problem4.isSiren());
	}

}
