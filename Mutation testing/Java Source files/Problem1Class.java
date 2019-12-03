package Homework5;

public class Problem1Class {
	
	public double determineTotal (double cart, boolean member, int items, boolean coupon, int memberPoints, double taxRate) {
		double factor;

		if (cart > 5_000.00)
			factor = 0.75;
		else
			if (cart >= 2_000.00)
				factor = 0.80;
			else
				if (cart > 1_250.00)
					factor = 0.85;
				else
					if (cart >= 350.00)
						factor = 0.90;
					else
						factor = 1.00;

		return ((coupon) && (memberPoints >= 1_000) || (items > 10) || member) ? (1+taxRate)*(factor)*cart : (1+taxRate)*cart;
	}
}