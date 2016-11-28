public class run {
	public static void main (String [] args)
	{
		int [] queueInts = {1, 7, 3, 4, 5, 6, 1, 2, 3};
		for (int x = 0; x <= queueInts.length-1; x++)
		{
			mQueue.insert(queueInts[x]);
		}

		for (int x = queueInts.length; x > 0 ; x--)
		{
			mQueue.delete();
		}

		mQueue.print();
	}

}
