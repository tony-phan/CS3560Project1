package livePollPackage;

public class MultipleChoiceQuestion extends Question {
	
	public MultipleChoiceQuestion(String question, String answer) {
		this.setQuestion(question);
		this.setAnswer(answer);

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
}
