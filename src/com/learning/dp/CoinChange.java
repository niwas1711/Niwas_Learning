package com.learning.dp;

import java.util.Arrays;

public class CoinChange
	{
  public static void main(String[] args) {
    //
	  int arr[] = {2};
//coins = [1,2,5], amount = 11
	  int n = 3;
	  System.out.println(leastCoinstop(arr, n));
  }



		public static int  leastCoinstop(int[] coins, int amount) {
			// This table will store the answer to our sub problems
			int[] dp = new int[amount + 1];

			// Initialize the dp table
			Arrays.fill(dp, amount + 1);

    /*
      The answer to making change with minimum coins for 0
      will always be 0 coins no matter what the coins we are
      given are
    */
			dp[0] = 0;

			// Solve every subproblem from 1 to amount
			for (int i = 1; i <= amount; i++) {
				// For each coin we are given
				for (int j = 0; j < coins.length; j++) {
					// If it is less than or equal to the sub problem amount
					if (coins[j] <= i) {
						// Try it. See if it gives us a more optimal solution
						dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
					}
				}
			}

    /*
      dp[amount] has our answer. If we do not have an answer then dp[amount]
      will be amount + 1 and hence dp[amount] > amount will be true. We then
      return -1.

      Otherwise, dp[amount] holds the answer
    */
			return dp[amount] > amount ? -1 : dp[amount];
		}



		public static int leastCoins(int[] coins, int amount) {
			if (amount < 1) {
				return 0;
			}

			return coinChange(coins, amount, new int[amount + 1]);
		}

		private static int coinChange(int[] coins, int remainder, int[] dp) {
    /*
      Minimum coins to make change for a negative amount is -1.
      This is just a base case we arbitrarily define.
    */
			if (remainder < 0) {
				return -1;
			}

    /*
      The minimum coins needed to make change for 0 is always 0
      coins no matter what coins we have.
    */
			if (remainder == 0) {
				return 0;
			}

			// We already have an answer cached. Return it.
			if (dp[remainder] != 0) {
				return dp[remainder];
			}

    /*
      No answer yet. Try each coin as the last coin in the change that
      we make for the amount
    */
			int minimum = Integer.MAX_VALUE;
			for (int coin: coins) {
				int changeResult = coinChange(coins, remainder - coin, dp);

      /*
        If making change was possible (changeResult >= 0) and
        the change result beats our present minimum, add one to
        that smallest value

        We accept that coin as the last coin in our change making
        sequence up to this point since it minimizes the coins we
        need
      */
				if (changeResult >= 0 && changeResult < minimum) {
					minimum = 1 + changeResult;
				}
			}

    /*
      If no answer is found (minimum == Integer.MAX_VALUE) then the
      sub problem answer is just arbitrarily made to be -1, otherwise
      the sub problem's answer is "minimum"
    */
			dp[remainder] = (minimum == Integer.MAX_VALUE) ? -1 : minimum;

			return dp[remainder];
		}
	}
