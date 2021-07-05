package com.oracle.learning;

public class MaxArrayProduct {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        System.out.println(productsum(arr));
    }


    public static  int productsum(int arr[])
    {
        if(arr.length==0) return 0;

        int max_so_far = arr[0];

        int min_so_far = arr[0];

        int result = max_so_far;

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

             max_so_far = Math.max(curr, Math.max(max_so_far * curr, min_so_far * curr));

            min_so_far = Math.min(curr, Math.min(max_so_far * curr, min_so_far * curr));



            result = Math.max(max_so_far, result);
        }

        return result;

    }
}
