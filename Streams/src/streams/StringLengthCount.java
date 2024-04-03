package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthCount {

	public static void main(String[] args) {
		

		ArrayList<String> ar = new ArrayList<>();
	    ar.add("Akhil");
	    ar.add("Pillamgolla");
	    ar.add("Babu");
	    ar.add("JAVA");
	    ar.add("Developer");
	    
	    
	System.out.println(" All Elements are :"+ar);
	    
    long count  = ar.stream().filter(I->I.length()>=9).count();   
    
    
    System.out.println("\n Length Elimination  with Streams :"+count);
    
    List<String> l = ar.stream().filter(I->I.length()>=9).collect(Collectors.toList());   
    
    
    System.out.println("\n Length Elimination  with Streams :"+l);

    
    
}		
}
