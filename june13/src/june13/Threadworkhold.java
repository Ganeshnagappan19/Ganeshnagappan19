package june13;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	public class Threadworkhold  {
		 public Threadworkhold() { 

				ExecutorService es=Executors.newFixedThreadPool(1);
				es.execute(()->{System.out.println("child thread called...");});
				es.shutdown();
		 }
		 public static void main(String[] args) {
			 for(int i=0;i<5;i++) {
			 new Threadworkhold();
			 public static void met() {
				 try {   
					 Thread.sleep(2000);
				 }catch(exception e)
				 
		}
					
			}
		}
	
}
