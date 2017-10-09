import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};		
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		int[] expected = {1,3,4,12};		
		Arrays.sort(numbers);		
	}
	
	@Test(timeout=100)
	public void testSort_Performance() {
		int[] array = {10, 5, 1};
		for(int i=1; i<=1000000; i++){
			array[0]=i;
			Arrays.sort(array);
		}			
	}	

}
