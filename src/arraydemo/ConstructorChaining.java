package arraydemo;

public class ConstructorChaining {
	public static void main(String[] args) {
		K3 k3 = new K3();
		
	}
	
}


class K1{
	K1(){
		System.out.println("K1. construtor");
	}
}

class K2 extends K1{
	K2(){
		System.out.println("K2. construtor");
	}
}

class K3 extends K2{
	K3(){
		System.out.println("K3. construtor");
	}
}
