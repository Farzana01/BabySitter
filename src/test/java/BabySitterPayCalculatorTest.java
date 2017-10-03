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
	
	@Test
	 public void shouldBeStartTimeAfter5pmIsNotValid() {
				
		int startTime = 18;
		assertTrue(babySitterPayCalculator.validStartTime(startTime));
	}
	
	@Test
	 public void shouldBeEndTimeAfter4AmIsNotValid() {
				
		int endTime = 5;
		assertFalse(babySitterPayCalculator.validStartTime(endTime));
	}
	
	@Test
	 public void shouldBeBedTimeAt8Pm() {
						
		assertEquals(20,babySitterPayCalculator.getBedTime());
	}
	
	
	
	
	
}
