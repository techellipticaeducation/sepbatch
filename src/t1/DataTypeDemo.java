package t1;

public class DataTypeDemo {
	public static void main(String[] args) {
		
//		Binary number system 
		
		// 1 byte = 8 bits
		// 1 byte = 0 to 255 = -128 to +127 ((-2^7 to 2^7 -1) ) 
	
//		numeric value are cyclic
		
		// casting
		
		long h = 1l; // 8 byte
		byte b1 = (byte)h; // 1 byte
//		System.out.println(b1);
		
		short s1 = 89;
		int i1 = 67;
		long kl = 789_670_565;
//		System.out.println(kl);
		
//		56 = 70 (octal) = 38(hexadecimal)

		int m = 56;
		System.out.println(m);
		int m1 = 070;
		System.out.println(m1);
		int m2 = 0X38;
		System.out.println(m2);
				
		// numeric , 1,2,3,22,45,657
//			byte - 1 byte =  2^8
//			short - 2 byte = 2^16
//			int - 4 byte =   2^32
//			long - 8 byte =  2^64
		
//		// floating, 2.4 , 6.7
//			float  - 4 byte
//			double - 8 byte
		
		float h9 = 2.6f*4;
		long gh = (long)h9;
		System.out.println(h9);
		System.out.println(gh);
		
		double db = 8.9d;
		System.out.println(db);
		
//		// Char
//			char
		char ch = 'A';
		int charVa = (int)ch;
		System.out.println("ascci value for A -> " + charVa);
		// All char are int 1 byte 
		// but all int are not char
		
//		// boolean 
//			boolean
		boolean h8 = false;
		System.out.println(h8);
		
	}
}
