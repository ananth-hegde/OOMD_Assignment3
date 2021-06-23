
public class Student {
	int id;
	String name;
	int semester;
	Subject[] subjects;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getSemester() {
		return semester;
	}

	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}

	public Subject[] getSubjects() {
		return subjects;
	}

	public void addSubject(Subject s) {
		this.subjects[this.subjects.length] = s;
	}

}
