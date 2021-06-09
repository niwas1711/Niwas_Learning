package com.oracle.learning;


	 public class Student {
	int rollno;
	String name;
	static String college ="ITS";

	Student(int r,String n){
		rollno = r;
		name = n;
	}

	void display () {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String args[]){
		System.out.println(college);
		Student s = new Student(111,"Karan");
	//	Student s2 = new Student(222,"Arjun");
	//	s2.college="NOT";
  // Student.college="sss";
		s.display();
	}
}