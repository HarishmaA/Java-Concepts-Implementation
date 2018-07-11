package RealTimeInheritance;

import java.util.Scanner;

public class QuestionDemo {
	public static int presentQuestion(Question q, Scanner sc) {
		q.display();
		System.out.println("your answer:");
		String response = sc.nextLine();
		System.out.println(q.checkAnswer(response));
		if (q.checkAnswer(response))
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		Scanner sc = new Scanner(System.in);
		Question first = new Question();
		first.setText("Who was the inventor of Java?");
		first.setAnswer("James Gosling");
		score = score + presentQuestion(first, sc);
		NumericQuestion second = new NumericQuestion(0.01);
		second.setText("What is the length of the diagonal in a square whose have length 1?");
		second.setAnswer(Math.sqrt(2));
		score = score + presentQuestion(second, sc);

		System.out.println("Your total score is   " + score);

	}

}
