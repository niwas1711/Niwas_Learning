package com.learning.dp;

import java.util.HashMap;

public class Coffetest {

  public static void main(String[] args) {
    /* //
    Scanner sc = new Scanner(System.in);
    int input=sc.nextInt();
    int b = sc.nextInt();

    String str="ddd";
    String [] sjj= str.split(",");
     System.out.println(b);
    int res=0;
    for(int i=0;i<input;i++)
    {
    	if(!(i%5 ==0 || i%7==0))
    		res +=i;
    }
     System.out.println(res);*/
    System.out.println(findans("tttdr.", "Trttd."));
  }

  public static boolean findans(String str1, String str2) {

    if (str1.length() != str2.length()) return false;

    HashMap<Character, Integer> map = new HashMap<>();

    char[] chars1 = str1.toCharArray();
    char[] chars2 = str2.toCharArray();

    for (char chars : chars1) {
      if (map.containsKey(chars)) {
        map.put(chars, map.get(chars) + 1);

      } else {
        map.put(chars, 1);
      }
    }
    System.out.println("map"+map);

    for (char chars : chars2) {
      if (map.containsKey(chars)) {
        map.put(chars, map.get(chars) - 1);

      } else {
        return false;
      }
    }
	  System.out.println("map"+map);
    return true;
  }
}
