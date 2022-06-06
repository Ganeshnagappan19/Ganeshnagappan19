package june2;

public class Finalyblock {

	public static void main(String[] args) {
		// 
		System.out.println("before Exception");
	try {	String s =args[0];
  Integer.parseInt (s);
  
	  
  
	}catch(Exception ae)  {
  System.out.println(ae);
	}
  
finally {System.out.println("sss");
} System.out.println("pp");
	}
}
//	public class ExcepDemo4 {
//		public static void main(String[] args) {
//			System.out.println("before exception...");
//			try{
//				String s=args[0];
//				Integer.parseInt(s);
//			}catch(ArrayIndexOutOfBoundsException ae) {
//				System.out.println(ae);
//			}finally {
//				System.out.println("finally block code called...");
//			}
//			System.out.println("after exception");
//		}
//	}