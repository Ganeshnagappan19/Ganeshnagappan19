package june13;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	/*
	 * What is a thread ?
	 * A process within a process is called thread.
	 */
	public class Mutlithread {
		public static void main(String[] args) {
			System.out.println("SOUP...");
			ExecutorService es=Executors.newFixedThreadPool(1);
			es.execute(()->{met();});
			//es.execute(new MyRunnable());
			es.shutdown();
//			Thread t=new Thread(new MyRunnable());
//			t.start();
			
			System.out.println("STARTER.....");
		}
		public static void met() {
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println("MAIN ITEM....");
		}
	}
	class MyRunnable implements Runnable{
		@Override
		public void run() {
			Mutlithread.met();
		}
	}

