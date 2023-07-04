
//Q3.Write a program to show run time polymorphism in java?

package Practice;

class Tree {
	int avgHiegth() {  //overriden method
		return 0;
	}
}

class ShortTree extends Tree {
	int avgHiegth() {
		return 15;
	}
}

class MediumTree extends Tree {
	int avgHiegth() {
		return 30;
	}
}

class LargeTree extends Tree {
	int avgHiegth() {  //overring method
		return 65;
	}
}

public class TestPolymorhism {

	public static void main(String[] args) {
		
		// At the run time jvm will check the type of object and evaluate the respective method.
		
		Tree t;
		t = new ShortTree(); // variables of parent class refers to subclass object.
		System.out.println("Average height of short trees is :: " + t.avgHiegth());  //subclass method overrides parent classmethod of avgHiegth(). 
		t = new MediumTree();
		System.out.println("Average height of medium trees is :: " + t.avgHiegth());
		t = new LargeTree();
		System.out.println("Average height of large trees is :: " + t.avgHiegth());

	}

}
