package org.student;

import org.department.Department;

//Assignment2:multilevel inheritance.

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Student name is Amudha");
	}
	
	public void studentDept()
	{
		System.out.println("student department computerscience");
	}
	
	public void studentId()
	{
		System.out.println("student id is 10001");
	}
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		
	}

}
