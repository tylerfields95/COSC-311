import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
public class generator 
{
	public int max = 1000;
	Random ran = new Random();
	Scanner in = null;
	
	
	public void generate ()
	{
		PrintWriter outputStream = null;
		
		try 
		{
			outputStream = new PrintWriter (new FileOutputStream ("sortingList.txt"));
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("could not find \"sortingList.txt\"");
		}
		
		for (int x = 999; x >= 0; x--)
		{
			outputStream.print(x + " ");
		}
		outputStream.close();
	}
	
	
	public void collect (int array [])
	{

		try 
		{
			in = new Scanner(new FileInputStream ("sortingList.txt"));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		for (int x=0; x < 1000; x++)
		{
			array [x] = in.nextInt();
		}
		in.close();
	}
	
}
