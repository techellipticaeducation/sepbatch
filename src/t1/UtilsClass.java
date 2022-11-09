package t1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UtilsClass {
public static void main(String[] args) {
	// Math
	
//	int start =1;
//	int end= 30;
//	for(int i = 1; i < 10 ;i++) {
//		double random = Math.random();
//		int randomInt = start + (int)((end-start)*random);
//		System.out.println(randomInt);
//	}
	
// 1 to 100 ->   100 -1 = 99
//	0 - 1   ,  0.45 * 100 = 45 + 200 = 245
//	200 - 300 = 100
	
	
//	// Scanner class
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter First Number");
//	int i1 = scan.nextInt();
//	System.out.println("Enter Second Number");
//	int i2 = scan.nextInt();
//	System.out.println("Sum " + (i1 + i2));
	
	//	Date
	Date dt1 = new Date(); // today date
	System.out.println(dt1);
	
	SimpleDateFormat format1 =  new SimpleDateFormat("yyyy-MMMMM-dd");
	System.out.println(format1.format(dt1));
	// 09-11-2022 
	
}
}
