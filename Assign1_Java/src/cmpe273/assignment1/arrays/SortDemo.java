package cmpe273.assignment1.arrays;

import java.util.Scanner;

public class SortDemo 
{

	public static void main(String[] args)
	{
		System.out.println("Enter numbers to sort separated by space ");
		Scanner scanner= new Scanner(System.in);
		String data=scanner.nextLine();
		int[] array= new int[data.split(" ").length];
		int i=0;
		for(String str:data.split(" "))
		{
			array[i]=Integer.parseInt(str);
			i++;
		}
		SortingArray sort= new SortingArray(array);
		int[] resultArray=sort.sort();
		System.out.println("Sorted Array:");
		for(int arrayElement :resultArray)
		{
			System.out.print(arrayElement+ "  ");
		}
		scanner.close();
	}
}
