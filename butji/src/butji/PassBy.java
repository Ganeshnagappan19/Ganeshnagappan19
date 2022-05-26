package butji;

public class PassBy {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.size=10;
		
		System.out.println("Size of laddu before PBV..:"+laddu.size);//10
		PBV DD=new PBV();
		DD.accept(laddu.size);
		//new PBV().accept(laddu.size);
		System.out.println("Size of laddu after PBV..:"+laddu.size);//10  5
		
		
		System.out.println("Size of laddu before PBR..:"+laddu.size);//10  5
		new PBR().accept(laddu);
		System.out.println("Size of laddu after PBR...:"+laddu.size);//5
	}
	
}
class PBV{
	public void accept(int size) {
		size=size-5;//5
	}
}
class PBR{
	public void accept(Laddu a) {
		a.size=a.size-5;
	}
}
class Laddu{
	int size;
}