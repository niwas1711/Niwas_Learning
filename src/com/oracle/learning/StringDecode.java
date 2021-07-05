package com.oracle.learning;

import java.util.Stack;

public class StringDecode {
    public static void main(String[] args) {
        System.out.println( decodeString("3[a]2[bc]"));
    }
    public static String decodeString(String s) {
        Stack<Character> char_stack = new Stack<>();
        Stack<Integer> number_stack  = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                number_stack.push(Character.getNumericValue( s.charAt(i)));
            }
            else if(s.charAt(i)=='[')
            {
                i++;

                char_stack.push(s.charAt(i));
            }
            else if(!char_stack.isEmpty() && !number_stack.isEmpty() && s.charAt(i)==']')
            {
                int peek=number_stack.peek();
                while(peek>0)
                {
                    sb.append(char_stack.peek());
                    peek--;
                }
                number_stack.pop();
                char_stack.pop();
            }

        }
        return sb.toString();
    }
}
