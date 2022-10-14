package operators;

public class LoopDemo {
	public static void main(String[] args) {
		
		// 3 loop
		// while, do while, for
		// until it is true
		
		// While - min = 0 , max = infinite (first condition evaluate then exeucte)
		
		int i = 20;
//		while(true) {
//			// infinite loop
//		}
		
		while(i <= 10) {
//			System.out.println(i);
			i++;
		}
		//System.out.println("now i am out from while loop");
		
		// do..while  (first execute then evaluate), Min = 1, max = infinite
		
		int a = 20;
		do {
//			System.out.println(a);
			a++;
		}while(a <= 10);
		
		// when to use = how many times your loop going to run 
		
		// For Loop - when you knwo how many time syou need to run it 
		for(int m = 0 , n = 1, j = 1;  m < 10 && n < 10 && j <10; m++,n++,j++) {
			System.out.println("hello i am " + m);
		}
		
//		for(;;) {
//			// infinite loop
//			System.out.println("hello ");
//		}
		
		// initialize block = once
		// conditional block
		// for loop body
		// increment / decrement
		
		
	}
}
