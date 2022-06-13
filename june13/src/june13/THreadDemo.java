package june13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class THreadDemo {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			System.out.println("puri...");
			ExecutorService es=Executors.newFixedThreadPool(1);
			es.execute(()->{met();});
			//es.execute(new MyRunnable());
			es.shutdown();
//			Thread t=new Thread(new MyRunnable());
//			t.start();
			
			System.out.println("egg rice.....");
		}
		public static void met() {
		//	try {Thread.sleep(6000);}catch(Exception e) {}
			System.out.println("itli....");
		}
	}
	class kk implements Runnable{
		@Override
		public void run() {
			THreadDemo .met();
		}
	}


