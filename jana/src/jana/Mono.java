package jana;
import java.util.Scanner;

public class Mono {


			public static void main(String[] args) {
				Scanner mono=new Scanner(System.in);
				
				System.out.println("Please enter your name..:");
				
				String name=mono.next();
				
				System.out.println("Welcome Mr.../Ms...:"+name);
				
				System.out.println("Please enter your age..:");
				
				int age=mono.nextInt();
				
				System.out.println("Your age is...:"+age);
			}
		}
	