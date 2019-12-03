package Homework5;

public class Problem4Class {

	boolean redLight,yellowLight,greenLight,bell,siren;

	public void calcLights (Problem4ServerData battery) {
		boolean greenTable [] =  {false, false, false, false, false, true};
		boolean yellowTable [] = {false, false, false, true,  true,  false};
		boolean redTable [] = 	 {false, false, true,  true,  false, false};
		boolean bellTable [] = 	 {false, true,  false, false, false, false};
		boolean sirenTable []  = {true,  false, false, false, false, false};
		int index;
		double batteryPower;

		batteryPower=battery.getBatteryPower();
		if (batteryPower < 0.1)
			index = 0; 
		else
			if (batteryPower < 50.0)
				index = 1;
			else
				if (batteryPower <= 75.0)
					index = 2;
				else
					if (batteryPower < 125.0)
						index = 3;
					else
						if (batteryPower <= 250.0)
							index = 4;
						else
							index = 5;

		redLight=redTable[index];
		yellowLight=yellowTable[index];
		greenLight=greenTable[index];
		bell=bellTable[index];
		siren=sirenTable[index];
	}	

	public boolean isRedLight() {
		return redLight;
	}

	public void setRedLight(boolean redLight) {
		this.redLight = redLight;
	}

	public boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight(boolean yellowLight) {
		this.yellowLight = yellowLight;
	}

	public boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight(boolean greenLight) {
		this.greenLight = greenLight;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	public boolean isSiren() {
		return siren;
	}

	public void setSiren(boolean siren) {
		this.siren = siren;
	}
}