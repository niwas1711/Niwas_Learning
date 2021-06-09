package com.Thread;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Ratelimit {
  //

  /*class RateLimiter{

  	-> Maximum Requests that a client can make -> 100
  			                                           -> Time Interval -> 60

  			boolean isAllowed(String clientId){
  				true / false

  			}
  */

  TimeUnit t;

  String ClientId;
  int request;
  long requestTime;
  int timeframe;
  // 300
  clientObj obj;
  // 1:04 -1:09 --100//
  // 1:09 -1:14 --
  HashMap<String, clientObj> hm;

  Ratelimit(int request, int trimeframe) {
    this.ClientId = ClientId;
    //
    this.timeframe = trimeframe;
    hm = new HashMap<>();
  }

  public static void main(String[] args) {
    //
    Ratelimit rt = new Ratelimit(100, 5);

    System.out.println(rt.isAllowed("a1"));
  }

  boolean isAllowed(String clientId) {
    {
      System.out.println(hm);

      hm.put(clientId, obj);

      if (hm.containsKey(clientId)) {
        clientObj res = hm.get(clientId);
        if (res.end < System.currentTimeMillis()) {
          if (res.request < 100) {
            res.request++;
          }

          return true;
        }
        return false;

      } else {
        obj = new clientObj();
        obj.request++;
        obj.Start = System.currentTimeMillis();
        obj.end = obj.Start + timeframe;
        return true;
      }
    }
  }
}

class clientObj {
  static int request;
  static long Start;
  static long end;
}
