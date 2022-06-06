package june3;

public class Ssss {

	public static void main(String[] args) {
	
		public class Interface1
		{ public static void main(String[] args)
		{
		// anonymous
		new First() {
		// @Overirde
		public void met() {
		System.out.println("anonymoyus inner class met called...");
		}
		}.met();
		// method
		First ob=Interface1::mymethod1;
		ob.met();
		// lambda
		First olambda=()->
		{
		System.out.println("logic in lambda called..");
		};
		//muthu teacher style
		First onemuthu = new Last();
		onemuthu.met();
		// part 2;
		//anonoymous
		int value=new Second() {
		@Override
		public int met() {
		// TODO Auto-generated method stub
		return 110;
		}
		}.met();
		System.out.println("value of first inter..anonoymous..:"+value);
		// method refeernce
		Second neew= new Interface1()::mymethod2;
		neew.met();
		System.out.println("value of first in000ter -method ref"+neew);
		// lambdo
		Second two_lambdo=()->
		{
		return 2000
		;};
		value = two_lambdo.met();
		System.out.println("value of lambdo>>:::="+value);
		// muthu style
		Third four=new Third();
		value=four.met();
		System.out.println("value of first inter... muthu..:="+value);
		// part 3
		// anonoymous
		String val= new Secondary()
		{
		@Override
		public String met(int i, String s)
		{
		return i+":"+s;
		}
		}.met(07, "sakthivel");
		System.out.println("value....:"+val);
		// method reference
		Secondary sec=new Interface1()::mymethod3;
		val=sec.met(10, "sakthivel");
		System.out.println("value.......="+val);
		// lambdo
		Secondary seclambdo=(int num,String str)->
		{
		return num+":"+str;
		};
		val=seclambdo.met(637878, "sakthivel");
		System.out.println("value of lambdo...="+val);
		// muthu
		// Secondary pri=new Primary();
		// val=pri.met(3434,"fsfsdfsf");
		// System.out.println("value of muthu"+val);
		//part4
		//anonymous
		MyAccount myaccount=new MyAccount();
		myaccount.balance=10000;
		MyAccount my=new Six() {
		@Override
		public MyAccount transfer(MyAccount act, int amt) {
		act.balance=(act.balance-amt);
		return act;
		}
		}.transfer(myaccount, 500);
		System.out.println("balance....:"+my.balance);
		// method refernce
		Six six=new Interface1()::mymethod4;
		MyAccount ac=six.transfer(myaccount, 100);
		System.out.println("method ref,....:"+ac.balance);
		// lambda
		Six xlambda=(myc,amt)->
		{
		myc.balance=(myc.balance-amt);
		return myc;
		};
		ac=xlambda.transfer(myaccount, 200);
		System.out.println("value...lambda..:"+ac.balance);
		}
		public static void mymethod1()
		{
		System.out.println("mymethod is called");
		}
		public int mymethod2()
		{
		return 2000;
		}
		public String mymethod3(int i, String s)
		{
		return i+":"+s;
		}
		public MyAccount mymethod4(MyAccount act,int amt)
		{
		act.balance=(act.balance-amt);
		return act;
		}
		}class Last implements First
		{
		@Override
		public void met()
		{
		System.out.println("met normal old implementation called..");
		}
		}class Third implements Second
		{
		@Override
		public int met()
		{
		return 100000;
		}
		}
		}//class Primary implements Secondary
		//{
		// @Override
		// public String met(int i,String s)
		// {
		// return i+":"+s;
		// }
		//}
		interface First
		{
		public void met();
		}
		interface Second
		{
		public int met();
		}
		interface Secondary
		{
		public String met(int i,String s);
		}
		interface Six
		{
		public MyAccount transfer(MyAccount act,int amt);
		}class MyAccount
		{
		int balance;
		}


}
