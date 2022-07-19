package exercisetest;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashSet;
	import java.util.List;
	import java.util.TreeSet;
	public class  Treetest {
	public static void main(String[] args) {
		List<Name> list =new ArrayList<Name>();
		
		list.add(new Name (""));
		list.add(new Name("ggg"));
		list.add(new Name("hhh"));
		list.add(new Name("iiii"));
		
		//System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		HashSet<Name>hs=new HashSet<Name>(list);
		TreeSet<Name>ts=new TreeSet<Name>(new Actorname());
		
		ts.addAll(hs);
		System.out.println(ts);
	}
	}
	class Actorname implements Comparator<Name>{
		public int compare(Name o1, Name o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
	}
	class Name implements Comparable<Name>{
		String name;
		public Name(String name) {
			this.name=name;
			// TODO Auto-generated constructor stub
		}
		public int compareTo(Name o) {
			
			return this.name.compareTo(o.name);
		}
	
		public String toString() {
			// TODO Auto-generated method stub
			return this.name;
		}
	}















