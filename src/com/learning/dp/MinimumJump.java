package com.learning.dp;

public class MinimumJump
	{
  public static void main(String[] args) {
    //
	  int arr[] ={2,3,1,1,4};

    System.out.println(isjumpossible(arr));
  }


  public static boolean isjumpossible(int[] arr )
	  {
	  	int lastgoodindexpos = arr.length-1;
	  	for(int i=arr.length-1;i>=0;i--)
		  {
		  	if(i+arr[i]>=lastgoodindexpos)
			  {
			  	lastgoodindexpos=i;
			  }
		  }

	  return lastgoodindexpos==0;
	  }
	}
