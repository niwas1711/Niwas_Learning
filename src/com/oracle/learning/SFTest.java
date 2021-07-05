package com.oracle.learning;

import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class SFTest {

    public static void main(String[] args) {
        display(5);
        TreeSet<String> ts = new TreeSet<>();

        Stack<Integer> stack
                = new Stack<Integer>();

        // Use add() method
        // to add elements into the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.push(50);

        // Displaying the Stack
        System.out.println("Stack: " + stack);

        // Creating an iterator
        Iterator value = stack.iterator();

        // Displaying the values
        // after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }

    public static void display(int row)
    {
        int col=row;
        for(int i=row;i>0;i--)    // 5
        {
            for(int j=0;j<i;j++)     //4
            {
                System.out.print(" ");    // * * * * *


            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}

// new (""