package arraydemo;

public class StringDmo1 {
public static void main(String[] args) {
	String st1= "Java";   // 1
	String str2 = "Java"; // 1
	
	String str3 = new String("Java"); // 3
	String str4 = new String("Java");
//	String str4 = new String("test"); //4
//	String str5 = new String("Pune"); //5
//	String str6 = new String("python"); //7
	str3 = str3.intern();
	
//	System.out.println(st1 == str2);
	System.out.println(st1 == str3);
//	System.out.println(str4 == str3);

//	System.out.println(st1.equals(str2));
//	System.out.println(st1.equals(str3));
//	System.out.println(str4.equals(str3));
	
	
}
}
