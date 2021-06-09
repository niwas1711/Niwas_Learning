package com.oracle.learning;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
  static CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>();


    public static void main(String[] args) throws InterruptedException {

      HashMap<String ,String> hm = new HashMap<>();
      hm.put("abc","bcd");


///t1 ,t2

    Thread t1= new Thread()
    {
     public void  run()
      {
          for(int i=0;i<10;i++) {
              produce(i);
          }
      }

    };
        Thread t2= new Thread(() -> {
            for(int i=9;i>=0;i--) {
                consume(i);

            }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
 static synchronized void produce(int x)
{
    l.add(x);
    System.out.println(l);
}
static synchronized   void consume(int x)
    {
    // if(l.size()<0)
    //System.out.println("xxx"+x);
            l.remove(x);
    System.out.println("remove"+l);
    }


}

