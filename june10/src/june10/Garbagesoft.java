package june10;


		import java.lang.ref.SoftReference;
		import java.lang.ref.WeakReference;
		public class Garbagesoft {
			public static void main(String[] args) {
				Runtime r=Runtime.getRuntime();
				System.out.println("Available Memory..:"+r.maxMemory());
				System.out.println("Available Processors..:"+r.availableProcessors());
				System.out.println("Free Memory..:"+r.freeMemory());
				r.gc();
				Wood food=new Wood();
				System.out.println("Free Memory..:"+r.freeMemory());
				SoftReference soft=new SoftReference(food);
				//WeakReference weak=new WeakReference(food);
				food=null;
				
				
				r.gc();
				System.out.println("Free Memory..:"+r.freeMemory());
			food=(Wood)soft.get();
				//food=(wood)weak.get();//object+weak ka get pannrom
				System.out.println(food);
			}
		}
		class Wood{
			@Override
			protected void finalize() throws Throwable {
				System.out.println("finalize for the food object called....");
			}
		
		














		// TODO Auto-generated method stub

	}


