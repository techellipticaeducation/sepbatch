package exceptionHandling;

public class CustomException {
	public static void main(String[] args) {
		try {
			int i = 1;
			if(i == 1) {
				throw new TestometerSessionNotPresentException("because i value is 1");
			}			
		}catch(TestometerSessionNotPresentException e) {
			e.printStackTrace();
		}
	}
}


// Custom Exception
class TestometerSessionNotPresentException extends Exception{

	String msg ;
	TestometerSessionNotPresentException(){
		System.out.println("some issue in session.");
	}
	TestometerSessionNotPresentException(String msg){
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}



}
