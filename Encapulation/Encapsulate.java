package Encapulation;

//Java program to demonstrate encapsulation
public class Encapsulate {

	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String studentName;
	private int studentRoll;
	private int studentAge;

	// get method for age to access
	// private variable studentAge
	public int getAge() {
		return studentAge;
	}

	// get method for name to access
	// private variable studentName
	public String getName() {
		return studentName;
	}

	// get method for roll to access
	// private variable studentRoll
	public int getRoll() {
		return studentRoll;
	}

	// set method for age to access
	// private variable studentAge
	public void setAge(int newAge) {
		studentAge = newAge;
	}

	// set method for name to access
	// private variable studentName
	public void setName(String newName) {
		studentName = newName;
	}

	// set method for roll to access
	// private variable studentRoll
	public void setRoll(int newRoll) {
		studentRoll = newRoll;
	}
}
