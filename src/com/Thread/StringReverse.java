package com.Thread;

import java.util.Locale;

public class StringReverse {

    public static void main(String[] args) {
     String s=   reversestr("This is the thread that given ","th");  //htis hte htread htat given
        //System.out.println(s);

        String res= s.toLowerCase().replace("th","ht");
        System.out.println();

  String ans= "Bob hit a ball, the hit BALL flew far after it was hit.";

  String arr[]= ans.split("\\b +,");
  for(int i=0;i<arr.length;i++)
  {
      System.out.println(arr[i]);
  }

    }

    public static  String reve2(String st1,String str2)
    {
        StringBuilder sb = new StringBuilder(str2);
        StringBuilder reverseStr = sb.reverse();
        String res = st1.replace(str2,reverseStr);


        return res;

    }



    public static String reversestr(String str1,String str2) // this is the thread that given // th
    {

      String  str_1=str1.toLowerCase(Locale.ROOT);
      String   str_2=str2.toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
   int i=0;
   int j = 0;
   int start =0;
   int end=0;
        String temp="";
        while(i<str1.length())
        {

             if(str_1.charAt(i)==str_2.charAt(j))
            {
                start=i;
                i++;
                j++;
                while( j<str_2.length() && str_1.charAt(i)==str_2.charAt(j))
                {
                   i++;j++;
                }

                if(j==str_2.length())
                {
                    end=i;

                    temp = reverse(str1.substring(start,end));
                    sb.append(temp);

                }else
                {
                    sb.append(str1.substring(start,i));

                }

             j=0;

            }
            sb.append(str1.charAt(i));

             i++;

        }



return sb.toString();

    }

    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverseStr = sb.reverse();

        return reverseStr.toString();
    }
}
