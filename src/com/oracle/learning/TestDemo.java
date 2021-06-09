package com.oracle.learning;

import java.io.Serializable;

public class TestDemo {
  private static volatile TestDemo test = null;

  private TestDemo() throws Exception {
    if (test != null) throw new Exception("not able to create");
  }

  public static   TestDemo getIntance() throws Exception {

	   if (test == null) {
	   	synchronized(Thread.currentThread())
	    {
	    	if(test==null)
	    	test = new TestDemo();
		    return test;
	    }


	   } else {
		   return test;
	   }
   }


   class test1
	   {

	   }

	   class B extends test1
		   {

		   }

		   class c extends B implements  Serializable
			   {

			   }

  //--> // --> [1,2,3,4,-5,3,2,1]



	//   [1,2,3,4,1,2,3,4]

//	slow ,fast ,

//	[]

	//start end

}


//[0,1,1,0,0,0,1]

//BST -->





