package june17;

	import java.util.Comparator;
	import java.util.Set;
	import java.util.TreeSet;
	public class  Comandcompartor {
		public static void main(String[] args) {
			Set ts=new TreeSet(new MyComparator());
			//Set<String> res = (TreeSet<String>)ts.descendingSet();
			ts.add(new A("one"));
			ts.add(new A("two"));
			ts.add(new A("three"));
			System.out.println(ts);
		}
	}
	class MyComparator implements Comparator<A>{
		@Override
		public int compare(A o1, A o2) {
			
			return o1.compareTo(o2);
		}
	}
	class A implements Comparable<A>{
		public A(String name) {
			this.name=name;
		}
		String name;
		@Override
		public int compareTo(A s) {
			System.out.println(s);
					return name.compareTo(s.name);
					
		}
		@Override
		public String toString() {
			
			return this.name;
		}
	}








