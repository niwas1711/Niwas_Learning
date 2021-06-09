package com.oracle.learning;

public class ArrayDup
	{
		private ArrayDup()
			{

			}

		
		public static void main(String args[])
			{
				int arr[] = { 2,1, 4, 1, 2, 3,7,7};
				int arr_size = arr.length;
				printdup(arr);
				System.out.println("The repeating elements are: ");

				// Function call
		//		printRepeating(arr, arr_size);
				//printRepeatingnegative(arr,arr_size);
		}




		/*
<dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>

spring.datasource.url=jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=user12
spring.datasource.password=s$cret

       @Async("threadPoolTaskExecutor")
    public CompletableFuture < User > findUser(String user) throws InterruptedException {
        logger.info("Looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        User results = restTemplate.getForObject(url, User.class);
        // Artificial delay of 1s for demonstration purposes
        Thread.sleep(1000 L);
        return CompletableFuture.completedFuture(results);
    }


    @Bean("threadPoolTaskExecutor")
    public TaskExecutor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20);
        executor.setMaxPoolSize(1000);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setThreadNamePrefix("Async-");
        return executor;
    }

        */


		public static void printdup(int arr[])
			{//int arr[] = { 2,1, 4, 1, 2, 3,7,7};

				for(int i=0;i<arr.length;i++)
				{
     // System.out.println("-i-> "+arr[i]);
					for(int j=i+1;j<arr.length;j++)
					{
						//System.out.print(" j-> "+arr[j]);
           if (arr[i] == arr[j])
        	System.out.println(" ->dup"+arr[i]);
					}
				}
			}

		public static void printRepeatingnegative(int arr[], int size)
			{
				int i;
				System.out.println("The repeating elements are : ");

				for (i = 0; i < size; i++) {
					int j = Math.abs(arr[i]);
					if (arr[j] >= 0)
					{
						arr[j] = -arr[j];
						System.out.println(arr[j]);
					}

					else
						System.out.print(j + " ");
				}
			}
		// function to find repeating elements
		static void printRepeating(int arr[], int n)
			{
				// First check all the values that are
				// present in an array then go to that
				// values as indexes and increment by
				// the size of array
				for (int i = 0; i < n; i++)
				{
					int index = arr[i] % n;
					arr[index] += n;
				}

				// Now check which value exists more
				// than once by dividing with the size
				// of array
				for (int i = 0; i < n; i++)
				{ System.out.println("sssss"+arr[i]);
					if ((arr[i] / n) >= 2)
						System.out.println(i + " ");
				}
			}


	}



