package com.oracle.learning;

import java.util.HashSet;

public class IntegerMissing
	{
  public static void main(String[] args) {
    //
int arr[] = {10,9,7,6,5,4,3,2};
	 missing(arr);

  }


  // [1,2,4,5,6,7,8,9]


		public static void missing (int arr[])
			{
				// +2
				HashSet<Integer> hs = new HashSet<>();
				for(int i=0;i<arr.length;i++)
				{
					hs.add(arr[i]);

				}

				for(int i=1;i<arr.length+2;i++)
				{
					if(hs.add(i))
					{
        System.out.println(i);
					}

				}



				/*Arrays.sort(arr);
				int lastelement=arr[arr.length-1];

    System.out.println(lastelement);
				int sum = (int) (lastelement*(lastelement+1))/2;
    System.out.println(sum);
				int arrsum=0;
				for(int i=0;i<=arr.length;i++)
				{
					arrsum =arrsum+arr[i];
				}

				res=sum-arrsum;
				if(res<0)
					return -1;
					else
				return res;*/
			}
	}
