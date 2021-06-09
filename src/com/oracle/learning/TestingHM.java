package com.oracle.learning;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestingHM
	{
  public static void main(String[] args) {
    //



	  String str = " the big black bug bit a big black dog on his big black nose";

	  List <String> list = Stream.of(str).map(w -> w.split("\\s")).flatMap(Arrays::stream)
			                       .collect(Collectors.toList());

	  Map <String, Integer > wordCounter = list.stream()
			                                       .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));


	  Map<String, Long> collect =
			  list.stream().collect(groupingBy(Function.identity(), counting()));
	  System.out.println(wordCounter);
	  Map<String, Integer> collect1 =
			  list.stream().collect(groupingBy(Function.identity(), summingInt(e -> 1)));


	  HashMap<String ,Integer> hm = new HashMap<>();



	  int spacecount=0;
	  for(int i =0;i<str.length();i++)
	  {

	  	if(str.charAt(i)==' ')
		  {
		  	if( hm.containsKey(str.substring(spacecount,i)))
			  {
			  	  hm.put(str.substring( spacecount,i),hm.get(str.substring(spacecount,i))+1);
			  }
		  	else
			  {
				  hm.put(str.substring( spacecount,i),1);
			  }
			  spacecount=i;
		  }

	  }

    for(Map.Entry x: hm.entrySet())
    {
      System.out.println(x.getKey()+" ---"+x.getValue());
    }

	  //demo.hello3();


  }



	}

	@FunctionalInterface
	interface  demo
		{
			void hello();
			default void hello2()
			{
    System.out.println("ddddd");
			}
			static  void hello3()
				{
    System.out.println("dmkjdhj");
				}
		}