package streams;

import java.util.ArrayList;


public class ToString {

	public static void main(String[] args) {
	

		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(42);
		ar.add(92);
		ar.add(33);
		ar.add(77);
		ar.add(12);
		
		System.out.println(ar);
		
		Integer[] array =ar.stream().toArray(Integer[] :: new);  //  Elements -> Integer Array 
		for (Integer x : array) {
			System.out.println(x);
		}
}

}
