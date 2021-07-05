package com.oracle.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromeMac {
    public static void main(String[] args) {
        System.out.println(findpali("racecar"));
int arr[] ={1,2,1};
  //      findmaxsumaa(arr);

        System.out.println(majorityElement(arr));

       String ans= compressString("abbbacd",7);
       // System.out.println(ans);

        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        skiplist(ll);
    }


    public static void skiplist(List<Integer> ll)
    {


        for(int i=0;i<ll.size()-2;)
        {
            i=i+2;
            System.out.println(ll.get(i));


        }
    }

    static String compressString(String s, int n)
    {  int MAX=26;
        // To store the frequency
        // of the characters
        int freq[] = new int[MAX] ;

        // Update the frequency array
        for (int i = 0; i < n; i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        String res="";
        // Print the frequency in alphatecial order
        for (int i = 0; i < MAX; i++)
        {

            // If the current alphabet doesn't
            // appear in the string
            if (freq[i] == 0)
                continue;

          // System.out.print((char)(i + 'a') +""+ freq[i]);
             res += (char)(i + 'a') +""+ freq[i];

        }
        return res;
    }


    //racecar

    public static boolean findpali(String  s)
    {
        String temp = s;
        String reverse= "";
        if(s.length()==0 || s==null) return true;
/*
        int i=0,j=s.length()-1;
        for(int k=j;k>=0;k--){
            reverse+= s.charAt(k);
        }
        System.out.println("reverse"+reverse);
        System.out.println("main string"+s);
        if(temp.equals(reverse)){
            return true;
        }else*/


return false;



    }

//{-1,2,3,0,-4,10,-15};

  // "abc " "cba"
  //  abc  abc
  //

    public static void findmaxsumaa(int arr[])
    {
        int sum=0;
        int start=0;
        int end=0;
     int maxsum=0;
       int currentstart=0;
        for(int i=0;i<arr.length;i++)
        {

            sum +=arr[i];
            currentstart=arr[start];
            if(sum < 0)
            {
                sum =0;

                start++;
            }
            else
            {
            maxsum =Math.max(maxsum,sum);
              //  System.out.println(su);
                end++;
            }


           // System.out.println("sum"+sum);
           // System.out.println("i"+i);
            //System.out.println("j"+j);


        }
        System.out.println("maxSum:-  "+maxsum);

        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+", ");
        }

       // System.out.println("end point :-- "+arr[start] "");
        //System.out.println("index"+arr[start]+"--"+arr[end]);
    }








    private static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        int m=nums.length/2;
       int res = -1;

    for(Map.Entry<Integer,Integer> hm : counts.entrySet())
    {
        if(hm.getValue()>m)
        {
            res=hm.getKey();
        }
    }


       return  res;
    }

}
