/**
 *Tyler Fields
 *https://github.com/tylerfields95/COSC-311
 *COSC 311
 *HW 10/19/16
 *Fall 2016
 */
import java.util.*;
public class run {
	public static void main (String [] args)
	{
		Stack <Character> paren = new Stack<Character>();
		String parenthesis = "(()()())";
		int tempMax = 0;
		int max = 0;
		char temp;
		
		for (int i=0; i < parenthesis.length(); i++)
		{
			temp = parenthesis.charAt(i);
			System.out.print (temp);
			if (temp == '(' )
			{
				paren.push(temp);
				tempMax++;
			}
			else
			{
				while (paren.empty() == false)
				{
					paren.pop();
				}
				if (tempMax > max)
				{
					max = tempMax;
					tempMax = 0;
				}
			}
		}
		
		if (paren.empty() != true)
			max = -1;
		
		System.out.println ("\n" + max);
			
	}
}
