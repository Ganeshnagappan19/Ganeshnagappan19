package june17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Compardemo {

	
	public static void main(String[] args) {
		  List<Vivo> li =new ArrayList<Vivo>();//list  is object creation 
		 
		  li.add(new Vivo("A"));
		  li.add(new Vivo("B"));
		  li.add(new Vivo("C"));
		  li.add(new Vivo("D"));
		  li.add(new Vivo("E"));
		 System.out.println("List"+li);    
			Collections.sort(li,new Zero());
			System.out.println("after sorting"+li);
	}
}
class Vivo implements Comparable<Vivo>{
String name;
	public Vivo (String name) 
	{		this.name=name;
	}

	public String  tostring() {
		return this.name;
	}
	
	@Override
	public int compareTo(Vivo o) {
		return this.name.compareTo(o.name);
	}


	}
	

class Zero implements Comparator<Vivo>{
	@Override
	public int compare(Vivo s1, Vivo s2) {
		// TODO Auto-generated method stub
		return s2.compareTo(s1);
	}
}

	


