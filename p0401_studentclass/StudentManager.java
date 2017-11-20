package com.javalex.day4_1_studentclassgroup;
import java.util.ArrayList;

public class StudentManager {
	// 배열과 리스트, 제너릭 학습 필요
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		StudentManager managers = new StudentManager();
		
		managers.addStudent("홍길동", 22, 20170000, "연극");
		managers.addStudent("홍길순", 25, 2017444512, "수학");
		managers.addStudent("인어공주", 19, 20170012, "수영");
		
		System.out.println(managers.students.get(0).getName());
		System.out.println(managers.students.get(0).getAge());
		System.out.println(managers.students.get(0).getStudentNum());
		System.out.println(managers.students.get(0).getMajor());

		managers.students.get(0).updateInfo(1, "김길동");
		System.out.println(managers.students.get(0).getName());
		
		StudentExpel studentExManager = new StudentExpel();
		
		studentExManager.addExpelStuduent("개똥이", 19, 20170001, "개똥철학");
		
		System.out.println(studentExManager.expelStudents.get(0).getName());

	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
/*
		Student stu = new Student(name, age, studentNum, major);
		students.add(stu);
*/		
		students.add(new Student(name, age, studentNum, major));
		
		System.out.println(name+" 학생정보 입력성공 !");
	}
}
