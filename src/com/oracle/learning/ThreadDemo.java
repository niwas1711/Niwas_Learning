package com.oracle.learning;

public class ThreadDemo {

    public static void main(String[] args) {

        String res1="Niwas";
        String res2="Shashi";


        Thread t1= new Thread()
        {                                       //t1--res1--t2--res2
          public void run()
          {

              synchronized (res1)
              {
                  System.out.println(res2);
              }

          }

        };

        Thread t2= new Thread()
        {
            public void run()
            {
                synchronized (res1)
                {
                    System.out.println(res1);
                }

            }




        };


        t1.start();
        t2.start();
    }


}




