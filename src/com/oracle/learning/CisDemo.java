package com.oracle.learning;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CisDemo implements Runnable
	{
		 Customer clevel;
		 int rate;
		CountDownLatch c ;
		CisDemo(Customer c,int rate,CountDownLatch c1)
			{
			this.clevel=c;
			this.rate=rate;
			this.c=c1;
			}
			static void test()
				{
    System.out.println("heelo");
				}
  public static void main(String[] args) throws InterruptedException
	  {
		  CisDemo cis = null;
		  cis.test();


	  CountDownLatch c1 = new CountDownLatch(2);
			Customer C=new Customer();
			int rate=10;
      C.setName("Niwas");
    	 //C.setInterest(10);
    	/* Thread t = new Thread(new CisDemo(C,rate,c1));
	     t.start();*/

     ExecutorService ex =Executors.newSingleThreadExecutor();
	    ex.execute(new CisDemo(C,100,c1));


	  Thread t2 = new Thread(new CisDemo(C,100,c1));
	  t2.start();

	  c1.await(100, TimeUnit.MILLISECONDS);
	  System.out.println("Customer"+ C.toString());
	  ex.shutdownNow();

  }




		@Override
		public void run()
			{
				clevel.UpdateService(rate);
				c.countDown();
			}

		//Banking -- Customer -- Processd -- MicroService -- UpdateInterest
		           //Total interest Rate
		// M1,M2,M3 -- 10%
		// Database --
		//CustomerObject - Intital rate 0%

		// HasMap<Customer,Integer> UpdateService(Customer Object, int interest)
	/*	{
			    Map<Custmoer, Ingter> interestrate= new ConcurrentHashMap<>();
			//interestrate()

		}*/


		// Main Thread-- pass CustomerObject -- other Thread --Update t


	}
class Customer
	{

		public  synchronized 	void UpdateService(int rate)
			{


					int newrate = interest + rate;
          interest = newrate;

			}
		@Override
		public String toString()
			{
				return "Customer{" +
						       "interest=" + interest +
						       ", Name='" + Name + '\'' +
						       '}';
			}

		public int getInterest()
			{
				return interest;
			}



		public String getName()
			{
				return Name;
			}

		public void setName(String name)
			{
				Name = name;
			}

		int interest;
		String Name;

	}