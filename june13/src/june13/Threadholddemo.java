package june13;

public class Threadholddemo {
      public static void main(String[] args) {
		 Thread t=Thread.currentThread();
		 System.out.println(t);
		 t.setPriority(9);//set priority is upto 0 to 9 only . 
		 t.setName("ggg");//thread name
		 
		 System.out.println(t);
	}
}
