package june14;


	import java.util.concurrent.Callable;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	import java.util.concurrent.Future;
	//https://fluvid.com/videos/detail/ODe_5Cve1wcx8vPOZ#.YqhdDX-3e4Y.link
	public class Returnablethread {
		public static void main(String[] args)throws Exception {
			ExecutorService es=Executors.newFixedThreadPool(1);
			
		//	Future fut= es.submit(new MyCallable());
			
			Future fut=es.submit(()->{return "hello..............";});
			
			System.out.println(fut.get());
		}
	}
	class MyCallable implements Callable{
		@Override
		public Object call() throws Exception {
			// TODO Auto-generated method stub
			return "hello from callable...";
		}
	}

