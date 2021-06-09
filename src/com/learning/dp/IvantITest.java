package com.learning.dp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class IvantITest {

  public static void main(String[] args) {
    //
    int arr[] = {21, 25, 28, 35, 36, 39, 9, 15};
    // O(log(n));
    String str = "freedom";

    /*Comparator<Map.Entry<Character, Integer>> byMatchesWon =
      Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());
    final Comparator<Map.Entry<Character, Integer>> byTeamName =
      Comparator.comparing(Map.Entry::getKey);*/

    // Map<Character, Integer> hm = new HashMap(Comparator.comparing(Map.Entry::getValue,
    // Comparator.reverseOrder()));
    Map<Character, Integer> hm = new HashMap();
    /*for(int i=0;i<str.length();i++)
    {
    	if(hm.containsKey(str.charAt(i)))
    	{
    		hm.put(str.charAt(i),hm.get(hm.get(str.charAt(i)))+1);
    	}
    	else
    	{
    		hm.put(s/r.charAt(i),1);
    	}
    }/*
    	  Map java8TreeMapApproach =hm.entrySet().stream().sorted((Comparator<? super Entry<Character, Integer>>) Entry.<Integer, Integer>comparingByValue()
    		                              .thenComparing(Entry.comparingByKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    */

  }


  public static int findsmallest(int arr[]) {
    int arr11[] = {21, 25, 28, 35, 36, 39, 9, 15};

    return 0;
  }
}
