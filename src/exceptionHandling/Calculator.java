package exceptionHandling;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean isFlowRunning = true ;
		while(isFlowRunning) {
			try {
			System.out.println("Enter first Value");
			int j = scan.nextInt();
			System.out.println("Enter Second Value");
			int k = scan.nextInt();
			int m  = j + k ;
			System.out.println("Your input sum is " + m);

			System.out.println("If You want to continue : plz write y");
			String nextString = scan.next();
			if(!nextString.equalsIgnoreCase("y")) {
				isFlowRunning = false; 
				System.out.println("Thank you using my calculator");
			}
			}catch(Throwable e) {
//				e.printStackTrace();
				System.out.println("some error in your input. be careful with your input");
				 scan = new Scanner(System.in);
			}
		}
	}
}
