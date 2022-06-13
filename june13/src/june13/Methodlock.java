package june13;



	
		// TODO Auto-generated method stub

		//https://fluvid.com/videos/detail/37jwQh9DRQieqRp6m#.Yqclg9kc7Bc.link
		import java.util.concurrent.ExecutorService;
		import java.util.concurrent.Executors;
		public class  Methodlock {

			public static void main(String[] args) {
				CounsellingHall anna=new CounsellingHall();
				ExecutorService es=Executors.newFixedThreadPool(3);
				es.execute(()->{
					//synchronized(anna) {
					Thread.currentThread().setName("kamal");
					anna.showPapers();
					anna.selectCollege();
					anna.payFees();
					anna.exit();
					//}
				});
				es.execute(()->{
					Thread.currentThread().setName("rajini");
					//synchronized(anna) {
					anna.showPapers();
					anna.selectCollege();
					anna.payFees();
					anna.exit();
					//}
				});
				es.execute(()->{
					//synchronized(anna) {
					Thread.currentThread().setName("captain");
					anna.showPapers();
					anna.selectCollege();
					anna.payFees();
					anna.exit();
					//}
				});
				es.shutdown();
			}
		}
		class CounsellingHall{
			synchronized public void showPapers() {
				Thread t=Thread.currentThread();
				String name=t.getName();
				System.out.println(name+" showing papers...");
				try {Thread.sleep(3000);}catch(Exception e) {}
				System.out.println(name+" completed showing papers...");
			}
			
			synchronized public void selectCollege() {
				Thread t=Thread.currentThread();
				String name=t.getName();
				System.out.println(name+" selecting college...");
				try {Thread.sleep(4000);}catch(Exception e) {}
				System.out.println(name+" completed selecting college...");
			}
			synchronized public void payFees() {
				Thread t=Thread.currentThread();
				String name=t.getName();
				System.out.println(name+" paying fees...");
				try {Thread.sleep(3000);}catch(Exception e) {}
				System.out.println(name+" payed fees...");
			}
			public void exit() {
				Thread t=Thread.currentThread();
				String name=t.getName();
				System.out.println(name+" exit...");
			}
		
		

	}


