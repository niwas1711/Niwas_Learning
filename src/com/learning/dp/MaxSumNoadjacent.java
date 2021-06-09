package com.learning.dp;

public class MaxSumNoadjacent
	{
  public static void main(String[] args) {
    //
	  int arr[] = new int[]{5, 5, 10, 100, 10, 5};
	  System.out.println(FindMaxSum(arr, arr.length));
  }


		public static int  FindMaxSum(int arr[], int n)
			{
				int incl = arr[0];
				int excl = 0;
				int excl_new;
				int i;

				for (i = 1; i < n; i++)
				{
					/* current max excluding i */
					excl_new = Math.max(incl , excl) ;

					/* current max including i */
					incl = excl + arr[i];
					excl = excl_new;
				}

				/* return max of incl and excl */
				return Math.max(incl , excl);
			}
	}
