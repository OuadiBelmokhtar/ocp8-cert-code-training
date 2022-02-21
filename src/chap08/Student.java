package chap08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Student {
	private String name;
	private int marks; // constructor and getters and setters not shown

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public void addMarks(int m) {
		this.marks += m;
	}

	public void debug() {
		System.out.println(name + ":" + marks);
	}

//	What will the following code print when compiled and run?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> slist = Arrays.asList(new Student("S1", 40), new Student("S2", 35), new Student("S3", 30));
		Consumer<Student> increaseMarks = s -> s.addMarks(10);
		slist.forEach(increaseMarks);
		slist.stream().forEach(Student::debug);
		
	}

}
