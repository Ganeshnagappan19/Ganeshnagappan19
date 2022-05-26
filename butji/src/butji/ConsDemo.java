package butji;

public class ConsDemo {
	
		
		public ConsDemo() {//its constructor
			System.out.println("cons with default called...");
		}
		public ConsDemo(int i) {//parameterized constructor
			System.out.println("cons with i value called...:"+i);
		}
		public ConsDemo( Employee e){
			System.out.println("employee cons called...."+e);
		}
		
		//public ConsDemo()
		public static void main(String[] args) {
			new ConsDemo();//object
			new ConsDemo(20);//object
			new ConsDemo( new Employee());//object
		}
	} class Employee {}

