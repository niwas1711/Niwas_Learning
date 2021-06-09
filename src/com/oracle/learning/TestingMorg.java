package com.oracle.learning;

public class TestingMorg {
  static int i = 10;

  public static void main(String[] args) {
    //
    /*for(int i = 0;; i++) {
     System.out.println("Hello");
     break;
    }*/
    /*System.out.println(hello());
    hello();*/

  }

  public int hello() {
    i = 58;
    try {

      return 1;

    } catch (Exception e) {
      return 3;

    } finally {
      return 5;
    }
  }
}

	// String --- largest palidrome
// abaxyztenethcs   ---tenet
//
// Start =  0
// end=length-1
// ansstart=
// endstart=
// abc
/*

public static void Threadpool(Task t )
	{
		AtomicInteger a=new AtomicInteger(10);
		Thread t = new Thread();

		a.decrementAndGet();
		if(a.get()==0)
		{
			Queue q= new LinkedList();
			q.add(Tesk);
		}else
		{
			t.start(Teask);
		}


	}*/
