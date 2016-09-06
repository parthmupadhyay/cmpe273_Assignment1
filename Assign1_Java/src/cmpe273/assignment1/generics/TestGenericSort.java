package cmpe273.assignment1.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGenericSort {

	@Test
	public void testIntegerSort() 
	{
		GenericSort<Integer> integerSort = new GenericSort<Integer>(new Integer[]{43,12,4,24,65,25,673,476,3,100000});
		assertArrayEquals(new Integer[]{3,4,12,24,25,43,65,476,673,100000}, integerSort.sort());
		
	}
	
	@Test
	public void testDoubleSort()
	{
		GenericSort<Double> doubleSort = new GenericSort<Double>(new Double[]{2.001,2.00010,2.0,2.756,1.99999});
		assertArrayEquals(new Double[]{1.99999,2.0,2.00010,2.001,2.756}, doubleSort.sort());
		
	}

}
