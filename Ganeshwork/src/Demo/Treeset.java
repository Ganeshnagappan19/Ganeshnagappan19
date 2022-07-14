package Demo;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {

	    public static void main(String[] args)
	    {
	       
	        TreeSet<Integer> treeset = new TreeSet<Integer>();
	  
	      
	        treeset.add(20);
	        treeset.add(24);
	        System.out.println("tree"
	                           + treeset);
	  
	        Comparator comp = treeset.comparator();
	        System.out.println(" value is: "+ comp);
	    }
}
