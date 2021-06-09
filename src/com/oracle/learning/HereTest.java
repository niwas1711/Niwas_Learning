package com.oracle.learning;

public class HereTest {

  public static void main(String[] args) {
    //
    /*Node head = new Node(10);
    	 head.next = new Node(20);
    	 head.next.next=new Node(30);
    	 head.next.next.next=new Node(40);
    */ try {
      HereTest ht = new HereTest();
      System.out.println(ht.add(1, 2, 3));
      System.out.println(ht.add(3, 3));

      A a = new A();
      System.out.println(a.add(111, 2));

      B b = new B();
      System.out.println(b.add(111, 2));
    } finally {

    }

    Node n = new Node(5);
    n.next = new Node(6);
    n.next.next = new Node(7);
    n.next.next.next = new Node(8);
    n.next.next.next.next = new Node(9);


    /*while (n != null) {
      System.out.print(n.data + "->");
      n = n.next;
    }*/


	  middle(n);
  }

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public static int middle(Node head) {

    Node slow_ptr = head;
    Node fast_ptr = head;



    if (head != null)
    {
      while (fast_ptr != null && fast_ptr.next != null)
      {
        fast_ptr = fast_ptr.next.next;
        slow_ptr = slow_ptr.next;
      }
      System.out.println("The middle element is [" +
                             slow_ptr.data + "] \n");
    }




    return 0;
  }

  public int add(int a, int b) {
    System.out.println("in two addd Method oveloaded ");
    return a + b;
  }

  public int add(int a, int b, int c) {
    System.out.println("in three add Method overloaded");
    return a + b + c;
  }
}

class A {

  public int add(int a, int b) {
    System.out.println("in two addd --overridingg");
    return a + b;
  }
}

class B extends A {
  public int add(int a, int b) {
    System.out.println("in two B subtract overriding ");
    return Math.abs(a - b);
  }
}
