package abstractdemopac;

public class FullAbstraction {
	public static void main(String[] args) {
	
		inter1 in1 = new Test2();
	//	webdriver driver = new ChromeDriver();
		
	}
}
// interface is full abstraction
// one class can implements n number of interface
interface inter1{
	public void test1();
	public void test2();
}

interface inter2{
	public void test1();
	public void test3();
}

class Test2 implements inter1, inter2{
	public void test1() {

	}
	public void test2() {

	}
	public void test3() {

	}
}


