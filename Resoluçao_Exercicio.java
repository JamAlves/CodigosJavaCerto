package course;

import java.util.Locale;
import java.util.Scanner;

public class Resolu�ao_Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine();
		System.out.println("how many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (some line):");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.printf("%. 2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%", height);
		
		
		
		
		
		
		
		sc.close();

	}

}
