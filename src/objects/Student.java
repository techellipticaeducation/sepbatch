package objects;

public class Student {
	// Characteristics
	String name;
	int age;
	String classSection;
	University university;
	
	
	// Behaviour
	
	void tellmeYourAge() {
		System.out.println(name + " age is " + age);
	}
	
	void increaseAgebyOne() {
		age = age +1;
	}
	
	void tellMeYourAgeGroup() {
		if(age < 18) {
			System.out.println(name + " am a kid.");
		}else {
			System.out.println(name + " am adult");
		}
	}
	
	void tellmeYourstudySubject(){
		System.out.println("Hello I am studying in " + classSection);
	}
	
	void tellMeYourName() {
		System.out.println("My name is " + name);
	}	
}


class TestStudent{
	public static void main(String[] args) {
		University u1 = new University();
		u1.universityName = "SRM University";
		u1.address = "Chennai";
		u1.branch = "Tambaram";
		
		
		Student s1 = new Student();
		s1.name = "Student1";
		s1.age = 17;
		s1.classSection= "Science";
		s1.university = u1;
//		s1.tellMeYourName();
		
		Student s2 = new Student();
		s2.name = "Student2";
		s2.age  = 25;
		s2.classSection= "Arts";
		s2.university = u1;
//		s2.tellMeYourName();
		
//		s1.tellmeYourstudySubject();
		
		s1.tellmeYourAge();
		s1.tellMeYourAgeGroup();
		s1.increaseAgebyOne();
		s1.tellmeYourAge();
		s1.tellMeYourAgeGroup();
		
		s2.university.printUniversityName();
		
		
	}
}