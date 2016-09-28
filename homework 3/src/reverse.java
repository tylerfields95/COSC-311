/**
 *Tyler Fields
 *https://github.com/tylerfields95/COSC-311
 *COSC 311
 *HW 09/21
 *Fall 2016
 */
public class reverse {
	public static void main (String [] args)
	{
		generator gen = new generator();
		int list [] = new int[10];
		int temp = 0;
		int end = list.length-1;
		
		gen.generate();
		gen.collect(list);

		for (int front = 0; front < end; front++, end--)
		{
			temp = list[end];
			list[end] = list[front];
			list[front] = temp;
		}
		
		for (int count = 0; count < list.length; count++)
		{
			System.out.print(list[count] + " ");
		}
	}
}
