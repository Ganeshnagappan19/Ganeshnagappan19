package june14;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;      

public class Inter {
	public static void main(String[] args) {
		
	ExecutorService	 es =Executors.newFixedThreadPool(1);

	Fire obi=new Fire();
	es.execute(()->{
		for(int i=0;i<7;i++) { 
			obi.gg();
			
		}
		});
	es.execute(()->{
		for(int i=0;i<7;i++) {
			obi.hh();
		}
	});	
	es.shutdown();
}
	class Fire{boolean flag;
	synchronized public void gg () {
	if(flag) {
		try { wait();}catch(Exception e ) {}
	}
		
	System.out.println("jj");

	flag=true;
	notify();
		
	}
	
synchronized public void hh () { if(!flag) {
	try { wait();}catch(Exception e ) {}
}
	
flag=false;
System.out.println("fire");

notify();
		
	}
	
}
}

