package com.oracle.learning;

import java.util.*;
import java.util.stream.Collectors;

public class MapValueSort {
    public static void main(String[] args) {

    }
    public String frequencySort(String s) {
        Map<Character,Integer> map= new HashMap<>();
StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(map.get(s.charAt(i)),0)+1);

        }
        List<Map.Entry<Character,Integer>> list= map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Character,Integer>::getValue).reversed().
                thenComparing(Map.Entry<Character,Integer>::getKey)).collect(Collectors.toList());



        List<Map.Entry<Character,Integer>> list1= map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Character,Integer>::getValue).reversed())
                .collect(Collectors.toList());


        int j=0;

        for(int i=0;i<list.size();i++)
        {
            while(list.get(i).getValue()<j)
            {
                sb.append(list.get(i).getKey());
                j++;
            }
            j=0;
        }

        return sb.toString();
    }


    public List<List<String>> groupStrings(String[] strings) {
        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strings.length;i++)
        {
            String key = getKey(strings[i]);

            if(!map.containsKey(key))
            {
                List<String> ll = new ArrayList<>();
                ll.add(strings[i]);
                map.put(key,ll);
            }else
            {
                List<String> ll1 = map.get(key);
                ll1.add(strings[i]);
                map.put(key,ll1);
            }
        }

        List<List<String>> res= new ArrayList<>();

        for(Map.Entry<String,List<String>> hm:map.entrySet())
        {
            res.add(hm.getValue());
        }

        return res;
    }

    public String getKey(String str)
    {
        String key="";

        for(int i=1;i<str.length();i++)
        {
            char prev=str.charAt(i);
            char next=str.charAt(i-1);
            int diff = next-prev;

            if(diff<0)
                diff +=26;

            key+=diff+"#";
        }
        key=".";
        return key;
    }
}
