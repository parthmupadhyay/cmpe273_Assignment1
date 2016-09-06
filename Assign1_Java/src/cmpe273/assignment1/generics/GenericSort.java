package cmpe273.assignment1.generics;


public class GenericSort<T extends Number & Comparable<T>>
{
	private T[] array;
	
	public GenericSort(T[] array) 
	{
		this.array=array;
	}

	public T[] sort()
	{
		if (array == null || array.length == 0) {
            return null;
        }
        int length = array.length;
        quickSort(0, length - 1);
        return array;
	}
	
	private void quickSort(int lower, int higher) 
	{    
        int i = lower;
        int j = higher;
        T pivotElement = array[lower+(higher-lower)/2];
        while (i <= j) 
        {
            while (array[i].compareTo(pivotElement)<0) 
            {
                i++;
            }
            while (array[j].compareTo(pivotElement)>0) 
            {
                j--;
            }
            if (i <= j) 
            {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (lower < j)
            quickSort(lower, j);
        if (i < higher)
            quickSort(i, higher);
    }
 
    private void swap(int i, int j) 
    {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
