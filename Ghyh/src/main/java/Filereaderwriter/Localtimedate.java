package Filereaderwriter;

	import java.time.LocalDateTime;  
	import java.time.format.DateTimeFormatter;  

public class Localtimedate { 
	    public static void main(String[] args) {  
	        LocalDateTi now = LocalDateTime.now();  
	        System.out.println("Before Formatting: " + now);  
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	        String formatDateTime = now.format(format);  
	        //System.out.println("After Formatting: " + formatDateTime);  
	    }  
	}  


