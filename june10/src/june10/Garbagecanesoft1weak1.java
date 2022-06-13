package june10;


		// TODO Auto-generated method stub
		import java.lang.ref.SoftReference;
		import java.lang.ref.WeakReference;
		public class Garbagecanesoft1weak1 {
			public static void main(String[] args) {

				Runtime r=Runtime.getRuntime();
//What is a Throwable class in Java? The java.lang.Throwable class is the superclass of all errors and exceptions in the Java language. Only objects that are instances of this class (or one of its subclasses) are thrown by the Java Virtual Machine or can be thrown by the Java throw statement.
				System.out.println("Available Memory..:"+r.maxMemory());
				System.out.println("Available Processors..:"+r.availableProcessors());
				System.out.println("Free Memory..:"+r.freeMemory());
				r.gc();
				Food food=new Food();
				System.out.println("Free Memory..:"+r.freeMemory());
				//SoftReference soft=new SoftReference(food);
				WeakReference weak=new WeakReference(food);
				food=null;
				
				
				r.gc();
				System.out.println("Free Memory..:"+r.freeMemory());
				//food=(Food)soft.get();
				food=(Food)weak.get();
				System.out.println(food);
			}
		}
		class Food{
			@Override
			protected void finalize() throws Throwable {
				System.out.println("finalize for the food object called....");
			}
		}

		









	




//weak reference used to delete value unwanted object and its call the finally and its does not stored the object address
		//soft reference is used to store the object reference .and if u delete the object it be delete not
	//permanently only delete object .if call the object.its take a object refernce and then its be given to u
		
