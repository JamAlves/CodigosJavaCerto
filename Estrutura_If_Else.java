package course;
import java.util.Scanner;

public class Estrutura_If_Else {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter an integer number:");
		int n = sc.nextInt();
		
		if (n % 2 ==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd!");
		}
		
		
		
		
		
		sc.close();
	}

}
