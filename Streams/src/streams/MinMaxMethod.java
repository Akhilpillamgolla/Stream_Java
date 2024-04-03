package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxMethod {
	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(42);
		ar.add(92);
		ar.add(33);
		ar.add(77);
		ar.add(12);
	

		System.out.println("All Elements are :" + ar);

		Integer min = ar.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("Acending Order Sort" + min);                //we must sort  for obtain minimum max Value

		Integer max = ar.stream().min((i1,i2)-> i2.compareTo(i1)).get();
        System.out.println("Decending Order Sort" +max);
	
	}
}
