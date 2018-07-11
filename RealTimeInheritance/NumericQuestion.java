package RealTimeInheritance;

 
/**
 * A question with a numeric answer.
 */
public class NumericQuestion extends Question {
	private double answer;
	private double tolerance;
	// TODO: Provide any needed instance variables

	/**
	 * Constructs a numeric question.
	 * 
	 * @param aTolerance
	 *            the tolerance that is allowed when checking the answer. For
	 *            example, if tolerance is 0.01, then the response may be up to 0.01
	 *            away from the correct answer.
	 */
	public NumericQuestion(double aTolerance) {
		this.tolerance = aTolerance;
	}

	public void setAnswer(double number) {
		this.answer = number;
	}

	public boolean checkAnswer(String response) {
		Double res = Double.parseDouble(response);
		return (Math.abs(res - answer)) <= tolerance;
	}
}
