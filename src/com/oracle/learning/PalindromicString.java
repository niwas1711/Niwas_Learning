package com.oracle.learning;

public class
PalindromicString {
  public static void main(String[] args) {
    //
    palindromicString("Too hot to hoot");
  }

  /*Write a program to check if a sentence is palindrome or not.
  You can ignore white spaces and other characters to consider the sentence as a palindrome.
  		                                                                                                                                             Example 1
  		Input : str = "Too hot to hoot"
  		Output : Sentence is Palindrome.

  Note: Candidate should not use JDK libraries (Collection/Collections/anything ready made like
  Collections.sort() etc)

  */

  public static void palindromicString(String str) {
    int len = str.length() - 1;
    boolean ispalindrom = true;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        i++;
      }
      if (str.charAt(len) == ' ') {
        len--;
      }

      if (  Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(len))) {
        ispalindrom = false;
        break;
      }

      len--;
    }
    if (ispalindrom) System.out.println("Sentence is Palindrome.");
    else
    {
      System.out.println("Sentence is Not Palindrome.");
    }
  }
}
