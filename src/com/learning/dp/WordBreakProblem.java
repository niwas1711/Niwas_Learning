package com.learning.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakProblem
	{
		private static Set<String> dictionary = new HashSet<>();
  public static void main(String[] args) {
	  //
	  String temp_dictionary[] = {"mobile","samsung","sam","sung",
			  "man","mango","icecream","and",
			  "go","i","like","ice","cream"};

	  // loop to add all strings in dictionary set
	  List<String> dptest= new ArrayList<>();
	  for (String temp :temp_dictionary)
	  {
		  dictionary.add(temp);
		  dptest.add(temp);
	  }
	  System.out.println(wordBreak("iiiiiiii"));

    System.out.println(wordBreak("iiiiiiii",dptest));
  }



		public static boolean wordBreak(String word)
			{
				int size = word.length();

				// base case
				if (size == 0)
					return true;

				//else check for all words
				for (int i = 1; i <= size; i++)
				{
					// Now we will first divide the word into two parts ,
					// the prefix will have a length of i and check if it is
					// present in dictionary ,if yes then we will check for
					// suffix of length size-i recursively. if both prefix and
					// suffix are present the word is found in dictionary.

					if (dictionary.contains(word.substring(0,i)) &&
							    wordBreak(word.substring(i,size)))
						return true;
				}

				// if all cases failed then return false
				return false;
			}

		public static boolean wordBreak(String A, List<String> B )
			{
				//code here
				HashMap<String,Integer> hm = new HashMap<>();
				int max = Integer.MIN_VALUE;
				for(String s : B){
					hm.put(s,1);
					if(s.length()>max) max = s.length();
				}
				int n = A.length();
				boolean[] dp = new boolean[n+1];
				dp[n] = true;

				for(int i=n-1;i>=0;i--){
					StringBuilder st = new StringBuilder();
					for(int j=i;j<=(i + max);j++){
						if(j>=n) break;
						st.append(A.charAt(j));
						if(hm.containsKey(st.toString()) && dp[j+1]){
							dp[i] = true;
							break;
						}
					}
				}

				return dp[0];
			}

	}
