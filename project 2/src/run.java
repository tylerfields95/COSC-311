/*
Tyler Fields
http://tinyurl.com/zcje7p8
COSC 311
Project 2
FALL 2016.
http://stackoverflow.com/questions/2839431/swap-elements-in-linkedlist
*/
public class run {
	public static void main (String [] args)
	{
		
		for (int count = 1; count < 100; count++){
			int mod = 10 * count;
			int queueInts [] = new int [mod];
			
			for (int x = 0; x < mod-1; x++)
			{
				queueInts [x] = x + 1;
			}
			
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

}
