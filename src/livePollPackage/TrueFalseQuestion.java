package livePollPackage;

public class TrueFalseQuestion extends Question {
	
	public TrueFalseQuestion(String question, String answer) {
		this.setQuestion(question);
		this.setAnswer(answer);
	}
	@Override
	public boolean isMultipleChoiceQuestion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSingleAnswerQuestion() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getAnswerChoices() {
		// TODO Auto-generated method stub
		return "\tTrue \tFalse";
	}
}
