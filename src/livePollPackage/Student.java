package livePollPackage;
import java.util.UUID;
import java.util.Random;

public class Student {
	
	private String id;
		
	public Student() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}
}
