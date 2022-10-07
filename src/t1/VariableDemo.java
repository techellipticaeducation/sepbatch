package t1;

public class VariableDemo {
	public static void main(String[] args) {
		
		// keyword - predefined words in any language 
		// keyword - variable , small-letter, 
		// reserved keyword
		int Public  =10;
		
		final int m = 10;
		
		// naming convention
		// a-zA-Z$_
		
		// variable - vary + able = 
		int a = 10;
		System.out.println("a = " + a); // 10
		a = 20;
		System.out.println("a = " + a);
		
		int b = a;
		System.out.println("b = " + b);
		
		// + == add , 2+5 = 7
		// + = append
		
		
		int x = 10;
		int y = 7;
		// swap tha value
		// y = 10
		// x = 7
		
		//#1 - with using third variable
//		int z = y; // x = 10, y = 7, z = 10
//		y = x; // x= 7, y = 7, z = 10
//		x = z ; // x = 7 , y = 10, z = 10
		
		//#2 - without using third variable
		x = x + y; // x = 17, y = 7
		y = x - y; // x = 17, y = 10 
		x = x - y; // x = 7, y = 10
		
		// #3
		x = x * y; // x = 70, y = 7
		y = x / y; // x = 70, y = 10 
		x = x / y; // x = 7, y = 10
		
		System.out.println(10+20);
		System.out.println("sum="+10+20);
		System.out.println(10+20+"sum="+10+20);
		System.out.println(10+20+"sum="+(10+20));
		// sysout = until we are not using string "",
		// till that + = adding, as soon "" , append 
		
	}
}
