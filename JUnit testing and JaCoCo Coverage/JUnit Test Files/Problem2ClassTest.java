package Homework3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Problem2ClassTest {
	
	private Problem2Class problem2;
	
	private double premium;
	private boolean policyHolder;
	private int yearsMember;
	private boolean multiPolicies;
	private int safetyRating;
	private double taxRate;
	private boolean primeStatus;
	private double totalPremium;
	

	@Before
	public void setUp() throws Exception {
		problem2 = new Problem2Class();
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			// Parameters are: (1, 2, 3, 4, 5, 6)
			//					1 = premium, 2 = policyHolder, 3 = yearsMember, 4 = multiPolicies, 
			//					5 = safetyRating, 6 = taxRate
			// Test Case 1
			{5000.01, true, 5, true, 500, 0.0825},
			// Test Case 2
			{2000.00, true, 6, false, 500, 0.0825},
			// Test Case 3
			{1250.01, true, 6, false, 500, 0.0825},
			// Test Case 4
			{350.00, true, 6, false, 500, 0.0825},
			// Test Case 5
			{349.99, true, 6, false, 500, 0.0825},
			// Test Case 6
			{349.99, false, 6, false, 501, 0.0825},
			// Test Case 7
			{349.99, false, 5, true, 501, 0.0825},
			// Test Case 8
			{349.99, false, 5, false, 501, 0.0825},
			// Test Case 9
			{349.99, false, 5, true, 500, 0.0825},
			// Test Case 10
			{1250.00, true, 6, false, 500, 0.0825},
			// Test Case 11
			{1999.99, true, 6, false, 500, 0.0825},
			// Test Case 12
			{5000.00, true, 5, true, 500, 0.0825},
			// Test Case 13
			{0.00, false, 6, false, 501, 0.0825},
			// Test Case 14
			{10000.00, false, 6, false, 501, 0.0825},
			// Test Case 15
			{349.99, false, 5, true, 1, 0.0825},
			// Test Case 16
			{349.99, false, 5, true, 999, 0.0825},
			// Test Case 17
			{349.99, false, 0, true, 500, 0.0825},
			// Test Case 18
			{349.99, false, 50, true, 500, 0.0825}
		});
	}

	public Problem2ClassTest(double premium, boolean policyHolder, int yearsMember, boolean multiPolicies, 
			 int safetyRating, double taxRate) {
		this.premium = premium;
		this.policyHolder = policyHolder;
		this.yearsMember = yearsMember;
		this.multiPolicies = multiPolicies;
		this.safetyRating = safetyRating;
		this.taxRate = taxRate;
	}
	
	@Test
	public void determineInsPremiumTest() {
		problem2.setPrimeStatus(primeStatus);
		problem2.setTotalPremium(totalPremium);
		problem2.determineInsPremium(premium, policyHolder, yearsMember, multiPolicies, safetyRating, taxRate);
		assertEquals(primeStatus, problem2.isPrimeStatus());
		assertEquals(totalPremium, problem2.getTotalPremium(), 0.01);
	}

}
