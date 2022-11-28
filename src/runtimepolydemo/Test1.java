package runtimepolydemo;

public class Test1 {
	public static void main(String[] args) {
		P1 p1 = new C1();
		p1.m1();
//		p1.m2();
	}
}


class P1{
	public void m1() {
		System.out.println("P1-m1");
	}
}

class C1 extends P1{
	public void m1() {
		System.out.println("C1-m1");		
	}
	public void m2() {
		System.out.println("C1-m2");				
	}
}
