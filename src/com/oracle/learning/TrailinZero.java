package com.oracle.learning;

public class TrailinZero
	{
  public static void main(String[] args) {
    //
	 int res= trailingZeroes(18);
    System.out.println(res);
  }

		public static int trailingZeroes(int n) {
			int count=0;
			for (int i = 5; n / i >= 1; i *= 5)
				count += n / i;

			return count;
		}
	}
