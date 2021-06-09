package com.oracle.learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class AirTest
	{
  public static void main(String[] args) {
    //
	  findevenodd(379);
    System.out.println();
  }


	/*	I/p : NIWAS SHASHI
		O/p : SAWIN IHSAHS

	*/



	public void reverse(String str)
		{
			//  abcd
			/*Stack<Character> st = new Stack<>();
			String res="";
			  for(int i=0;i<str.length()-1;i++)
			  {
			  	st.push(str.charAt(i));

			  	if(str.charAt(i)==' ')
				  {
				  	res +=st.pop();
				  }
			  }*/
			String res="";
			char temp;
			for(int i=0;i<str.length()/2;i++)
			{
				 res += str.charAt(str.length()-1-i) ;
				 temp = str.charAt(i);
			/*	str.charAt(i) =  str.charAt(str.length()-1-i);

				str.charAt(str.length()-1-i)= temp;*/

			}
    System.out.println(res);
		}










	/*	[1,3,5,7] [2,4,6,8]    */

   // [1,3,5,7,2,4,6,8]

		public void merger(List<Integer>ll , List<Integer>secondlist)
			{
    // 1,3,5,7

			/*	10,20  30  10  40 /2  =20
				11 ,12       23 +1 =24 /2 =12


				23+ 1	=24/2 ==12
						*/
			//	((a+b)-math.abs(a-b))/2;

				//Iterator it = secondlist.iterator();

				for(int i=0;i<secondlist.size();i++)
				   {

				   	ll.add(secondlist.get(i));
				   }


			}

















/*Input:
		arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
		dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

		*/

  //Print even or odd for given number W/o using conditional statement
public static void findevenodd(int number)
	{
		HashMap<Integer ,String> hm = new HashMap<>();
		hm.put(0,"Even");
		hm.put(1,"odd");
		if(number%2==0)

		System.out.println(hm.get(number%2));



	}

	}
