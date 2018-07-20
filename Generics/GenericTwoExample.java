package Generics;

class Generics2<T, U> {
	T data1;
	U data2;

	Generics2(T element1, U element2) {
		this.data1 = element1;
		this.data2 = element2;
	}

	public void display() {
		System.out.println(this.data1.getClass().getSimpleName() + " " + this.data1);
		System.out.println(this.data2.getClass().getSimpleName() + " " + this.data2);
	}
}

public class GenericTwoExample {

	public static void main(String[] args) {
		Generics2<String, Double> obj1 = new Generics2<>("Apple", 12.00);
		obj1.display();
		Generics2<Integer, Character> obj2 = new Generics2<>(97, 'a');
		obj2.display();

	}

}
