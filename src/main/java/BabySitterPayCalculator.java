
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
			if ((currentTime >=0 && currentTime <= 4)) {
				return true;
			} return false;
			
	}
      
	
}
