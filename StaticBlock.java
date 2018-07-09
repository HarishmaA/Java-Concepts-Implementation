
public class StaticBlock {
	static String companyName;
	static {
		companyName = "ABC";
		System.out.println(companyName);
	}

	public static void main(String[] args) {
		System.out.println("The company name is written above");
	}
}
