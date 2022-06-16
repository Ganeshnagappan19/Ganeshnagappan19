package june15;
import java.lang.annotation.Retention;
	import static java.lang.annotation.RetentionPolicy.RUNTIME;;
	public class Runtimevalue {
	@Retention(RUNTIME)
	public @interface Veg {
		public String val() default "";
		public int ratio();
		public String[] values();
	}
}
	