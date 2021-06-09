package com.oracle.learning;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MutiThreadDemo implements Runnable
	{
   //countdownlatch --
		// 1. size--int value
		//2. await();
		int poolsize;
		Queue<ConnectionPool> poolQueue;
		MutiThreadDemo(int poolsize)
			{
				this.poolsize=poolsize;
				poolQueue	= new LinkedBlockingQueue<>(poolsize);
			}








		@Override
		public void run()
			{
				while(poolQueue.size()!=0)
				{

					poolQueue.poll();

				}

			}
	}


	//limit --10

  class ConnectionPool
	  {
	  	  private static volatile ConnectionPool connection=null;

	  	 private ConnectionPool()
			   {
			   	 if(connection==null)
			   	 	 throw new IllegalStateException("Refection not allowex");

			   }


			   public static ConnectionPool getIntance()
				   {
				   	   synchronized (ConnectionPool.class)
				       {
				       	 if(connection==null)
				         {
				         	 connection= new ConnectionPool();
				       	 	 return  connection;
				       	 	 }
				       	 else
				       	 	return connection;
				       }

				   }


	  }

















	/*class countdownlatch
		{
       int number;
		public countdownlatch(int numbeodlatch)
				{
					  this.number=numbeodlatch;
				}

				public void await()
					{

					}

		}*/