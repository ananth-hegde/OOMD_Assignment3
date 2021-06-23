
public class CollegeTest {

	public static void main(String args[]) {
		Student s1 = new Student(1,"Ananth Hegde",6);
		Student s2 = new Student(2,"Ankit Anand",6);
		Subject sub1 = new Subject(6,'OOMD',4);
		Subject sub2 = new Subject(6,'Computer Networks',4);
		Lecturer l1 = new Lecturer(1,"Yashoda S");
		Lecturer l2 = new Lecturer(2,"UP Kulkarni");
		Lecturer l3 = new Lecturer(3,"JV Vadavi");
		Lecturer l4 = new Lecturer(4,"SM Joshi");
		sub1.addLecturer(l1);
		sub1.addLecturer(l2);
		sub2.addLecturer(l3);
		sub2.addLecturer(l4);
		s1.addSubject(sub1);
		s1.addSubject(sub2);
		s2.addSubject(sub1);
		s2.addSubject(sub2);
		
	}
}
