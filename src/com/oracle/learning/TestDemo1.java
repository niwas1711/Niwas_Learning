package com.oracle.learning;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestDemo1 {

    public static void main(String[] args) {

        char arr[]={'a','b','b','c','c','c','d','e','e','e','f'};

        print(arr);
    }

    /*
    [a,b,b,c,c,c,d,e,e,e,f]
a - 1
b - 2
c- 3
d - 1
e- 3
f - 1
     */

  public static void print(char arr[])
  {
      Map<Character,Integer> map= new LinkedHashMap<>();

      for(int i=0;i< arr.length;i++)
      {
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }


      for(Map.Entry<Character,Integer> itr:map.entrySet())
      {
          System.out.println(itr.getKey()+"--"+itr.getValue());
      }

  }
}
