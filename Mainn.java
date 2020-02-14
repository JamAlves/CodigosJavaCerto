package course;
import java.util.Locale;
import java.util.Scanner;
public class Mainn {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    char resp;
	    do {
	    	
	    	System.out.println("Digite a temperatura em Celsius");
	    	double C = sc.nextDouble();
	    	double F = 9.0 * C / 5.0 + 32.0;
	    	System.out.printf("Equivalente em fahrenheit: %.1f%n",F);
	    	System.out.print("Deseja repetir (S/N)?");
	    	resp = sc.next().charAt(0);
	    	
	    } while(resp != 'n');
		
		sc.close();
	}

}
