package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogic {

	@Test
	public void testFindMax() {
		
		assertEquals(5, Calculation.findMax(new int[] {1,2,3,4,5}) );
		
		assertEquals(-1, Calculation.findMax(new int[] {-1,-3, -12, -4,-5}));
		
	}

}
