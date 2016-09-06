package cmpe273.assignment1.arrays;

public class SortingArray 
{
	private int[] array;
	
	public SortingArray(int[] array) 
	{
		this.array = array;
		
	}
	
	public int[] sort()
	{
		int temp;
		boolean flag=true;
		while(flag)
		{
			flag=false;
			for(int i=0;i<array.length-1;i++)
			{
				if ( array[ i ] > array[i+1] )  
				{
                    temp = array[ i ];       
                    array[ i ] = array[ i+1 ];
                    array[ i+1 ] = temp;
                    flag=true;
				}
			}
		}
		return array;
	}
	
}
