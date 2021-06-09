package com.learning.dp;

public class PartionProblem
	{
  public static void main(String[] args) {
	  //
	  int arr[] = { 3, 1, 5, 9, 12 };
	  int n = arr.length;
	  findPartition(arr,n);

  }

		public static int findMinRec(int arr[], int i,
				int sumCalculated,
				int sumTotal)
			{
				// If we have reached last element.
				// Sum of one subset is sumCalculated,
				// sum of other subset is sumTotal-
				// sumCalculated.  Return absolute
				// difference of two sums.
				if (i == 0)
					return Math.abs((sumTotal-sumCalculated) -
							                sumCalculated);


				// For every item arr[i], we have two choices
				// (1) We do not include it first set
				// (2) We include it in first set
				// We return minimum of two choices
				return Math.min(findMinRec(arr, i - 1, sumCalculated + arr[i-1], sumTotal),
						            findMinRec(arr, i-1, sumCalculated, sumTotal));
			}


		public static int findMin(int arr[], int n)
			{
				// Compute total sum of elements
				int sumTotal = 0;
				for (int i = 0; i < n; i++)
					sumTotal += arr[i];

				// Compute result using recursive function
				return findMinRec(arr, n, 0, sumTotal);
			}

		static boolean isSubsetSum(int arr[], int n, int sum)
			{
				// Base Cases
				if (sum == 0)
					return true;
				if (n == 0 && sum != 0)
					return false;

				// If last element is greater than sum, then ignore
				// it
				if (arr[n - 1] > sum)
					return isSubsetSum(arr, n - 1, sum);

        /* else, check if sum can be obtained by any of
           the following
        (a) including the last element
        (b) excluding the last element
        */
				return isSubsetSum(arr, n - 1, sum)
						       || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
			}

		// Returns true if arr[] can be partitioned in two
		// subsets of equal sum, otherwise false
		static boolean findPartition(int arr[], int n)
			{
				// Calculate sum of the elements in array
				int sum = 0;
				for (int i = 0; i < n; i++)
					sum += arr[i];

				// If sum is odd, there cannot be two subsets
				// with equal sum
				if (sum % 2 != 0)
					return false;

				// Find if there is subset with sum equal to half
				// of total sum
				return isSubsetSum(arr, n, sum / 2);
			}
	}
