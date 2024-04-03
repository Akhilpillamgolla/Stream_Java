package streams;

import java.util.ArrayList;

public class EvenNbrNoStream {

	public static void main(String[] args) {
	ArrayList<Integer> ar = new  ArrayList<>(); 
    ar.add(12);
    ar.add(33);
    ar.add(42);
    ar.add(92);
    ar.add(77);
    
    for (Integer inta : ar) {
		
    	if(inta%2==0) {
    		System.out.println("The Given is even Number :"+inta);
    	}
    	else {
    		System.out.println("The Given Number are Not Even"+inta);
    	}
	}
    
	

	}

}
