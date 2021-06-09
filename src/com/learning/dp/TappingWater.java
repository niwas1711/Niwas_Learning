package com.learning.dp;

public class TappingWater {

	static int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

	public static void main(String[] args)
		{
			int arr[] = { 0, 1, 0, 2, 1, 0, 1,
					3, 2, 1, 2, 1 };
			int n = arr.length;

			System.out.println("Maximum water that "
					                   + "can be accumulated is "
					                   + findWater(arr, n));
		}

	// Method for maximum amount of water
	static int findWater(int n)
		{
			// left[i] contains height of tallest bar to the
			// left of i'th bar including itself
			int left[] = new int[n];

			// Right [i] contains height of tallest bar to
			// the right of ith bar including itself
			int right[] = new int[n];

			// Initialize result
			int water = 0;

			// Fill left array
			left[0] = arr[0];
			for (int i = 1; i < n; i++)
				left[i] = Math.max(left[i - 1], arr[i]);

			// Fill right array
			right[n - 1] = arr[n - 1];
			for (int i = n - 2; i >= 0; i--)
				right[i] = Math.max(right[i + 1], arr[i]);

			// Calculate the accumulated water element by element
			// consider the amount of water on i'th bar, the
			// amount of water accumulated on this particular
			// bar will be equal to min(left[i], right[i]) - arr[i] .
			for (int i = 0; i < n; i++)
				water += Math.min(left[i], right[i]) - arr[i];

			return water;
		}


	static int maxWater(int[] arr, int n)
		{

			// indices to traverse the array
			int left = 0;
			int right = n - 1;

			// To store Left max and right max
			// for two pointers left and right
			int l_max = 0;
			int r_max = 0;

			// To store the total amount
			// of rain water trapped
			int result = 0;
			while (left <= right)
			{

				// We need check for minimum of left
				// and right max for each element
				if(r_max <= l_max)
				{

					// Add the difference between
					// current value and right max at index r
					result += Math.max(0, r_max-arr[right]);

					// Update right max
					r_max = Math.max(r_max, arr[right]);

					// Update right pointer
					right -= 1;
				}
				else
				{

					// Add the difference between
					// current value and left max at index l
					result += Math.max(0, l_max-arr[left]);

					// Update left max
					l_max = Math.max(l_max, arr[left]);

					// Update left pointer
					left += 1;
				}
			}
			return result;
		}


  static int findWater(int arr[], int n) {
    // initialize output
    int result = 0;

    // maximum element on left and right
    int left_max = 0, right_max = 0;

    // indices to traverse the array
    int lo = 0, hi = n - 1;

    while (lo <= hi) {
      if (arr[lo] < arr[hi]) {
        if (arr[lo] > left_max)

          // update max in left
          left_max = arr[lo];
        else

          // water on curr element =
          // max - curr
          result += left_max - arr[lo];
        lo++;
      } else {
        if (arr[hi] > right_max)

          // update right maximum
          right_max = arr[hi];
        else result += right_max - arr[hi];
        hi--;
      }
    }

    return result;
  }
		}