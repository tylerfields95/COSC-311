import java.util.*;
public class markers 
{
	public void algorithm2 (int n, int k)
	{
		
		boolean [] marker = new boolean [n];
		int [] array = new int [n];
		Random roll = new Random();
		long startTime = 0;
		long endTime = 0;
		long elapsedTime = 0;
		
		for (int x = 0; x < n; x++)
		{
			array [x] = x;
		}
		
		startTime = System.nanoTime();
		
		for (int clear = 0; clear < marker.length -1; clear++)
			{
				marker [clear] = false;
			}
		
		int fullHand = 0;
		int temp = 0;
		
		while (fullHand < k )
		{
			temp = roll.nextInt(n-1);
			if (marker[temp] != true)
			{
				marker[temp] = true;
				System.out.print (temp + " ");
				fullHand++;
			}
		}
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("\nelapsed time = " + elapsedTime);
	}
}
