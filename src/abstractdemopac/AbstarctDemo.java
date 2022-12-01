package abstractdemopac;

public class AbstarctDemo {
	public static void main(String[] args) {
		Car c1 = new Maruti();
		c1.test1();
		System.out.println(c1.maxspeed());

		
		
		// abstract class - object not possble (HAS-A relation not allowd)
		// IS-A relationship 	
		// Partial abstraction 
		
		
		//	final - constant - we cannot change the value
		//  method - we cannot override the method
		//  class - we cannot extends the class (IS-A Relationship)
		//  HAS-A Relationship
		
		// we cannot use abstract and final together 
	}
}



// Mandatory 
abstract class Car{

	Car(){
		System.out.println("i am car construtor");
	}
int i =10;
	public abstract int maxspeed();
	public abstract int milage();

	public void test1() {
		System.out.println("test");	
	}
}


class Maruti extends Car{
	Maruti(){
		System.out.println("i am maruti construtor");
	}
	
	public int maxspeed() {
		return 50;
	}
	public int milage() {
		return 13;
	}
}

class Audi extends Car{
	public int maxspeed() {
		return 200;
	}
	public int milage() {
		return 13;
	}
}

class Tata extends Car{
	public int maxspeed() {
		return 150;
	}
	public int milage() {
		return 13;
	}
}

