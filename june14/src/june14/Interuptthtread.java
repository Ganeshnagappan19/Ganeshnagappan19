package june14;
	import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
	public class Interuptthtread {
		public static void main(String[] args) {
      ExecutorService es =Executors.newFixedThreadPool(2);
			Gunn bofors=new Gunn();
			es.execute(()->{
				for(int i=0;i<20;i++) {
					bofors.load();
				}
			});
			es.execute(()->{
				for(int i=0;i<20;i++) {
					bofors.shoot();
				}
			});
			es.shutdown();
		}
	}
	class Gunn{
		boolean flag;
		synchronized public void load() {
			if(flag) {
				try {wait();}catch(Exception e) {}
			}
			System.out.println("loader loads the gun...........");
			flag=true;
			notify();
		}
		synchronized public void shoot() {
			if(!flag) {
				try {wait();}catch(Exception e) {}
			}
			System.out.println("Shooter shoots...the gun...........");
			flag=false;
			notify();
		}
	}

