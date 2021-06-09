package com.oracle.learning;

public class FunctionIntTest implements Funtest1 ,Funtest
	{

		@Override
		public int hashCode()
			{
				return super.hashCode();
			}

		public static void main(String[] args) {
    //
	/*  Funtest f =(int x)->5*5;
	  int ans = f.calcuate(5);
    System.out.println(ans);*/

	  Funtest f =()->System.out.println("hello");

	  f.hello();
    System.out.println( f.call(5));


  }


		@Override
		public void hello()
			{

			}

		@Override
		public void hellot()
			{

			}

		@Override
		public int call(int x)
			{
				return Funtest.super.call(x);
			}
	}

@FunctionalInterface
	interface  Funtest
		{
			//  int calcuate(int x);
       void hello();
			  default  int call(int x)
				  {
				  	return  x*x;

				  }

		}
@FunctionalInterface
interface  Funtest1
	{
		//  int calcuate(int x);
		void hellot();
		default  int call(int x)
			{
				return  x*x;

			}
	}