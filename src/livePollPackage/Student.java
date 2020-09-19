package livePollPackage;
import java.util.UUID;
import java.util.Random;

public class Student {
	private Random r = new Random();
	
	private String id;
	private String answer; 
	private char[] multipleChoiceAnswers = {'A', 'B', 'C', 'D'};
	private String[] trueFalseAnswers = {"True", "False"};
		
	public Student() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public String getAnswer() {
		return answer;
	}
}
