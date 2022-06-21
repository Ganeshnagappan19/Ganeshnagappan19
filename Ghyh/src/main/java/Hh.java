
import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Hh {
	static Logger logger=Logger.getLogger(Hh.class);

	public static void main(String[] args) {

		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		
		//file input type its is give a file file input like as current file(absolute file )
//and like as path file  of like d/:gloown file name ;		
		try {FileInputStream fias =new FileInputStream("applog.txt");
		System.out.println(fias.read());//its is used to print auto next line print cursor ;
		System.out.println(fias.read());
		System.out.println(fias.read());
		System.out.println(fias.read());
		System.out.println(fias.read());
		System.out.println(fias.read());
		System.out.println(fias.read());
		System.out.println(fias.read());
		System.out.println(fias.read());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//logger.info("chicken biryani");
//							try {
//								FileInputStream fis=new FileInputStream("applog.txt");
//								System.out.println(fis.available());
//								System.out.println((char)fis.read());
//								System.out.println((char)fis.read());
//								System.out.println((char)fis.read());
//								System.out.println((char)fis.read());
//								System.out.println((char)fis.read());
//								System.out.println((char)fis.read());
//							System.out.println((char)fis.read());
//								System.out.println(fis.read());
												
					}catch(Exception e) {
					e.printStackTrace();
				}
	}
}
						
	
		