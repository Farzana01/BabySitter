import org.junit.Test;

public class BabySitterPayCalculatorTest {
	
	@Test
	
	 public void shouldBeStartTimeBefore5pmIsNotValid() {
		
		BabySitterPayCalculator = new BabySitterPayCalculator();
		int startTime = 16;
		assertFalse(BabySitterPayCalculator.validStartTime(startTime);
		
	}
	

}
