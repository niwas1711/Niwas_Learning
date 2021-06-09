package com.oracle.learning;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Morgtest {
  int i=0;
  static  int x=0;
  public static void main(String[] args) throws UnknownHostException
    {
    //

    InetAddress addr = InetAddress.getByName("100.111.149.45");
    String host = addr.getHostName();
    System.out.println(host);

    List<Integer> input = new ArrayList();
    input.add(5);
    input.add(4);
    input.add(3);
    input.add(2);
    input.add(1);
    /* input.add(4);
    input.add(3);
    input.add(5);
    input.add(1);
    input.add(2);

    */
 //   findindexview(input);
  }
public  void name()
  {
    x= x+1;
  }
  public static void findindexview(List<Integer> height) {
    ////i


    List<Integer> res = new ArrayList<>();
    int temp = 0;
    for (int i = 0; i < height.size(); i++) {
      for (int j = i + 1; j < height.size(); j++) {
        if (height.get(i) < height.get(j)) {
          temp++;
        }
      }
      if (temp == 0) {
        res.add(i);
      } else {
        temp = 0;
      }
    }
    // res.add(height.size() - 1);
    System.out.println(res);
  }
}
