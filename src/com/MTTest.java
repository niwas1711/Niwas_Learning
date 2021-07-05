package com;

import java.util.Arrays;

public class MTTest {


    public static void main(String[] args) {
       // longsubString("aaaaa");
        int arr[] ={3,3,3,3,2,3,4,3,2};    //==6

        System.out.println(arr.length);

        findMajority(arr,arr.length);

        String str= "this is a the given String";

       String x= str.replaceAll("th","ht");

        System.out.println(x);


    }

    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

    /*
    /*

    str = ab c a b c b b;
    ans = abc   // bca

    st1= pwwkew
    ans=    kew
     */

    /*  HashSet s   a b c a b cbb;
    int start =0
    int end =0

    int start_end_index=
    int endIndex=0

    char [] map = new chr[26]

    Array.fill(map,1);


      if( map[charAt(i)-'a'] ==1 )             // a a a a a
          {                                         s e
              map[charAt(i)-'a'] =0
            end++;
          }
          else
          {
             start++;
             end++;
          }

      len =  end-start;

      if(len<(end-start))
      {
        max_len= len;   1
        start_end_index=start; 0
        endIndex=end; 1
      }


     */
/*
7-8-9

4-5-6


 1->2->4->5



 LstNode first_temp= first
 LstNode  second_temp = second;
 while(first_temp!=null || second_temp!=null)
 {
 first_temp= first_temp.next;

 int val = first_temp !=null? first_temp.data:0;
 int val2 = second_temp !=null? second_temp.data:0;

 int carry=0;

 int sum = val+val2+carry;

 carry= sum%10
 sum= sum/10;

LstNode node = new LstNode(sum);


 }



 */
  class LstNode
    {
        int data;
        LstNode next;

    }



    public  static void longsubString(String str)
    {

        int start =0;
        int end =0;
        int start_end_index=0;
        int endIndex=0;
        boolean [] map = new boolean[256];
        Arrays.fill(map,true);
        int max_len=0;
        int len = 0;


      while(end<str.length())
      {
          if(map[str.charAt(end)-'a'])
          {
              end++;
              map[str.charAt(end)-'a']=false;
             // System.out.println("sssss");
          }
          else
          {
              start++;
              end++;
          }

          len =  end - start;

          //System.out.println(start);
          //System.out.println(end);

          if(max_len<len)
          {
              max_len= len;
              start_end_index=start;
              endIndex=end;
          }


      }

        System.out.println("String is "+str.substring(start_end_index,endIndex));

        System.out.println("max len "+max_len);

    }


}
