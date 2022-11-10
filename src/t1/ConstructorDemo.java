package t1;

public class ConstructorDemo {
	// use to create object of class
	// once invoke
	// default constructor - non paramerterized 
	// house
	// instance variable - intialize 
	String name ;

	ConstructorDemo(String nameParam){
		name = nameParam;
		System.out.println("contructor");
	}
	// Explicit constructor - default nature is gone
	
	//method no return 
	//name should be same as class name
	
	// every class has a default constructor
	{
		System.out.println("instance block");
	}
	
	public void showName() {
		System.out.println(name);
	}
	
	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo("Vaibhav");
//		c1.showName();
		
		ConstructorDemo c2 = new ConstructorDemo("Va");
		ConstructorDemo c3 = new ConstructorDemo("sadf");
		
		ConstructorDemo c4 = c3;
		
		
//		HAS A Relationship
		
	}
	
}
