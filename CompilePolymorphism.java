
//Q4.Write a program to show Compile time polymorphism in java?

package Practice;

public class CompilePolymorphism {

	static void dataTypeInJava(int a) {
		System.out.println(a+" is integer type");
	}
	static void dataTypeInJava(float a) {
		System.out.println(a+" is float type");
	}
	static void dataTypeInJava(String a) {
		System.out.println(a+" is String type");
	}
	static void dataTypeInJava(boolean a) {
		System.out.println(a+" is boolean type");
	}

	public static void main(String[] args) {
		
		// Compiler we resolve by checking the datatype of input parameter.
		
		dataTypeInJava(12);
		dataTypeInJava(12.43f);
		dataTypeInJava("I Love JAVA");
		dataTypeInJava(true);
		
		

	}

}
