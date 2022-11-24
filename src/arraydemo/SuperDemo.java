package arraydemo;

public class SuperDemo {
	public static void main(String[] args) {
		B3 b3 = new B3();
		b3.test2();
	}
}
class B0{
	public void test1() {
		System.out.println("B0.test1");
	}
}
class B1 extends B0{
	
}

class B2 extends B1{
	public void test1() {
		System.out.println("B2.test1");
	}
	public void test2() {
		super.test1();
	}
}

class B3 extends B2{

}
