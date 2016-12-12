
public class sort {
	 static int counter = 0;
	 public static void mergeSort(String[] names) {
		 	counter++;
	        if (names.length >= 2) {
	            String[] left = new String[names.length / 2];
	            String[] right = new String[names.length - names.length / 2];

	            for (int x = 0; x < left.length; x++) {
	                left[x] = names[x];
	            }

	            for (int y = 0; y < right.length; y++) {
	                right[y] = names[y + names.length / 2];
	            }

	            mergeSort(left);
	            mergeSort(right);
	            merge(names, left, right);
	        }
	    }
	 public static void merge(String[] names, String[] left, String[] right) {
	        int a = 0;
	        int b = 0;
	        for (int i = 0; i < names.length; i++) {
	            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
	                names[i] = left[a];
	                a++;
	            } else {
	                names[i] = right[b];
	                b++;
	            }
	        }
	    }
	 public static void getCounter ()
	 {
		 System.out.println("merge sort was invoked: " + counter + " times.");
	 }
}
