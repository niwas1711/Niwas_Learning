package com.oracle.learning;

import java.util.Stack;

public class QueueUsingStack {

  public static void main(String[] args) {
    //
    System.out.println(  palindrom("Niwas"));
	  System.out.println(  palindrom("abba"));
  }

  //  abba  --

  public  static  boolean palindrom(String str)
	  {
	  	boolean res=false;

	  	if(!(str.length()%2==0))
	  		return false;

	  	int mid = str.length()/2;
	  	char tem[]= new char[mid];


	    for(int i=0;i<mid;i++)
	    {
	    	tem[i]=str.charAt(i);

	    }
	  	int x=0;
	    for(int j=str.length()-1;j>mid;j--)
	    {
	    	System.out.println(tem[x]);
	    	if(tem[x]==str.charAt(j))
		    {

		    	res=true;
		    	x++;
		    }

	    	else
	    		return false;

	    }


	  return  res;

	  }

  //  FIFO  -- 1-2-3-4-5   /  1,2,3,4,5
  // LIFO  -- 1-2-3-4-5    /  5,4,3,2,1
  // 1-2-3-4
	static  Stack<Integer> st = new Stack<>();
	static  Stack<Integer> tempst = new Stack<>();

  public static void push(int i) {

		  st.push(i);                           // 1-2-3-4 //   4-3-2-1

	  tempst.push(st.peek());


  }

  public static void pop() {
   tempst.peek();
  }

  public static int peek() {
    return 1;
  }
}
