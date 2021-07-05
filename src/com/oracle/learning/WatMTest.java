package com.oracle.learning;

import java.util.TreeMap;
import java.util.concurrent.Semaphore;

public class WatMTest {


    public static void main(String[] args) {
        TreeMap <Integer,Integer> map = new TreeMap<>();


    }



}

  //  Semahpmse x = new Semaphore(6.);

/// LRU<10> --

// LFU<10> :r

/*
class myThreadpool
{
lock.lock()
synchornised(this)
{

}
lock.ulock

  int capacity  ;
  static int Running_Capacity;

   LinkedBlocking<Runnable> queue //or LinkedBlocking<Callable>
   List<customThread> e;

  myThreadpool(int capacity)
  {
  this. capacity =capacity;   //3

     queue = new queue
   for(int i=0;i<capacity;i++)
   {
      e= new customThread();
   }
  }

  public myThreadpool newfixedthreadpool(int capacity)
  {
    return new  myThreadpool(capacity);
  }

  public void submit(Runnable r)
  {   queue.add(r);
    if(Running_Capacity < myThreadpool.capacity)
    {

       e.execute();
}
  }



 }

customThread implements Runnablex
{


execute()
{
 myThreadpool.Running_Capacity ++;

}

@override
void run()
{
  while(true)
  {
     if(Running_Capacity < myThreadpool.capacity)
     {
         Runnable r = myThreadpool.queue.poll();

         Running_Capacity++;
         r.start();
     }
  }
}


}


 */




