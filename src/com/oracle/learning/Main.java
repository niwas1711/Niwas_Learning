package com.oracle.learning;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
    // write your code here
    /*

      int res=m1("12345");
            System.out.println(res);
    */

    // int res =m2("(5+(10*2)+20)");

    //  System.out.println(absorbeTheValue());

    System.out.println(areBracketsBalanced("([])"));
    }


  static boolean areBracketsBalanced(String expr)
    {

      HashMap m = new HashMap();

      Deque<Character> stack
          = new ArrayDeque<Character>();

      // Traversing the Expression
      for (int i = 0; i < expr.length(); i++)
      {
        char x = expr.charAt(i);

        if (x == '(' || x == '[' || x == '{')
        {
          // Push the element in the stack
          stack.push(x);
          continue;
        }


        if (stack.isEmpty())
          return false;
        char check;
        switch (x) {
          case ')':
            check = stack.pop();
            if (check == '{' || check == '[')
              return false;
            break;

          case '}':
            check = stack.pop();
            if (check == '(' || check == '[')
              return false;
            break;

          case ']':
            check = stack.pop();
            if (check == '(' || check == '{')
              return false;
            break;
        }
      }


      return (stack.isEmpty());
    }

  static int absorbeTheValue() {
    try {
      // int x=99/0;
      System.out.println("noema;");
      return 99;
    } catch(Exception e) {
      System.out.println("i am her");
      return 45;
    }finally {
      return 34;
    }
  }


  static int  m1(String s1)
   {
       //text-- "1000"--1000
       //"1234"--1234

       double x=0;
 HashMap<Character ,Integer> hm = new HashMap<>();


       hm.put('0',0);
       hm.put('1',1);
       hm.put('2',2);
       hm.put('3',3);
       hm.put('4',4);
       hm.put('5',5);
       hm.put('6',6);
       hm.put('7',7);
       hm.put('8',8);
       hm.put('9',9);

  int temlength=s1.length()-1;

       int y=0;
       for(int i=0;i<s1.length();i++)    // 4
       {
           x=hm.get(s1.charAt(i));
           x= x*Math.pow(10,temlength);

           temlength--;
           y=(int)(y+x);

       }




return y;
   }


  static int m2(String s2)  //(5+((10*2)+20))
  {
      //(5+(10*2)+20)  --> 45
      //()
  int pos=0;

      Stack<Character> st=new Stack<>();
      for(int i=0;i<s2.length();i++)     // -( + ,* ,/)
      {
            if(s2.charAt(i)=='(')
            {
                pos=i;
            }

        if(s2.charAt(i)==')') {

            String temp = s2.substring(pos+1,i);
            for(int x=0;x<temp.length();x++)
            {
                if(!Character.isDigit(temp.charAt(x)))
                {
                  if(temp.charAt(x)=='*')
                  {

                  }
                  else if(temp.charAt(x)=='+')
                  {

                  }
                  else if(temp.charAt(x)=='-')
                  {

                  }
                  else if(temp.charAt(x)=='/')
                  {

                  }
                }
            }
            System.out.println(temp);
         }




      }



      return 0;
  }


  }



