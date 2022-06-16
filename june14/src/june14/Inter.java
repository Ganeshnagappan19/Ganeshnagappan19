package june14;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;      

public class Inter {
	public static void main(String[] args) {
	
			ExecutorService es=Executors.newFixedThreadPool(2);
			Babu ii =new Babu();
			es.execute(()->{
				for(int i=0;i<7;i++) {
					ii .Going();
				
				}
			}); 
			
		
		
	es.execute(()->{
		for(int i=0;i<7;i++) {
			ii.coming();
			
		}
	});	
	es.shutdown();
}}
	class Babu{  
		boolean flag;
	synchronized public void Going () {
	if(flag) {
		try { wait();}catch(Exception e ) {}
	}
		
	System.out.println("jj");

	flag=true;
	notify();
		
	}
	
synchronized public void coming () { if(!flag) {
	try { wait();}catch(Exception e ) {}
}
	
flag=false;
System.out.println("fire");

notify();
		
	}
	
}


