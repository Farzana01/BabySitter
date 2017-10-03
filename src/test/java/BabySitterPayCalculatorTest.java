import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabySitterPayCalculatorTest {
	
	
	BabySitterPayCalculator babySitterPayCalculator;
	
	@Before
	public void setUp(){
		babySitterPayCalculator = new BabySitterPayCalculator();
	}
	
	@Test
	 public void shouldBeStartTimeBefore5pmIsNotValid() {
				
		int startTime = 16;
		assertFalse(babySitterPayCalculator.validStartTime(startTime));
		
	}
	

}
