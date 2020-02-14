package course;

import java.util.Scanner;

public class Ex_DeBit {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int mask = 32;//0b100000;
		int n = sc.nextInt();
		
		if(( n & mask ) != 0){
			System.out.println("6th bit e true:");
		}
		else {
			System.out.println("6th bit e falso:");
		}

	}	

}
