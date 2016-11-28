import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class mQueue {
		
	static int count = 0;
	static int maxAge = 0;
	static int maxAgeData = 0;
	static List <queueNode> queue = new LinkedList <queueNode>();
		
	public static void insert (int n)
	{
		queue.add(new queueNode(n,count));
		count++;
		mQueue.swap();
	}
		
	public static void delete ()
	{
		if (count - queue.get(0).getTimeStamp() > maxAge)
		{
			maxAge = count - queue.get(0).getTimeStamp();
			maxAgeData = queue.get(0).getData();
		}
		count++;
		queue.remove(0);
		mQueue.swap();
	}
	
	public static void swap ()
	{
		boolean smaller = false;
		int temp = 0;
		for (int x = 0; x < queue.size()-1; x++)
		{
			if (queue.get(x).getData() < queue.get(0).getData())
			{
				temp = queue.get(x).getData();
				smaller = true;
			}
		}
		if(smaller == true)
			Collections.swap(queue, 0, temp);
	}
	
	public static void print ()
	{
		System.out.println("The oldest element is data = " + maxAgeData + ", with age = " + maxAge);
	}
}


