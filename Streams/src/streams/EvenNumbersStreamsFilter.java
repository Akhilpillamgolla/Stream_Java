package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersStreamsFilter{

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
	    ar.add(12);
	    ar.add(33);
	    ar.add(77);
	    ar.add(42);
	    ar.add(92);
	    
	    Collections.sort(ar);
	    
	    System.out.println(ar);
	    
	    System.out.println("All Elements are :"+ar);
	    
    List<Integer> l = ar.stream().filter(i->i%2==0).collect(Collectors.toList());     
     System.out.println("Even  Elements are :"+l);
     
	}

}
