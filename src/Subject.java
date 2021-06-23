public class Subject {
	int semester;
	String subjectName;
	Lecturer lecturers[];
	int credits;

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCredits() {
		return credits;
	}

	public void addLecturer(Lecturer l) {
		lecturers[lecturers.length] = l;
	}

	public int removeLecturer(int id) {
		int check = 0;
		for (int i = 0; i < lecturers.length; ++i) {

			if (lecturers[i].getLecturerId() == id) {
				check = 1;
				// remove element
				System.arraycopy(lecturers, i + 1, lecturers, i, lecturers.length - i - 1);
				break;
			}
		}
		return check;
	}

	public Subject(int semester, String name, int credits) {
		this.semester = semester;
		this.subjectName = name;
		this.credits = credits;

	}
}
