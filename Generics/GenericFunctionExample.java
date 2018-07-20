package Generics;

class Generics
{
	//Generic Functions
	 static <T>void display(T element1)
	{
		System.out.println(element1.getClass().getName()+" "+element1);
	}
}

public class GenericFunctionExample {

	public static void main(String[] args) {
		Generics.display("Apple");

	}

}
