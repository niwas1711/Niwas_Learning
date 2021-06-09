package com.oracle.learning;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ImmutableHashMapTest
	{
  public static void main(String[] args) {
    //
	  String S;
Date d = new Date(System.currentTimeMillis());
	  Immutable im = new Immutable("Niwas",20,d);
	  Immutable im1 = new Immutable("Niwas",20,d);
	  Immutable im2 = new Immutable("Niwas",20,d);
	  Immutable im3 = new Immutable("Niwas",20,d);

	  Comparator<Immutable> c = Comparator.comparing(Immutable::getAge);
	  HashMap<Immutable,String> hm = new HashMap<>();
	  TreeMap<Immutable,String> tm = new TreeMap<>(c);
	  TreeMap<Immutable,String> tm2 = new TreeMap<>();
	  tm2.put(im,"dd");


	  tm.put(im,"dd");

	  tm.put(im1,"test");
	  tm.put(im2,"test2");
	  tm.put(im3,"tets4");
hm.put(im,"ddd");
	  hm.put(im1,"test");
	  hm.put(im2,"test2");
	  hm.put(im3,"tets4");

    System.out.println("hasmap"+hm.size());

	  System.out.println("TreeMap"+tm.size());


	  HashMap<Integer,Integer> sortedMap= new HashMap<>();
	  sortedMap.put(1,3);
	  sortedMap.put(2,1);
	  sortedMap.put(43,9);
	  sortedMap.put(99,4);
	  sortedMap.put(5,6);

	  Map<Integer, Integer>   sorted = sortedMap .entrySet() .stream() .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
			                                   .collect(Collectors.toMap(Map.Entry::getKey,Entry::getValue,(o1, o2) -> o1,
					                                   ConcurrentHashMap::new));
	  //  .collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

	  Map<Integer, Integer> sorted1	   = sortedMap .entrySet() .stream() .sorted(Entry.comparingByKey())
				                                    .collect(Collectors.toMap(Map.Entry::getKey,Entry::getValue,(o1, o2) -> o1,
						                                    ConcurrentHashMap::new));

	  System.out.println(sorted);
	  System.out.println("----------");
	  System.out.println(sorted1);
  }

	}
