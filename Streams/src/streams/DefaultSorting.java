package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultSorting {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(42);
		ar.add(92);
		ar.add(33);
		ar.add(77);
		ar.add(12);
	

		System.out.println("All Elements are :" + ar);

		List<Integer> l = ar.stream().sorted().collect(Collectors.toList());

		System.out.println("Acending Order Sort" + l);

	}
}