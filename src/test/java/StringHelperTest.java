import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.junit.helper.StringHelper;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {				
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {				
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));		
	}	
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {				
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));		
	}	

}
