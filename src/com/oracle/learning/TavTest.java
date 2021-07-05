package com.oracle.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TavTest {
  public static void main(String[] args) {

    char t='c';
    System.out.println(t+1);
    System.out.println(t-1);
    char c=(char)100;
    System.out.println("ccc"+c);

    Integer.toString(Integer.parseInt(10+""),7);


    int[] arr1 = {1,97, 2, 3, 5};

    int[] arr2 = {1, 2, 3,767,3,4};

    // [1,2,3]
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    for(int i=0;i<arr1.length;i++)
    {
      for(int j=0;j<arr2.length;j++)
      {
        if (arr1[i] == arr2[j])
          System.out.println(arr1[i]);
      }
    }


    List<Integer> ll = commone(arr1, arr2);
  //  System.out.println(ll);
  }

  public static List<Integer> common(int arr[], int arr2[]) {
    List<Integer> ll = new ArrayList<>();

    HashSet<Integer> hs = new HashSet<>();

    if (arr.length > arr2.length) {


      for (int i = 0; i < arr.length; i++) {
        hs.add(arr[i]);
      }

      for (int i = 0; i < arr2.length; i++) {

        if (hs.contains(arr2[i])) {
          ll.add(arr2[i]);

        }
      }
    } else {
      for (int i = 0; i < arr2.length; i++) {
        hs.add(arr2[i]);
      }

      for (int i = 0; i < arr.length; i++) {

        if (hs.contains(arr[i])) {
          ll.add(arr[i]);
        }
      }


    }
	  return ll;
  }



  public static List<Integer> commone(int arr[], int arr2[]) {
    List<Integer> ll = new ArrayList<>();

    HashSet<Integer> hs = new HashSet<>();




      for (int i = 0; i < arr.length; i++) {
        hs.add(arr[i]);
      }
    System.out.println(hs);




    for (int i = 0; i < arr2.length; i++) {

      if (hs.contains(arr2[i])) {
        ll.add(arr2[i]);
      }
     }



    return ll;
  }
}





