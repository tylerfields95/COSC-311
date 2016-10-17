import java.util.*;
public class stacksOnStacks {

	public static void fill (int [] array)
	{
		Random roll = new Random();
		int handSize = 0;
		boolean used = false;
		int temp = 0;
		while (handSize < array.length)
		{
			used = false;
			int random = roll.nextInt(100);
			temp = random;
			for (int y = 0; y < array.length -1; y++)
			{
				if (array [y] == random)
					used = true;
			}
			
			if (used == false)
			{
				array [handSize] = random;
				handSize++;
			}
		}
		
	}
	
	public static void push (int array [], int push)
	{
		for (int z = 0; z < array.length -1; z++)
		{
			if (array [z] == -1)
			{
				array [z] = push;
				break;
			}
		}
	}
	
	public static int pop (int array [])
	{
		int popped = 0;
		for (int tail = array.length - 1; tail >= 0; tail --)
		{
			if (array [tail] != -1)
			{
				popped = array [tail];
				array [tail] = -1;
				break;
			}
		}
		return popped;
	}
	
	public static int peak (int array [])
	{
		int top = 0;
		for (int tail = array.length - 1; tail >= 0; tail --)
		{
			if (array [tail] != -1)
			{
				top = array [tail];
				break;
			}
		}
		return top;
	}
	
	public static boolean isEmpty (int array [])
	{
		boolean empty = false;
		if (peak(array) == -1)
			empty = true;
		
		return empty;
	}
	
	public static void max (int array [])
	{
		int arrayMax = 0;
		boolean temp = false;
		for (int x = array.length; x >= 0; x--)
		{
			if (peak(array) > arrayMax)
				arrayMax = peak(array);
			
			pop(array);
		}
		System.out.println(arrayMax);
	}
}
