package com.oracle.learning;

public class Student2 {
	int rollno;
	String name;
	static String college ="ITS";

	Student2(int r,String n){
		rollno = r;
		name = n;
	}

	void display () {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String args[]){
		System.out.println(college);
		Student2 s = new Student2(111,"Karan");
		s.display();
		Student2 s2 = new Student2(222,"Arjun");
		s2.college="Not";
		s.display();
		s.test_static();
		ntest_static();
	}
	public  void test_static()
		{
			System.out.println("testing");
			Student2 s = new Student2(111,"Karan");
				s.college="dsef";

		}
	public  static void ntest_static()
		{
			System.out.println("testing");
			Student2 s5 = new Student2(111,"Karan");
    //	s5.college;
    System.out.println(s5.college);
		}
}
