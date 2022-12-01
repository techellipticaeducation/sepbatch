package abstractdemopac;

public class StaticInheritance {
	// static - inheritance
	public static void main(String[] args) {
		A b1 = new B();
		
		B.staticMethod();
		b1.nonstaticMethod();
		
	}
	
}

// static method hide them selves
// non-static method 

class A{	
	public static void staticMethod() {
		System.out.println("A.static Method");
	}
	public void nonstaticMethod() {
		System.out.println("A.nonstatic Method");
	}
}

class B extends A{
	public static void staticMethod() {
		System.out.println("B.static Method");
	}
	public void nonstaticMethod() {
		System.out.println("B.nonstatic Method");	
	}
	
}