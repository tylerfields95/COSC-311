public class sort 
{
	public static void main (String [] args)
	{
		generator gen = new generator();
		int list [] = new int[1000];
		
		gen.generate();
		gen.collect(list);
		
		for (int i = 0; i < list.length - 1; i++)
	        {
	            int temp = i;
	            for (int j = i + 1; j < list.length; j++)
	            {
	                if (list[j] < list[temp])
	                    temp = j;
	            }
	            int smaller= list[temp]; 
	            list[temp] = list[i];
	            list[i] = smaller;
	        }
		for (int x=0; x < 1000; x++)
		{
			System.out.print(list[x] + " ");
		}
		
	}
}
