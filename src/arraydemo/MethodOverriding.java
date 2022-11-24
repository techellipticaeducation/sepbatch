package arraydemo;

public class MethodOverriding {
	public static void main(String[] args) {
		Child child1 = new Child();
		child1.test1();
	}
}

// private -  
// default -
// protected - 
// public -


//  parent 2bhk
//  child 3bhk, 4bhk, but 1bhk is not allow
// we cannot reduce the visibility of overridding method - compile error
// we cannot change method return type
// If We have parent child relation in method overriding we cant return 
// If We parent returning parent class object , then child can return return-type-child-object

class Parent{
	int i = 10;
	public J2 test1() {
		System.out.println("Parent.test1");
		return new J2();
	}
}

class Child extends Parent{
	public J3 test1() {
		System.out.println("Child.test1");		
		return new J3();
	}
}

//parent - J1 , child J2
class J1{
	
}
class J2 extends J1{
	
}
class J3 extends J2{
	
}

