package com.oracle.learning;

public class StockPrice {

    public static void main(String[] args) {
        // int arr[] ={100,90,120,95,120,80,100};

        // int arr[] ={100,90,80,70,60};

        int arr[] = {100, 150, 120, 200, 60};


       // System.out.println(maxprofit(arr));


        ////water_pipe == 10 feet
        //    // {2,4,6,5} ,-- 2 pipe

        int pipe[]={2,4,6,5};
        System.out.println(   mincut(pipe,10));
    }

    // arr[] ={100,90,120,95,120,80,100}
    //  90 -120=  30

    public static int maxprofit(int arr[]) {
        if (arr.length == 0) return 0;

        int result = 0;
        int least_price = arr[0];
        int max_price = 0;

        for (int i = 1; i < arr.length; i++) {
            least_price = Math.min(least_price, arr[i]);  // 90
            //System.out.println(least_price);

            max_price = arr[i] - least_price; //

            result = Math.max(result, max_price);
        }


        return result;
    }




    //water_pipe == 10 feet
    // {2,4,6,5} ,-- 2 pipe
    //  8 , 4   //

    public static  int mincut(int arr[],int pipe_length)
    {
//10 feet
        int numofpipes=1;
        int temp =pipe_length;


        for(int i=arr.length;i<arr.length;i++)
        {                                                       //9 ,8   0(N)

              /*  temp = temp-arr[i];       //-2  {1,3,6,8}  //  2 //   max num of sum below 10;

                                                //O(N)
                if(temp<0)
                {
                    temp =pipe_length-arr[i];
                    numofpipes++;
                }*/
            /*if (n <= 0)
                return 0;
            int max_val = Integer.MIN_VALUE;

            // Recursively cut the rod in different pieces and
            // compare different configurations
            for (int i = 0; i<n; i++)
                max_val = Math.max(max_val,
                        price[i] + cutRod(price, n-i-1));

            return max_val;*/

        }


        return numofpipes;
    }

}
