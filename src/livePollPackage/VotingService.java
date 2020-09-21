package livePollPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class VotingService {
	
	private Random r = new Random();
	private List<Question> questions;
	private List<Student> participants;
	final private String[] trueFalseAnswers = {"True", "False"};
	final private String[] multipleChoiceAnswers = {"A", "B", "C", "D"};
	
	private	HashMap<String, String> studentAnswers = new HashMap<String, String>();
	
	public VotingService() {
		questions = new ArrayList<Question>();
		participants = new ArrayList<Student>();
	}

	public void addParticipant(Student s) {
		participants.add(s);
	}
	
	public void addQuestion(Question q) {
		questions.add(q);
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public List<Student> getStudents() {
		return participants;
	}
	
	public void storeAnswers(String studentID, String studentAnswer) {
		studentAnswers.put(studentID, studentAnswer);
	}
	public void generateStudentAnswers(Question q) {
		if(q.isSingleAnswerQuestion()) {
			for(Student s : participants) {
				this.storeAnswers(s.getId(), trueFalseAnswers[r.nextInt(2)]);
			}
		}
		else {
			for(Student s : participants) {
				this.storeAnswers(s.getId(), multipleChoiceAnswers[r.nextInt(4)]);
			}
		}
	}
	public void getResults() {
		studentAnswers.forEach((k, v) -> {
			System.out.printf("Student %s answered: %s\n", k, v);
		});
	}
	public void printResultStatistics(Question q) {
		Collection<String> answers = studentAnswers.values();
		if(q.isMultipleChoiceQuestion()) 
			System.out.printf("Result Statistics: A : %d  B : %d\tC : %d\tD : %d\n", Collections.frequency(answers, "A"), Collections.frequency(answers, "B"), Collections.frequency(answers, "C"), Collections.frequency(answers, "D"));
		else 
			System.out.printf("Result Statistics: True : %d\tFalse : %d\n", Collections.frequency(answers, "True"), Collections.frequency(answers, "False"));
	}
}