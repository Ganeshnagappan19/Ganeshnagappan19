package june20;
		import java.time.DayOfWeek;
import java.time.LocalDateTime;
		import java.time.format.DateTimeFormatter;
		import java.time.temporal.ChronoUnit;
		import java.util.Scanner;  
		public class Bikerider{  
			
		public static void main(String[] args) {
	
		int date,month,year,hour,minute;
		
		
		double distance,speed;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date.....:=");
		date=sc.nextInt();
		
		System.out.println("Enter the Month........;=");
		month=sc.nextInt();
		
		System.out.println("Enter the year.....:=");
		year=sc.nextInt();
		
		System.out.println("Enter the timer......:=");
		hour=sc.nextInt();
		
		System.out.println("Enter the minutes.....:=");
		minute=sc.nextInt();
		
		LocalDateTime ldt=LocalDateTime.of(year,month,date,hour,minute);
		
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-a");
		
		String sa=ldt.format(dtf);
		
		System.out.println("the start time is .....:="+sa);
		
		System.out.println("Enter the distance of Km.........");
		distance=sc.nextDouble();
		
		System.out.println("distance of...:="+distance);
		
		System.out.println("Enter the speed in hours....:=");
		
		speed=sc.nextDouble();
		
		double s=distance*60/speed;
		
		
		int b=(int)s;
		
		System.out.println("the total travel timing...:="+s);
		
		LocalDateTime as=ldt.plusMinutes(b);
		
		
		long p2=ChronoUnit.DAYS.between(ldt, as);
		int n=(int)p2+1;
		int g=0,j=0;
		
		for(int i=0;i<=n;i++)
		{
		LocalDateTime kg=ldt.plusDays(g);
		
		g++;
		DayOfWeek dow=kg.getDayOfWeek();
		
		if(DayOfWeek.SUNDAY.equals(dow))
			
		{
		n++;
		j++;
		}
		}
		try {
		LocalDateTime obj=as.plusDays(j);
		
		String str=obj.format(dtf);
		
		System.out.println("End time is ........"+str);
		
		sc.close();
		
		System.out.println("ended................,,");
		 
		int year1=sc.nextInt(); 
		
		if
		(((year1% 4 == 0) && (year1 % 100!= 0)) || (year1%400 == 0))
		{
		System.out.println("Specified year is a leap year"+year1);
		}
		}catch(Exception e) {
		System.out.println(e);
		}
		}
		}
