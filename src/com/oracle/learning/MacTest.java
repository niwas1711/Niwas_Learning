package com.oracle.learning;

import java.util.HashSet;

public class MacTest{
  public static void main(String[] args) {
    //
    int arr[] = {1, 3, 5, 7, 8};
    findsum(arr, 6);
  }
  // [1,3,5,7,8]  --> K =6

  //	(1,5)

  public static void findsum(int arr[], int k) {

    HashSet<Integer> set = new HashSet();
    boolean nopair = true;
    for (int i = 0; i < arr.length; i++) {
      int sum =k-arr[i] ;

      if (set.contains(sum)) {
        System.out.println("parir is " + sum + " ," + arr[i]);
        nopair = false;

      }
      else
      {
	      set.add(arr[i]);
      }
    }



    System.out.println(set);

    if (nopair) System.out.println("No pair found");
  }


}
