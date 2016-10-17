import java.util.*;

public class bruteForce 
{
	public void algorithm1 (int n, int k)
	{
		Random roll = new Random();
		
		int [] deck = new int [n];
		int [] hand = new int [k];
		boolean used = false;
		int handSize = 0;
		long startTime = 0;
		long endTime = 0;
		long elapsedTime = 0;

		for (int count = 0; count < deck.length; count++)
		{
			deck [count] = count + 1;
		}
		startTime = System.nanoTime();
		while (handSize < hand.length)
		{
			used = false;
			int random = roll.nextInt(deck.length);
			for (int y = 0; y < hand.length; y++)
			{
				if (hand [y] == deck [random])
					used = true;
			}
			
			if (used == false)
			{
				hand [handSize] = deck [random];
				handSize++;
			}
		}
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		for (int z = 0; z < hand.length; z++)
		{
			System.out.print(hand [z] + " ");
		}
		System.out.println("\nelapsed time = " + elapsedTime);
	}
}
