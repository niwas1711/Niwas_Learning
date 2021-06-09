package com.oracle.learning;

import java.util.LinkedHashMap;
import sun.security.util.Length;

public class Broadpalidrome {

  public static void main(String[] args) {
    //
    //findlargestString("abcdbadcbadbadcbadba");

	  findlargestString("abcdbadcbadbadcbadba");

  }
  // Given a linked list, swap every two adjacent nodes and return its head.
  // Input: head = [1,2,3,4,9,10,11]
  // --->
  // Output: [2,1,4,3,10,9,11]

  public static Node swap(Node head) {
    Node res = head;

    while (head != null) {
      res = head.next;
    }

    return res;
  }

  public static void findlargestString(String s) {
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length(); i++) {
      int len1 = findfrommiddle(s, i, i);
     // System.out.println(len1);
      int len2 = findfrommiddle(s, i, i + 1);
     // System.out.println(len2);
      int len = Math.max(len1, len2);
      if (len > (end - start)) {
        start = i - ((len - 1) / 2);
        end = i + (len / 2);
      }
    }
    System.out.println(s.substring(start, end + 1));
  }

  public static int findfrommiddle(String s, int left, int right) {

    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1;
  }


}
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    next = null;
  }
}
