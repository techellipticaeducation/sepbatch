package operators;

public class JumpStatement {

	
	public static void main(String[] args) {
		
		//  when my i == 7
		//  iteration
		// stop now. 
		for(int i =0 ;i< 10;i++) {
			if(i == 7) {
				continue;
			}
			System.out.println(i);
		}
		
		// continue - stop only for that iteration 
		
		//switch
		int monthNumber = -1;
		String monthName = "JAN";
		if(monthName.equals("Jan") || monthName.equals("January")) {
			monthNumber = 1;
		}
		else if(monthName.equals("Feb")) {
			monthNumber = 2;
		}
		else if(monthName.equals("Jan")) {
			monthNumber = 3;
		}
		else if(monthName.equals("Apr")) {
			monthNumber = 4;
		}
		System.out.println(monthName +" - "+monthNumber );
		
		switch(monthName) {
		case "Jan":
		case "January":
		case "JAN":
		case "JANUARY":
			monthNumber = 1;
			break;
		case "Feb": 
			monthNumber = 2;
			break;
		case "Mar": 
			monthNumber = 3;
			break;
		case "Apr": 
			monthNumber = 4;
			break;
		case "May": 
			monthNumber = 5;
			break;
		default:
			monthNumber = 90;
		}
		
		
		System.out.println(monthName+" - "+ monthNumber );
		
	}
}
