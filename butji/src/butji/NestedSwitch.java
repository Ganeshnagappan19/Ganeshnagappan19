package butji;
import java.util.Scanner;

public class NestedSwitch  { 
		public static void main(String args[]){ 
//		 int tech = 2; 
//		int course = 2; 
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the sc values");
			
			int sc=obj.nextInt();
		
	 
		 switch(sc) {
		case 1: 
		 System.out.println("python"); 
		 break; 
		 case 2: 
			 System.out.println("Enter the scr valuews");
			 int scr=obj.nextInt();
		 switch(scr) {
		
		case 1: 
		 System.out.println("J2EE"); 
		 break; 
		 case 2: 
		 System.out.println("advance java"); 
		 } 
		 } 
		 } 
		} 




