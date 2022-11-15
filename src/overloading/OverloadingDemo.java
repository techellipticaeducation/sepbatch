package overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
//		int i = 10;
//		int j = 20;
//		long sum = OverloadingDemo.add(i,j);
//		System.out.println(sum);	
	
		
	}
	
	// service 
	
	// kitchen
	// same method name 
	// Method Overloading - when we have same method name but different number of param or differnt type of param
	// Polymorphism  = one entity have diffent form, compile time 
	
	// ambiguity state
	public static long add(int i , int j) {
		System.out.println("int - int");
		return i+j;
	}
	
	public static long add(int i , float j) {
		System.out.println("int - float");
		return i+(int)j;
	}

	public static long add(float i , int j) {
		System.out.println("float - int");
		return (int)i+j;
	}
	
	public static long add(float i , float j) {
		System.out.println("float - float");
		return (int)i+(int)j;
	}
	
	
	
	
	
	
	
	
	public static int add(int i, int j, int k) {
		return i+j+k;
	}
	
	public static int add(int i, int j, int k, int m) {
		return i+j+k+m;
	}
	
	public static int add(int i, int j, int k,int m, int n) {
		return i+j+k+m+n;
	}
	
}
