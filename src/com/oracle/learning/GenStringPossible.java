package com.oracle.learning;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class GenStringPossible {

  public static void main(String[] args) {
    //
    possible("abc", "");


    List l = new ArrayList<>();
	 /* Map<String, Long> collect =
			  (Map<String, Long>) l.stream().collect(groupingBy(Function.identity(), counting()));*/
  }

  public static void possible(String str, String temp) {

    if (str.length() == 0) {
      System.out.println(temp+" ");
    }
  boolean alpha[] = new boolean[26];

	  for (int i = 0; i < str.length(); i++) {

	  	char temporary = str.charAt(i);

      String temp1 = str.substring(0, i) + str.substring(i+1);
		  possible(temp1, temp + temporary);



	  if (alpha[temporary - 'a'] == false)
		    possible(temp1, temp + temporary);
	    alpha[temporary - 'a'] = true;

    }



  }
}
