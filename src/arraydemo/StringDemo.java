package arraydemo;

public class StringDemo {
public static void main(String[] args) {
	// methods in String
	
	String st1 = "this is java Object"; // String Literal way
	String st2 = new String("sessions");
	System.out.println(st2);
	
	
	// Length of string
	System.out.println(st1.length());
	System.out.println(st1.toUpperCase());
	System.out.println(st1.toLowerCase());
	
	System.out.println(st1.contains("java"));
	System.out.println(st1.contains("java1"));
	
	System.out.println(st1.charAt(2));
	System.out.println(st1.indexOf('i'));
	System.out.println(st1.indexOf("java"));
	System.out.println(st1.replace("i", "I"));
	System.out.println(st1.replace("java", "python"));
	
	System.out.println(st1.substring(4));
	System.out.println(st1.substring(4,8));
	
	String[] splitted = st1.split(" ");
	for(String split : splitted) {
		System.out.println(split);
	}
	
	System.out.println(st1.equalsIgnoreCase("this is java object"));
	System.out.println(st1.equals("this is java object"));
	
	
	
	
	
	
}
}
