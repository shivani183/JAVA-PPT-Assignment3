
//Q5Achieve loose coupling in java by using OOPs  concept?

package Practice;

class TestCoupling {

	void wiredCharger() {  //Overriden method
		System.out.println("'Charger ::'In wired charger respective mobiles can be charged only.");
	}

	void wirelessCharger() {
		System.out.println("'Charger ::'In wireless charger any mobile can be charged.");
	}
}

public class LooseCoupling extends TestCoupling {
	
	@Override
	void wiredCharger() {  //Overriding method
		System.out.println("'Company ::'In wired charger,mobiles of same company and series can be charged with one wired charger.");
	}
	
	public static void main(String[] args) {

		TestCoupling t1 = new LooseCoupling();   //Loose coupling where parent class variable refers to child class object.
		TestCoupling t2 = new TestCoupling();    //Tight coupling where child class variable refers to child class object.

		t1.wiredCharger();
		t1.wirelessCharger();
		t2.wiredCharger();

	}
}
