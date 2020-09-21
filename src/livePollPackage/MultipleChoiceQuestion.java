package livePollPackage;

public class MultipleChoiceQuestion extends Question {
	private String a = null;
	private String b = null;
	private String c = null;
	private String d = null;
	
	public MultipleChoiceQuestion(String question, String answer, String a, String b, String c, String d) {
		this.setQuestion(question);
		this.setAnswer(answer);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	@Override
	public boolean isMultipleChoiceQuestion() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isSingleAnswerQuestion() {
		// TODO Auto-generated method stub
		return false;
	}
	public String getAnswerChoices() {
		return String.format("\tA: %s\tB: %s\tC: %s\tD: %s" , a, b, c, d);
	}
}
