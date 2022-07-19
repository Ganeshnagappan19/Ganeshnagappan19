package methodsbasic;

public class Demoabstract {

	
	
}
	abstract class Vehicle
	{
	   public abstract void engine();
	}
	public class Car extends Vehicle {

	    public void engine()
	    {
	        System.out.println("Car engine");
	        // car engine implementation
	    
	
	    public static void main(String[] args)
	    {
	        Vehicle v = new Car();
	        v.engine();
	    }
	}