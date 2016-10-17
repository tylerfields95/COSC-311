/**
 *Tyler Fields
 *https://github.com/tylerfields95/COSC-311
 *COSC 311
 *HW 10/17/16
 *Fall 2016
 */
public class run {
	public static void main (String [] args)
	{
		int [] stack = new int [10];
		
		stacksOnStacks.fill(stack);
		
		for (int x = 0; x < 10; x ++)
		{
			System.out.print(stack [x] + " ");
		}
		
		System.out.println("");
		stacksOnStacks.max(stack);
	}
}
