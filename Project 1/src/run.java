public class run {

	public static void main (String [] args)
	{
		int n = 10;
		int k = 5;
		bruteForce alg1 = new bruteForce();
		markers alg2 = new markers();
		varySize alg3 = new varySize();
		
		//sanity check
		System.out.println("brute force");
		for (int x = 0; x < 5; x++)
		{
			alg1.algorithm1(n, k);
		}
		System.out.println("\nmarker");
		for (int y = 0; y < 5; y++)
		{
			alg2.algorithm2(n, k);
		}
		System.out.println("\nvarySize");
		for (int z= 0; z < 5; z++)
		{
			alg3.algorithm3(n, k);
		}
		
		//gather data
		/**
		 * k=3;
		 * n=5;
		System.out.println("10/11/16");
		System.out.print ("**********************\n        vary n\n**********************");
		for (int x =0; x < 10; x++)
		{
			System.out.println("\nbrute force algorithm");
			System.out.println("n choose k values: (" + n + "," + k + ")");
			alg1.algorithm1(n, k);
			
			System.out.println("\nmarkers");
			System.out.println("n choose k values: (" + n + "," + k + ")");
			alg2.algorithm2(n, k);
			
			System.out.println("\nvarySize");
			System.out.println("n choose k values: (" + n + "," + k + ")");
			alg3.algorithm3(n, k);
			
			n = n*4;
		}
		
		System.out.println("10/11/16");
		System.out.print ("**********************\n        vary k\n**********************");
		n = 1000000;
		for (int y =0; y < 10; y++)
		{
			System.out.println("\nbrute force algorithm");
			System.out.println("n choose k values: (" + n + "," + k + ")");
			alg1.algorithm1(n, k);
			
			System.out.println("\nmarkers");
			System.out.println("n choose k values: (" + n + "," + k + ")");
			alg2.algorithm2(n, k);
			
			System.out.println("\nvarySize");
			System.out.println("n choose k values: (" + n + "," + k + ")");
			alg3.algorithm3(n, k);
			
			k = k * 4;
		}
		*/
	}

}
