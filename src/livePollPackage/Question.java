package livePollPackage;

abstract class Question {
	private String question;
	private String answer;

	public abstract boolean isMultipleChoiceQuestion();
	public abstract boolean isSingleAnswerQuestion();
	public abstract String getAnswerChoices();
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
