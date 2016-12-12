
public class run {
	 public static void main(String[] args) {
		 	String[] listOfProfessors = { "Ikeji", "bahorski", "chaudhuri", "evett", "haynes", "miniccam", 
		 						"moore", "narayanan", "panja", "poh", "sverdlik", "tehranipour", 
		 						"zeiger", "zhang", "cowan", "francis", "Mansour"};
	        
	        sort.mergeSort(listOfProfessors);

	        for (int x = 0; x < listOfProfessors.length-1; x++) {
	            System.out.println(listOfProfessors[x]);
	        }
	        
	        sort.getCounter();
	 }
}
