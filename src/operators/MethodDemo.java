package operators;

public class MethodDemo {

	// methods in java
	
	// Method - Service 
	//     give some input  - > Service -> output
	
   // input - parameters , params
   // output - return-type
	// method
	
	public static void main(String[] args) {
		MethodDemo m1 = new MethodDemo();
//		int j = m1.add(30, 40); // 30 and 40 are arguments - call
//		System.out.println(j);
//		
//		double db = m1.valueOfPi();
//		System.out.println(db);
//		
//		m1.noReturnMethod(0);
		
		int myage = 23;
		String ageGroup = m1.ageGroup(myage);
		System.out.println(ageGroup);
	}
	
// Comments 
	// 3 types , Single line comment, multi-line comment, Documentational Comment
    // dsksafla
	
	// method name should be in camel case 
	// mynameiskhan = myNameIsKhan
	/*
	 * ajdfhkjad
	 * asdflhasdfl
	 * dsfhgasd
	 * asdhfkasdfkasdgf
	 * adsfahsdgkagdkf
	 * asdhfgkadsgfkasdhgf
	 * hasgdfkhgasdhfkgasd
	 * jhasdgfkhgads
	 * 
	 */
	
	/** 
	 * Age Group method. This method will return age group based on below criteria <BR/>
	 * age is less then 18 then it will return Child <BR/>
	 * age is equals to or more then 18 , then it will return Adult
	 */
	String ageGroup(int age){
		 if(age < 18) {
			 return "Child";
		 }
		 return "Adult";
	 }
		
	// return must be the last logical statement
	
	int add(int a, int b){ // a and b is parameter - define 
		int c = a +b;
		return c;
	}
	
	double valueOfPi(){   // Non Parameterized method
		double db = 3.14;
		return db;
	}
	
	void noReturnMethod(int counter) { //no return type
		counter++;
		System.out.println(counter);
		return;
	}
	
	
	
}
