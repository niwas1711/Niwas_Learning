package com.learning.dp;

public class Multiplywithout
	{
public static void main(String[] args){

	int product =minproduct(5,4);
    System.out.println(product);
}


	static int minproduct(int a ,int b)
		{
			int bigger = a<b?b:a;
			int smaller = a<b?a:b;
			int memo[] = new int[smaller+1];

			return  minproducthelper(smaller,bigger);
		}

		static int minproducthelper(int smaller ,int bigger)
			{
				if(smaller==0)
					return  0;
				else if(smaller==1)
					return bigger;
				int s= smaller>>1;
				int halfprod= minproducthelper(s,bigger);
				if(smaller%2==0)
					return halfprod+halfprod;
				else
					return halfprod+halfprod+bigger;


			}

		}
