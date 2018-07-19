
//to check the given string is Palindrome or not
import java.util.Stack;

public class StackExample {
	public static boolean isPalindrome(String str) {
		String s = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		while (!stack.isEmpty())
			s += stack.pop();
		return s.equals(str);

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));

	}

}
