package objects;
// 3 types
// instance variable - object
// static variable - class
// local variable - block variable , param

public class VariablesDemo {

	int instanceVariable; // instance (Object) variable , straight and blue
//	static final int kl=78;
	static int staticVariable = 56;  // italics and blue, static variable , 
	// constant but in term of memory , shared variable, class variable
	// value = final
	
	int g2 = g1;
	static int g1 = 10;
	
	void m1(int k) {
		int i = 10; // black color	
	}
	
}


class VariableDemoTest{
	public static void main(String[] args) {
		
		VariablesDemo.staticVariable = 45;
		
		
		VariablesDemo v1 = new VariablesDemo();
		v1.instanceVariable = 30;
		
		v1.staticVariable = 40;
		
		VariablesDemo v2 = new VariablesDemo();
		v2.instanceVariable = 40;
		
		v2.staticVariable = 50;
		
		System.out.println(v1.instanceVariable);
		System.out.println(v2.instanceVariable);
		System.out.println(v1.staticVariable);
		System.out.println(VariablesDemo.staticVariable);
		
	}
}


class TestClassSession{
	
}
