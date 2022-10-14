package operators;

public class StatementDemo {
	public static void main(String[] args) {


		// if , else, elseif
		
		// <18 = child, 18-30 - adult , 30-45 = mature , 45-60 = super mature, 60 - old
		// as soon as if else found its match. its come out from condition check 
		
		
		// block language 
		
		int age = 12;
		String ageGroup = "";
		
		if(age < 18) {
			ageGroup = "Child";
			System.out.println(ageGroup);
			if(age < 10) {
				ageGroup = "Kid";
				System.out.println("ML1");
			}else {
				ageGroup = "growing kid";
				System.out.println("ML2");
			}
			System.out.println(ageGroup);
		}else if(age >= 18 && age <=30){
			ageGroup = "adult";
		}else if (age >= 31 && age  <= 45) {
			ageGroup = "mature";
		}else if(age == 42) {
			ageGroup = "exceptional";
		}else if (age >= 46 && age  <= 60) {
			ageGroup = "super-mature";
		}else {
			ageGroup = "old";
		}
		
		
		//System.out.println(ageGroup);

		
		
	}
}
