package livePollPackage;

public interface VotingInterface {
	
	public void generateStudentAnswers(Question q);
	public void storeAnswers(String studentID, String studentAnswer);
	public void getResults();
	public void printResultStatistics(Question q);
}
