package arraydemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		B b1 = new B();
		b1.test2();
		
		A1 a1= new A1();
		a1.test1();
	}
}

// Inheritance - Parent properties -> child
// extends  keyword
// IS-A Relation 
// B is-a A
// one class will extend only one class 
// multiple inheritance not allowed in java
// Object class is parent class of all the classes
// Access Modifier

// public protected default private
// private - with in class
// default - with in package
// protected - default + which class inherit , they can access protected
// public 


class A1{
	void test1() {
		
	}
}
class A2{
	public void test2() {
	
	}
}




class C{
	public void test1() {
		System.out.println("C.test1");
	}
}

class A extends C{
	public void test3() {
		System.out.println("A.test1");
	}	
}

class B extends A{
	public void test2() {
		test1();
	}
}

