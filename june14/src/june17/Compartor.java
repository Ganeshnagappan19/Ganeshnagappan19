package june17;


import java.util.*;
      public class Compartor {

	 // Main driver method
	 public static void main(String[] args)
	 {

	     // Create a TreeSet and pass descendingComparator()
	     // as made in another class as parameter
	     // to it to get Descending Order
	     TreeSet<Integer> set
	         = new TreeSet<>(new descendingComparator());

	     // Adding elements to Treeset
	     // Custom inputs
	     set.add(10);
	     set.add(20);
	     set.add(30);

	     // Print Descending Ordered set in descending order
	     // as above descendComparator() usage
	     System.out.println("Descending Ordered set : "
	                        + set);
	 }
	}
//User0defined class (Helper class)
//New class that implements comparator interface
class descendingComparator implements Comparator<Integer> {

 public int compare(Integer i1, Integer i2)
 {
     // compare using compareTo() method
     return i2.compareTo(i1);
 }
}


 