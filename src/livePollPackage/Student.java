package livePollPackage;

import java.util.UUID;

public class Student {
	
	final private String id;
	
	public Student() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
}
