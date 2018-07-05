package Polymorphism;

class Overload {
	void printArguments(int a) {
		System.out.println("a: " + a);
	}

	void printArguments(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
	}

	double printArguments(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}
}

class MethodOverloading {
	public static void main(String args[]) {
		Overload obj = new Overload();
		double result;
		obj.printArguments(10);
		obj.printArguments(10, 20);
		result = obj.printArguments(5.5);
		System.out.println("O/P : " + result);
	}
}