package com.oracle.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEnv
	{
  public static void main(String[] args) {
    //
	  int arr[] = {2, 8, 3, 10, 15, 19};
	  List Res= findtwo(arr);

    System.out.println(Res);
    TestEnv test11 = new TestEnv();
  // test11.show();
  }




//  [2, 8, 5, 10, 15, 19]   //smalldifference

		public  static List<Integer> findtwo(int arr[])
			{
    Arrays.sort(arr);

			 List res= new ArrayList();
					/* int smalldiff=Integer.MAX_VALUE;
          int temp=0;
				 for(int i=0;i<arr.length;i++)
				 {
				 	     for(int j=i;j<arr.length-1;j++)
				       {
					       temp= Math.abs(arr[i]-arr[j]);
					       System.out.println(smalldiff);
					       if(temp>smalldiff)
					       {
					       	res.clear();
					       	smalldiff=temp;
					       	res.add(arr[i]);
					       	res.add(arr[j]);
					       }


				       }


				 }*/

res.add(arr[0]);
				 res.add(arr[1]);

		return res;
			}

	}
