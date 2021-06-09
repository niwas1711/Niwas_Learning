package com.oracle.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BasicQuestion
	{

  public static void main(String[] args) {
  	//

	  String s1="Random";
	  String s2= "RAndom";
    System.out.println(s1.contentEquals(s2));

    int arr[] = {1,23,45,6,6,2};
	 // printsubset(arr);
	  List<List<Integer>>  ll=  subsets(arr);

	//  ll.forEach(System.out::println);
  }


  public  static void printsubset(int arr[])
		{
			int allMasks = (1 << arr.length);
			for (int i = 1; i < allMasks; i++)
			{
				for (int j = 0; j < arr.length; j++)
					if ((i & (1 << j)) > 0) //The j-th element is used
						System.out.print((j + 1) + " ");

				System.out.println();
			}


		}

		public static List<List<Integer>> subsets(int[] nums) {
			List<List<Integer>> list = new ArrayList<>();
			subsetsHelper(list, new ArrayList<>(), nums, 0);

			AtomicInteger max= new AtomicInteger();
		/*	List<Competitor> maxListCompetitor = anotherListOfListCompetitor.stream()
					                                     .max(Comparator.comparingInt(l -> l.stream().mapToInt(Competitor::getPower).sum()))
					                                     .orElse(Collections.emptyList());*/

			list.forEach(item->{
				System.out.println("Employee list");
				max.set(Math.max(max.get(), item.stream().mapToInt(i -> i).sum()));

			});
    System.out.println("sum"+max.get());
			return list;
		}

		public	static void subsetsHelper(List<List<Integer>> list , List<Integer> resultList, int [] nums, int start){
			list.add(new ArrayList<>(resultList));
			for(int i = start; i < nums.length; i++){
				// add element
				resultList.add(nums[i]);
				// Explore
				subsetsHelper(list, resultList, nums, i + 1);
				// remove
				resultList.remove(resultList.size() - 1);
			}
		}


  public static void test(int e, int f, int t) {}
	}
