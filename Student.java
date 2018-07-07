//Creating an array of objects
public class Student {
	static String schoolName = "ABC";
	private String studentName;
	private int studentAge;
	private int studentRollNumber;

	Student(String studentName, int studentAge, int studentRollNumber) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentRollNumber = studentRollNumber;
	}

	// Elements of array are objects of a class Student
	public static void main(String[] args) {

		Student[] student = new Student[3];
		student[0] = new Student("Ram", 23, 1);
		student[1] = new Student("Sam", 24, 2);
		student[2] = new Student("Ram", 25, 3);
		// accessing the elements of the specified array
		for (Student stud : student) {
			System.out.println(
					schoolName + " " + stud.studentName + " " + stud.studentAge + " " + stud.studentRollNumber);
		}

	}

}
