package butji;

public class ThisDemo2 {


		// TODO Auto-generated method stub
		
			String s;
			public ThisDemo2(String s) {
				this.s=s;
			}
			public static void main(String[] args) {
				//this keyword cannot be used inside a static method
				ThisDemo2 obj=new ThisDemo2("some value...");
				obj.printS("aaaaaaaaaa");//
			}
			
			public void printS(String s) {
				
				System.out.println();
			}
		}









