


	
	
import java.util.StringTokenizer;
	public class Tokenzierdemo {
	  public static void main(String[] args) {//throws IOException {
	    String myString = "im ganesh ";
	    StringTokenizer st = new StringTokenizer(myString);
	//    System.out.println("Input string is: " + myString);
	    while (st.hasMoreTokens()) {
	      System.out.println("The Next token is: " + st.nextToken());
	    }
	  }
	}

