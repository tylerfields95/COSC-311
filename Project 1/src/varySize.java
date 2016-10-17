import java.util.*;

public class varySize 
{
	public void algorithm3 (int n, int k)
	{
		Random rng = new Random();
		int list [] = new int[n];
		long startTime = 0;
		long endTime = 0;
		long elapsedTime = 0;
		
			for (int count = 0; count < list.length; count++)
			{
				list [count] = count;
			}
			startTime = System.nanoTime();
			int max = n-1;
			int temp = 0;
			int random = 0;
			for (int x = 0; x<k; x++)
			{
				System.out.print(list[random = rng.nextInt(max)] + " ");
				temp = random;
				list [random] = list[max]; 
				list [max] = list [temp];
				max--;
			}
			endTime = System.nanoTime();
			elapsedTime = endTime - startTime;
			System.out.println("\nelapsed time = " + elapsedTime);
		
	}
}
