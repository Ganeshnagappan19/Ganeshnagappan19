import java.io.FileInputStream;

public class ByteIo {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("applog.txt");
			System.out.println(fis.available());
	int available=fis.available();
	byte b[]=new byte[available];//its is used to fully call the values
	
fis.read(b);
System.out.println(fis.available());//after read the value is Zero
	String s=new String(b,0,available);	System.out.println(s);
 


//try (FileInputStream fis=new FileInputStream("applog.txt");)
//{
//
//
//
//
//byte b[]=new byte[4];
//int saktthi=0;
//while((saktthi=fis.read(b))!=-1)
//{
//System.out.println(saktthi);
//String s=new String(b,0,saktthi);
//System.out.println(s);
//}
//


}catch(Exception e)
{
e.printStackTrace();
}
}
}

