package streams;

import java.util.ArrayList;

public class Foeeachmethod {
public static void main(String[] args) {
	ArrayList<String> ar = new ArrayList<>();
     ar.add("Akhil");
     ar.add("Pillamgolla");
     ar.add("BAbu");
     ar.add("Java");
     ar.add("Developer");
     
     ar.stream().forEach(s -> System.out.println("lamda Expression output is "+s));    //lamda Expression
     
     System.out.println("Method Reference Output is ");
     ar.stream().forEach(System.out :: println);         //method Reference
}

}
