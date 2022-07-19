package exercisetest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class IOurl
	{
	
public static void main(String[] args)
	{
	URLConnection urlcon=null;
	
	try
	{
		
	URL url = new URL("https://www.bing.com/ck/a?!&&p=6136c66c90fc80ae592e246208abacc94e577c07a86da34e77c17809f38eac58JmltdHM9MTY1ODIyMjMzOSZpZ3VpZD1mNDAxYTRiMy01MmQyLTRkYWUtOWEyZi03MzA4ZmRkZTc1ZjAmaW5zaWQ9NTE4NQ&ptn=3&fclid=d277b825-0743-11ed-b32a-8343da63bf07&u=a1aHR0cHM6Ly9lbi53aWtpcGVkaWEub3JnL3dpa2kvTml0aHlhbmFuZGE&ntb=1"); 
		urlcon=url.openConnection();
		

	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	try
	(	BufferedInputStream bio=new BufferedInputStream(urlcon.getInputStream());
		FileOutputStream fio=new FileOutputStream("nithi.html");		
	)
	{
		byte [] b=new byte[128];
		 int bytes= 0;
	 while((bytes=bio.read(b))!=-1){
		 
		 
		 
		 fio. write(b,0,bytes);
		 
		 
	 }
	}catch(Exception e
			)
	{
		e.printStackTrace();
	}
	}
}