package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {
	
	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(42);
		ar.add(92);
		ar.add(33);
		ar.add(77);
		ar.add(12);
	

		System.out.println("All Elements are :" + ar);

		List<Integer> l = ar.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());

		System.out.println("Decending Order Sort" + l);
		
		List<Integer> l1 = ar.stream().sorted((i1,i2)->+i1.compareTo(i2)).collect(Collectors.toList());

		System.out.println("Accending Order Sort" +l1);

	}

}
