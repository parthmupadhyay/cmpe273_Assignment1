package cmpe273.assignment1.generics;


public class GenericSortDemo 
{
	public static void main(String[] args)
	{
		GenericSort<Double> sortDemo1 = new GenericSort<Double>(new Double[]{2.2,32.6,6.98,5.43,77.89});
		GenericSort<Integer> sortDemo2 = new GenericSort<Integer>(new Integer[]{100,34,230,6,57,12});
		System.out.print("Sorted Double array:");
		for(Number num: sortDemo1.sort())
		{
			System.out.print(num +" ");
			
		}
		System.out.println();
		System.out.print("Sorted Integer array:");
		for(Number num: sortDemo2.sort())
		{
			System.out.print(num +" ");
		}
	}
}
