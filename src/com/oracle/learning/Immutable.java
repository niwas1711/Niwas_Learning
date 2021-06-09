package com.oracle.learning;

import java.util.Date;

public final class Immutable implements Comparable
	{
  final String name;
  final int age;
  final Date dob;

		public Immutable(String name, int age, Date dob)
			{
				this.name = name;
				this.age = age;
				this.dob = new Date(dob.getTime());
			}

		public String getName()
			{
				return name;
			}

		public int getAge()
			{
				return age;
			}

		public Date getDob()
			{
				return new Date(dob.getTime());
			}


		@Override
		public int compareTo(Object o)
			{
				return 0;
			}
	}
