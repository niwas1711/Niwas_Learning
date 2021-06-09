package com.oracle.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Emp
	{

		@Override
		public boolean equals(Object o)
			{
				if (this == o) {
					return true;
				}
				if (o == null || getClass() != o.getClass()) {
					return false;
				}
				Emp emp = (Emp) o;
				return id == emp.id && sal == emp.sal && Objects.equals(name, emp.name);
			}

		@Override
		public int hashCode()
			{
				return Objects.hash(id, name, sal);
			}

		@Override
		public String toString()
			{
				return "Emp{" +
						       "id=" + id +
						       ", name='" + name + '\'' +
						       ", sal=" + sal +
						       '}';
			}

		int id;
   String name;
   int sal;

		public int getId()
			{
				return id;
			}

		public void setId(int id)
			{
				this.id = id;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getSal()
			{
				return sal;
			}

		public void setSal(int sal)
			{
				this.sal = sal;
			}

  public static void main(String[] args) {
    //
	  Emp x= new Emp();
	  x.setId(1);
	  x.setSal(2000);
	  x.setName("n");

	  Emp x3= new Emp();
	  x3.setId(1);
	  x3.setSal(2000);
	  x3.setName("n3");

	  Emp x2= new Emp();
	  x2.setId(1);
	  x2.setSal(2000);
	  x2.setName("nz");


	  List<Emp> em = new ArrayList<>();
	  em.add(x);
	  em.add(x2);
	  em.add(x3);
   AtomicInteger i= new AtomicInteger();
	  em.forEach(item->{
		  System.out.println("Employee list"+(i.incrementAndGet()));
		  System.out.println(item.toString());

	  });

  }
	}
