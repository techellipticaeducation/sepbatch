package exceptionHandling;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			NM.test1(); //  Compile time exception
		}catch(Exception e) {
			System.out.println("hello");
		}
	}
}


class NM{
	public static int test1()throws TestometerSessionNotPresentException  {
		int i = 0;
		int j = 10;
		return j/i;
	}
}
