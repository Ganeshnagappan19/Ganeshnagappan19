package Demo;

import java.util.Scanner;



public class Superfan {

	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  Massfan obj=new Massfan();
			//obj.push();	  
			
			while(true)
			{
				System.out.println("enter any press key............");
				scan.next();
				obj.push();
			}
	
	}
}
class Massfan 
{
	  Ushafan state=new SakthifanSwitchon();
    public void push(  ) {
    	
    	state.pull(this);
    	
    	
    }	
}

abstract class Ushafan{
	     public  abstract void pull(Massfan  ff);
	       
}
class SakthifanSwitchon extends  Ushafan
{
	
	@Override
	public void pull(Massfan ff) {
		// TODO Auto-generated method stub
		System.out.println("medium speed");
		ff.state=new kaliafanswitchoff();
	}
}
  class kaliafanswitchoff extends Ushafan{
	  @Override
	public void pull(Massfan ff) {
		// TODO Auto-generated method stub
	  System.out.println("  on ");
	  ff.state=new Vivofanmedium();
	  
	}
  }
  
  class Vivofanmedium extends Ushafan {
	  
	  
	@Override
	public void pull(Massfan ff) {
		// TODO Auto-generated method stub
		System.out.println("high speed ");
		ff.state=new Maarifanswitchhighspeed();
	} 
	  
	  
  }
   class Maarifanswitchhighspeed extends Ushafan{
	     @Override
	    public void pull(Massfan ff) {
	    	// TODO Auto-generated method stub
	    System.out.println("off the fan ");	
	    }
   }
	   
	   
	   
   