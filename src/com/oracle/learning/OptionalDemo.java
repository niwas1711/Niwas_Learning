package com.oracle.learning;

import java.util.HashMap;
import java.util.Optional;

public class OptionalDemo
	{
  public static void main(String[] args) {
    //
	  hello hm = null;

	  HashMap hmww = new HashMap();

	  Optional<hello> hmtets = Optional.ofNullable(hm);
	  if(hmtets.isPresent())
	  {
      System.out.println("success");
	  }
	  else
	  {
      System.out.println("null pointer");
	  }

  }
	}


	class hello
		{
			String a;
			String b;
			String c;

			public String getA()
				{
					return a;
				}

			public void setA(String a)
				{
					this.a = a;
				}

			public String getB()
				{
					return b;
				}

			public void setB(String b)
				{
					this.b = b;
				}

			public String getC()
				{
					return c;
				}

			public void setC(String c)
				{
					this.c = c;
				}
		}