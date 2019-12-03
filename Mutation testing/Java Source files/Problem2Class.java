package Homework5;

public class Problem2Class {
	
	private boolean applyBrakes;
	private double brakingFactor;

	public void autoBraking (double distance, double speed, boolean cruiseEngaged) {
		if (distance > 1_000.0)
			brakingFactor=1.0;
		else
			if (distance >= 500.0)
				brakingFactor=1.05;
			else
				if (distance > 250.0)
					brakingFactor=1.1;
				else
					if (distance >= 100.0)
						brakingFactor=1.25;
					else
						brakingFactor=1.5;

		applyBrakes = speed >= 50.0 && speed < 85.0 && distance <= 1_000.0 && cruiseEngaged;
	}
	public void setBrakingFactor(double brakingFactor) {
		this.brakingFactor = brakingFactor;
	}
	public boolean isApplyBrakes() {
		return applyBrakes;
	}

	public void setApplyBrakes(boolean applyBrakes) {
		this.applyBrakes = applyBrakes;
	}

	public double getBrakingFactor() {
		return brakingFactor;
	}
}