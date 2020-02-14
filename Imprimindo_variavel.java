package course;

public class Imprimindo_variavel {

	public static void main(String[] args) {
		
		int a = 10;
		
		boolean c1 = a < 10;
		boolean c2 = a < 20;
		boolean c3 = a < 10;
		boolean c4 = a < 5;
		
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    System.out.println(c4);
	    System.out.println("-------------------------");
	    
	    boolean c5 = a <= 10;
	    boolean c6 = a >= 10;
	    boolean c7 = a == 10;
	    boolean c8 = a != 10;
	    
	    System.out.println(c5);
	    System.out.println(c6);
	    System.out.println(c7);
	    System.out.println(c8);
	    System.out.println("-------------------------");
	    
	    boolean c9 = (2 >3) || (4!=5);
	    boolean c10 = !( 2>3 ) && (4 !=5);
	    System.out.println(c9);
	    System.out.println(c10);
	    System.out.println("-------------------------");
	    
	    int b = 25;
	    
	  boolean c11 = b >= 30;
	  System.out.println(c11);
	  
	  long x = 10;
	  int y =(int) x;
	  System.out.println(y);
	  System.out.println("-------------------------"); 
	  
	  
	  
	  int n1 = 89;
	  int n2 = 60;
	  
	  System.out.println(n1 & n2);
	  System.out.println(n1 | n2);
	  System.out.println(n1 ^ n2);
	  
	    

	}

}
