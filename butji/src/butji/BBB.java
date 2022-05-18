package butji;

/*public class BBB {


		// TODO Auto-generated method stub
//			public class Scope{
		private int i;
		public static void main(String argv[]){
		String s = new String();
		s.  method();
		}//End of main
		public static void amethod(){
		System.out.println(i);
		}
	}*/


class BBB{
private void amethod(int iBase){
System.out.println("Base.amethod");
}
}
class Over extends BBB{
public static void main(String argv[]){
Over o = new Over();
int iBase=0;

o.amethod(iBase);
}
public void amethod(int iOver){
System.out.println("Over.amethod");
}
}