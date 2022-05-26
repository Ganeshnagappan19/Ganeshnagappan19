package butji;

public class ClassVariable {
	int k=1;//instance variable
	abc g;
	static int j=10;//class variable
public static void main(String[] args) {
	abc s=new abc();
	ClassVariable d=new ClassVariable();
	s.msg(d);
	j=100;
	ClassVariable c=new ClassVariable();
	System.out.println(c.k);
	//c.k=5;
	System.out.println(c.k);
	int i=100;
	int b=i;
	i=50;
	System.out.println(abc.g);
	System.out.println(s.s);
	System.out.println(s.s);
	s.s=5;
	System.out.println(s.s-5);
	System.out.println(s.s);
}
}
class abc{
	int s=10;
	
   static int g=5;
   
	void msg(ClassVariable a) {
		int c=ClassVariable.j;
		//ClassVariable.k=5;
		int i=5;//local vaiable
		System.out.println(c);
		
	}
}