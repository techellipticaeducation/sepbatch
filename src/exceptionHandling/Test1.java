package exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test1 {
	public static void main(String[] args) {
		// try (mandatory) , catch, finally 
		int i  = 1;
		int j = 0;
		
		int[] kl= new int[2];
		
		try {
			System.out.println(i/j);
			System.out.println("i am in the try block");
			kl[4] = 0;
		}catch(ArithmeticException e) {
			System.out.println("You should not devide your value with " + j);
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not correct. kindly check once ");
		}catch(Exception e) {
			System.out.println("something is wrong");
		}

		System.out.println("I am the code after exception");

	}
}
