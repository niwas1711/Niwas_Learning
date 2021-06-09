package com.oracle.learning;

public class StaticTest
	{
    String name ;
    String roll;
		static String college ="ITS";

		StaticTest(String n,String r)
			{
				name=n;
				roll=r;
			}

  public static void main(String[] args) {
	  //
	  StaticTest st = new StaticTest("hell","to");
	  //StaticTest.college="dd";
	  st.college="jjj";
    System.out.println(college);
	  college="cccc";
	  System.out.println(college);

  }


		  void test_static()
		{
			System.out.println("testing");
			StaticTest test_static  = new StaticTest("111","Karan");
			//s.college;
			test_static.college="ddd";

		}
		public  static void ntest_static()
			{
				System.out.println("testing");
				StaticTest s5 = new StaticTest("eee","Karan");
				s5.college="niwas";
				s5.college="ddd";

			}
	}
