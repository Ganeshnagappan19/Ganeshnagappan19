package butji;

public class While {


		public static void main(String[] args) {
		int n=1;
			//while(true){ //infinite loop
		//System.out.println("called....");}
			while(n>10) {
				System.out.println("loop executed - while...");
			}
			
			do {
				System.out.println("loop executed - do while...");
	}while(n>10);
			
			while(n>0) {
				System.out.println(n);
				n--;
			}	
	
		

}
}
		