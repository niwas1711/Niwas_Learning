package com.learning.dp;

import java.util.HashMap;

public class AppVieTest {
  public static void main(String[] args) {
    //
    System.out.println(intToRoman(58));

    int[] arr = {1, 2, 4, 5, 6, 7, 9, 22, 34};
    int x =22;


  //  System.out.println(binaryserach(arr, arr.length - 1, 4));
    // binaryserach(arr,arr.length,6);

    System.out.println(binarySearch(arr,0,arr.length-1,x));




  }




	static  int binarySearch(int arr[], int left, int right, int x) {
		if (right >= left) {
			int mid = left + (right - left) / 2;
      System.out.println("mid"+mid);
			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, left, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, right, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}




  static String intToRoman(int num) {
    // storing roman values of digits from 0-9
    // when placed at different places
    String m[] = {"", "M", "MM", "MMM"};
    String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

    String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

    String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};



    // Converting to roman
    String thousands = m[num / 1000];
    String hundereds = c[(num % 1000) / 100];

    String tens = x[(num % 100) / 10];
    String ones = i[num % 10];

    String ans = thousands + hundereds + tens + ones;

    return ans;
  }

  public static void printnumber(int number) {

    HashMap<Integer, String> hm = new HashMap<>();
    hm.put(1, "I");
    hm.put(2, "II");
    hm.put(3, "III");
    hm.put(4, "IV");
    hm.put(5, "V");
    hm.put(6, "VI");
    hm.put(7, "VII");
    hm.put(1, "VIII");
    hm.put(9, "IX");
    hm.put(10, "X");
    hm.put(50, "L");
    String op = "";
    /*while(number>0)
    {
    	if(number-10<0)
    	{

    	}
    	int temp = number%10;
       System.out.println("te"+temp);
    	op=hm.get(temp);

       System.out.println("op--"+op);
    	number =number/10;

    }*/

    /*	10 Bottle has 10 balls each in which all ball weighted as 10grams

    One of the bottle has 11 grams weighted ball only

    Find the bottle which has 11gms weighted ball

    You are provided with digital weight machine*/
    /*
    1 - 1
     2-  2      1+2+3+4+5+6+7+8+9+10  == 100-55   5
    							                       10
     3	- 3		*/

    /*
    3 3 3 ,1
     1,
    2
    3		*/

  }

  // lilo-->

  static int binaryserach(int arr[], int size, int data) {
    return binarutil(arr, 0, size, data);
  }

  static int binarutil(int arr[], int start, int end, int data) {
    int mid = start + end / 2;
   if(start<end)
   {

    if (arr[mid] == data) return arr[mid];

    if (data < mid) return binarutil(arr, mid, end - 1, data);

    else {
      return binarutil(arr, 0, mid - 1, data);
      }
    }
      return -1;
    }



		}
