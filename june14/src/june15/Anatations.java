package june15;


	import java.lang.reflect.Method;

import june15.Runtimevalue.Veg;
	public class Anatations {
		public static void main(String[] args)throws Exception {
			Food food=new Food();
			
	Veg veg=food.getClass().getAnnotation(Veg.class);
			if(veg==null) {
				System.out.println("non vegetarian food....");
			}
			else {
				System.out.println("this is a vegetarian food...");
			}
			
			Method m=food.getClass().getMethod("rice");
			Veg gg=m.getAnnotation( Veg.class);
			if(veg==null) {
				System.out.println("rice is non vegetrian food");
			}
			else {
				System.out.println("rice is vegetarian food...");
			}
		}
	}

