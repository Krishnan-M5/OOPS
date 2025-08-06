package oop;


import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO CHECK");
		int num = var.nextInt();
		
		int count = 0;
		if (num <= 1) {
			System.out.println("1 is prime");
		}
		else {
			for(int i =2 ; i<= Math.sqrt(num);i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			
			if(count ==0) {
				System.out.println(num + " IS PRIME");
				
			}
			else {
				System.out.println( num + " IS NOT PRIME");
			}
			}
		

	}
}
