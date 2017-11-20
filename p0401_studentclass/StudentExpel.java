package com.javalex.day4_1_studentclassgroup;
import java.util.ArrayList;

public class StudentExpel {
/*	
	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStuduent(String name, int age, int studentNum, String major) {
		expelStudents.add(new Student(name, age, studentNum, major));
	}
*/
	
	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStuduent(String name, int age, int studentNum, String major) {
		expelStudents.add(new Student(name, age, studentNum, major));
		System.out.println(name+ " 재적학생정보등록");
	}
	
}
