
//Q2. Write a Program where you inherit method from parent class and show method Overridden Concept?

package Practice;

class Charger {

	void wiredCharger() {  //Overriden method
		System.out.println("'Charger ::'In wired charger respective mobiles can be charged only.");
	}

	void wirelessCharger() {
		System.out.println("'Charger ::'In wireless charger any mobile can be charged.");
	}
}

public class Company extends Charger {
	
	@Override
	void wiredCharger() {  //Overriding method
		System.out.println("'Company ::'In wired charger,mobiles of same company and series can be charged with one wired charger.");
	}
	
	void amountOfCharger() {
		System.out.println("'Company ::'Amount of charger depends on the company.");
	}
	
	public static void main(String[] args) {

		Charger t1 = new Company();
		Charger t2 = new Charger();

		t1.wiredCharger();
		t1.wirelessCharger();
		t2.wiredCharger();
	}

}
