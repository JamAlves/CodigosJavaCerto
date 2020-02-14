package course;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*indentar código: ctrl + shift + f */ 
	 
	int x = sc.nextInt();
	String day;
	
	    switch (x) {
	    case 1:
	        day = "Sunday";
	        break;
	        
	    case 2:
	        day = "Monday";
	        break;
	    case 3:
	        day = "Tuesday";
	        break;
	    case 4:
	        day = "Wednesday";
	        break;
	    case 5:
	        day = "Thrusday";
	        break;
	    case 6:
	        day = "friday";
	        break;
	    case 7:
	        day = "Saturday";
	        break;
	   default:
		   day = "Invalid value";
	      
	    }
	   
	    System.out.println("Day: " + day);
		

	}

}
