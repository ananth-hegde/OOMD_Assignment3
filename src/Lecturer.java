
public class Lecturer {
	int lecturerId;
	String name;

	public Lecturer(int id, String n) {
		this.name = n;
		this.lecturerId = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getLecturerId() {
		return lecturerId;
	}
}
