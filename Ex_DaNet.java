package course;

import java.util.Scanner;

public class Ex_DaNet {

	public static void main(String[] args) {
     
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome Completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �:" + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �:" + primeiroNome);
		
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade �" + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �" + altura);
		
		
		

	}

}
