package abstractdemopac;

public class InterfaceDemo {
	public static void main(String[] args) {
		Bank bank = new HDFC();
		bank.homeLoanInterestRate();
	}
}
// all variable inside interface bydefault static and final
interface Bank{
	int i = 10;
	public int homeLoanInterestRate();
}


interface GlobalBank{
	int i = 20;
	public int homeLoanInterestRate();
}

class HDFC implements Bank,GlobalBank{
	public int homeLoanInterestRate() {
		System.out.println(Bank.i);
		return 10;
	}

}

class ICICI implements Bank{
	public int homeLoanInterestRate() {
		return 8;
	}

}
