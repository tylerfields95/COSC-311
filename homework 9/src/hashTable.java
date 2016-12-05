import java.util.*;

public class hashTable {
	
	public static String [] table;
	static double fill = 0.00;
	static double howFull = 0.00;
	
	public hashTable ()
	{
		table = new String [10];
		for (int x = 0; x < table.length; x++)
		{
			table[x] = "0";
		}
	}
	
	public void hash (String array [])
	{
		int position = 0;
		for (int x = 0; x < array.length; x++)
		{
			boolean inserted = false;
			if (howFull() > 75)
			{
				reHash();
				x=0;
			}
			
			position = Math.abs(array [x].hashCode() % table.length);
			
			if (table [position] == "0")
			{
				table [position] = array [x];
				fill++;
			}
			else
			{
				while (inserted == false)
				{
					position++;
					if (table [position] == "0")
					{
						table [position] = array [x];
						fill++;
						inserted = true;
					}
					if (position == table.length-1)
						position = 0;
				}
			}
		}
		printTable();
	}
	
	public static void reHash ()
	{
		printTable();
		table = Arrays.copyOf(table, table.length * 2);
		for (int x = 0; x < table.length; x++)
		{
			table[x] = "0";
		}
		fill = 0;
	}
	
	public static double howFull ()
	{
		howFull = ((fill/table.length) * 100);
		return howFull;
	}
	public static void printTable()
	{
		System.out.println("");
		for (int x = 0; x < table.length; x++)
		{
			System.out.print(table [x] + " ");
		}
		System.out.println ("\nthe length of the table is currently " + table.length);
	}

}
