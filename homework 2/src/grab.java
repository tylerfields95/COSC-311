import java.util.*;

public class grab {
	public static void main (String [] args)
	{
		generator gen = new generator();
		Random rng = new Random();
		int list [] = new int[10];
		
		gen.generate();
		gen.collect(list);
		
		int max = 9;
		int temp = 0;
		int random = 0;
		for (int y = 3; y > 0; y--){
		for (int x = 0; x<3; x++)
		{
			System.out.print(list[random = rng.nextInt(max)] + " ");
			temp = random;
			list [random] = list[max]; 
			list [max] = list [temp];
			max--;
		}
		System.out.println("");
		}
	}

}
