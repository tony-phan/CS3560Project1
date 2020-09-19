package livePollPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VotingService {
	
	List<Question> questions;
	List<Student> participants;
	
	final char[] multipleChoiceAnswers = { 'A', 'B', 'C', 'D' };
	final String[] trueFalseAnswers = { "True", "False" };
	
	public VotingService() {
		questions = new ArrayList<Question>();
		participants = new ArrayList<Student>();
	}
	
	public void generateQuestionsAndParticipants() {
		for(int i = 0; i < 4; i++) {
			participants.add(new Student());
		}	
		
		questions.add(new MultipleChoiceQuestion("What year was I born?", "A"));
		questions.add(new MultipleChoiceQuestion("How many siblings do I have?", "D"));
		questions.add(new TrueFalseQuestion("I am 21 years old.", "True"));
		questions.add(new TrueFalseQuestion("I was born in Chicago.", "True"));
	}
	
	public void printResultStatistics(Question q) {
		
	}
	
	public void start() {
		for(Question q : questions) {
			if((q.getClass().toString()).equalsIgnoreCase("class livePollPackage.TrueFalseQuestion"))
				System.out.println("True/False Question: " + q.getQuestion());
			else
				System.out.println("Multiple Choice Question: " + q.getQuestion());
			
			System.out.println("The answer is: " + q.getAnswer());
		}
	}
}
