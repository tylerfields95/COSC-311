import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class generate {
	public static String collect ()
	{
		String paren = null;
		Scanner in = null;
		try 
		{
			in = new Scanner(new FileInputStream ("parenthesis.txt"));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		paren = in.next();
		
		in.close();
		return paren;
	}
}
