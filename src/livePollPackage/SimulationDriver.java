package livePollPackage;

public class SimulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingService poll = new VotingService();
		System.out.println("Welcome to the live poll service!");
		
		// Randomly generate questions and students and add them to poll
		poll.generateQuestionsAndParticipants();
		poll.start();
		
		System.out.println("Polling service has ended!");
	}
}