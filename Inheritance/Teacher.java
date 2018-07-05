package Inheritance;

/**
 * 
 ** The process by which one class acquires the properties(data members) and
 * functionalities(methods) of another class is called inheritance. The aim of
 * inheritance is to provide the reusability of code
 * 
 * @author User
 *
 */

public class Teacher {
	private String designation = "Teacher";
	private String collegeName = "Beginnersbook";

	public String getDesignation() {
		return designation;
	}

	protected void setDesignation(String designation) {
		this.designation = designation;
	}

	protected String getCollegeName() {
		return collegeName;
	}

	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	void does() {
		System.out.println("Teaching");
	}
}
