package com.oracle.learning;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlueJeans implements  test ,test2{
  /*write code to find the Minimum length substring with exactly K distinct characters
  Given a string S and a number K. Write code to find the minimum length substring having
  exactly K distinct characters.


  Examples:
  Input: S = "abdbca”, K = 3
  Output: abd

  Input: S="efecaefd", K = 4
  Output: feca

  Input: S="efecaefd", K = 5
  Output: caefd
  */

  public static void main(String[] args) {
    //
    findString("abdbca","",3);
    final ExecutorService executorService = Executors.newCachedThreadPool();
  }

  static void  findString(String str, String ans,int k) {
    HashSet e = new HashSet();
    e.add("dd");
    TreeMap<String, Integer> tm = new TreeMap<>();
    char ch[] = new char[26];
    if (ans.length() >= k) {
      System.out.println(ans);
      tm.put(ans, str.length());
    }

    for (int i = 0; i < str.length(); i++) {

      char temp = str.charAt(i);

      String remain= str.substring(0,i)+str.substring(i+1);
      if (ch[i] - 'a' != temp) {
        ch[i]=temp;
        findString(remain, temp + ans, k);
}

    }

  }


  @Override
  public void test()
    {

    }
}
interface  test
  {
    void test();

  }
  interface  test2
    {
      void  test();
    }