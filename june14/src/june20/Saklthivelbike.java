package june20;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Saklthivelbike {
	
	Scanner sc = new Scanner(System.in);
	LocalDateTime now = LocalDateTime.now();
	
	System.out.println("Startdate and time...:=");
	
	float travel_speed,travel_time,distance;
	
	System.out.println("enter the speed kmph....:=");
	
	travel_speed=sc.nextFloat();
	
	System.out.println("Enter the timing the hours...:=");
	travel_time=sc.nextFloat();
	
	System.out.println(" Distance value of....:=");
	distance=sc.nextFloat();
	
	distance=travel_speed*travel_time;
	
	System.out.println("Total of distance....:="+distance+"km");

}
}
