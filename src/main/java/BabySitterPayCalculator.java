
public class BabySitterPayCalculator {

	private int bedTime = 20;

	public int getBedTime() {
		return bedTime;
	}

	public boolean validStartTime(int currentTime) {
		if ((currentTime >= 17 && currentTime <= 24)) {
			return true;
		}
		return false;

	}

	public boolean validEndTime(int currentTime) {
		if ((currentTime >= 0 && currentTime <= 4)) {
			return true;
		}
		return false;

	}

	public int getPaid(int startTime, int endTime) {
		int totalPay = 0;
		int hourlyPay = 0;
		for (int currentTime = startTime; currentTime < endTime
				|| (endTime > 0 && endTime <= 4 && (currentTime - 24) < endTime); currentTime++) {
			if (currentTime < bedTime) {
				hourlyPay = 12;

			}
			
		}
		totalPay +=hourlyPay;
		return totalPay;
	}
}
