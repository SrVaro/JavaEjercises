package control;

import java.util.ArrayList;

import data.Course;
import data.Professor;
import data.Student;

public class Test {

	public static void testStudents() {
		
		Course c1 = new Course("Primero B");
		
		Professor p = new Professor("Antonio");
		
		ArrayList<Student> students = new ArrayList<>();
		
		Student st1 = new Student("Alvaro");
		Student st2 = new Student("gfdjghk");
		Student st3 = new Student("dsfa");
		Student st4 = new Student("Alvafdgro");
		Student st5 = new Student("vx");
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		c1.setStudents(students);
		c1.setProf(p);
		
		System.out.println(c1);
		
		
	}

}
