package data;

import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<Student> students;
	private Professor prof;

	public Course(String name) {
		super();
		this.name = name;
	}

	public Course(String name, ArrayList<Student> students, Professor prof) {
		super();
		this.name = name;
		this.students = students;
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", students=" + students.toString() + ", prof=" + prof.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

}
