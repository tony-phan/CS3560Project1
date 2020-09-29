package livePollPackage;

import java.util.Random;

public class SimulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingService poll = new VotingService();
		System.out.println("Welcome to the live poll service!");
		
		// Randomly generate questions and students and add them to poll
		generateQuestionsAndParticipants(poll);
		for(Question q : poll.getQuestions()) {
			if(q.isSingleAnswerQuestion()) 
				System.out.print("True/False Question: " + q.getQuestion());
			else 
				System.out.print("Multiple Choice Question: " + q.getQuestion());
			
			//Generate student answers & store in voting service
			poll.generateStudentAnswers(q);
			System.out.println(q.getAnswerChoices());
			poll.getResults();
			System.out.println("The answer is " + q.getAnswer());
			poll.printResultStatistics(q);
			
			//Simulate a situation where a student makes multiple submissions
			poll.multipleAnswerSubmission(q);
			System.out.println("A student has made multiple submissions. The new data is: ");
			poll.getResults();
			poll.printResultStatistics(q);
			System.out.println();
		}
		System.out.println("The polling service has ended!");
	}
	
	private static void generateQuestionsAndParticipants(VotingService p) {	
		p.addQuestion(new MultipleChoiceQuestion("What year was I born?", "A", "1999", "2000", "2001", "2002"));
		p.addQuestion(new MultipleChoiceQuestion("How many siblings do I have?", "D", "1", "0", "2", "5"));
		p.addQuestion(new TrueFalseQuestion("I am 21 years old.", "True"));
		p.addQuestion(new TrueFalseQuestion("I was born in Chicago.", "True"));
		
		int numStudents = new Random().nextInt(20);
		for(int i = 0; i < numStudents; i++) {
			p.addParticipant(new Student());
		}
	}
}