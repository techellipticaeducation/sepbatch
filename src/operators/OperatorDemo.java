package operators;

public class OperatorDemo {
public static void main(String[] args) {
	// What is operator
	// Arithmatic Operator

	 // + - * / %
	
	//	10 % 3 = 1 
	
	int a = 10;
	int b = 4;
//	float k = (float)a / (float)b; // 2.5 , 3.44 = 3 , 6.77 = 6 
//	System.out.println(k);
//	int m = a + b + a - b;
//	System.out.println(m);

	// increment and decrement by one
	// pre  and  post
	// pre increment =  first increase then assign
	// post increment = first assign then increase

	
	int d = ++a + a++ + a++ + ++a + a++ + a++ + ++a + a++ + ++a;
// shortcut jaha per increment dikhe add karo . jaha per varibale, write it down
	//   11 + 11 +12 +14 + 14 + 15 + 17 + 17 + 19
 
	System.out.println("a = " + a); //  15
	System.out.println("d = " + d); //  58 / 62 (4) / 
	
	// Comparison operator
	// > < >= <= == !=  = boolean
	System.out.println(a >b);
	System.out.println(a <b);
	System.out.println(a >=b);
	System.out.println(a <=b);
	System.out.println(a == b);
	System.out.println(a !=b);
	
	
	System.out.println("Bitwise & Operators");
	// Bitwise and Logical Operator
	 // & AND = both value must be true 
	System.out.println(true & true);
	System.out.println(true & false);
	System.out.println(false & true);
	System.out.println(false & false);
	
	System.out.println("Bitwise | Operators");
	System.out.println(true | true);
	System.out.println(true | false);
	System.out.println(false | true);
	System.out.println(false | false);


	System.out.println("Logical && Operators");
	// Bitwise and Logical Operator
	 // & AND = both value must be true 
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	
	System.out.println("Logical || Operators");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);

	
	// Assignment operator
	//	a=+6;  ==    a=a+6;
	
//	ternary operator   ?:
	
//	mix up of operator (comaprison and assignment )
	
	int age = 20;
	String ageGroup =age<18?"child":"adult";
	System.out.println(ageGroup);
	
	// bitwise 
	// ternary operator  ?:
	// increment / decrement 
	
	int m = 10;
	int n = m++ + m++ + m++;
		// 10 + 11 + 12
	System.out.println(n);
	
	
	
}
}
