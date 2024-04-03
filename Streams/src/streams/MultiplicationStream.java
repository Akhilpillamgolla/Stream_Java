package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplicationStream {

	public static void main(String[] args) {

			ArrayList<Integer> ar = new ArrayList<>();
		    ar.add(12);
		    ar.add(33);
		    ar.add(42);
		    ar.add(92);
		    ar.add(77);
		    
		    System.out.println("All Elements are :"+ar);
		    
	    List<Integer> l = ar.stream().map(I->I*2).collect(Collectors.toList());   
	   
	    System.out.println("Multiplication with Streams :"+l);
	}

}
