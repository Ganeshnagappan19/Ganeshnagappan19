package methodsbasic;

public class Adaptermodel
{
	public static void main(String[] args) 
	{
		AmericanPlug lenovo=new LenovoPlug();
		
		IndianSocket socket=new ShakthiSocket();
		
		IndianAdapter ip=new IndianAdapter();
		ip.plug=lenovo;
		
		socket.roundPinHole(ip);
				
	}
}
abstract class AmericanPlug 
{
	public abstract void slappin();
}

abstract class IndianPlug 
{
	public abstract void roundpin();
}
abstract class IndianSocket 
{
	public abstract void roundPinHole(IndianPlug ip);
}

class IndianAdapter extends IndianPlug
{
	AmericanPlug plug;
	@Override
	public void roundpin() {
		plug.slappin();
	}
}
class LenovoPlug extends AmericanPlug{
	@Override
	public void slappin() 
	{
		System.out.println("american plug working.........");
	}
}
class ShakthiSocket extends IndianSocket{
	@Override
	public void roundPinHole(IndianPlug ip) 
	{
		ip.roundpin();
		System.out.println("indain plug is called");
	}
	
	

}
