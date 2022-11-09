package t1;

public class CallByValueCallByRefDemo {

	// datatype - call by value -> copy/clone
	// call by ref -> objects
	
	// Why Object are call by ref ->
	public static void main(String[] args) {

//		int i = 10;
//		int j = 20;
//		System.out.println("Before call");
//		System.out.println("i = " + i);
//		System.out.println("j = " + j);
//		CallByValueCallByRefDemo.callByValue(i,j);
//		System.out.println("After call");
//		System.out.println("i = " + i);
//		System.out.println("j = " + j);
		
		
		Student s1 = new Student();
		s1.name="student1";
		System.out.println("Before call");
		System.out.println("name = " + s1.name);
		CallByValueCallByRefDemo.callByRef(s1);
		System.out.println("After call");
		System.out.println("name = " + s1.name);
		
		
	}

	public static void callByValue(int i , int j) {
		i = 40;
		j = 50;
	}
	
	public static void callByRef(Student st1) {
		st1.name = "updated";
	}
	
}

class Student{
	String name;
}
