package cmpe273.assignment1.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortingArray {

	@Test
	public void testSort() 
	{
		int[] testArray = {21,43,2,54,26,77,7,545,22};
		SortingArray testSort= new SortingArray(testArray);
		int[] resultArray=testSort.sort();
		assertArrayEquals(new int[]{2,7,21,22,26,43,54,77,545}, resultArray);
	}

}
