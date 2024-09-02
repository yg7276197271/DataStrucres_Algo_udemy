package SubSetSum_EqualTo_Target;

import java.util.Arrays;
import java.util.*;

public class Recursion {
	//We will be starting from last index of an array
	//At every step we have two options : take or Not take
	//If we take then reduce the target and index
	//If we do not take then reduce only index
	//Go till index 0
	
	static boolean subsetSumUtil(int ind, int target, int[] arr) { // If the target sum is achieved, return true
        if (target == 0)
            return true;

        // If we have considered all elements but haven't reached the target, return false
        if (ind == 0)
            return arr[0] == target;

        // Try not taking the current element
        boolean notTaken = subsetSumUtil(ind - 1, target, arr);

        // Try taking the current element if it doesn't exceed the target
        boolean taken = false;
        if (arr[ind] <= target)
            taken = subsetSumUtil(ind - 1, target - arr[ind], arr);

        // Store the result in the DP table and return whether either option was successful
        return notTaken || taken;
        }

	// Main function to check if there exists a subset with a given target sum
	static boolean subsetSumToK(int n, int k, int[] arr) {

		// Call the recursive helper function
		return subsetSumUtil(n - 1, k, arr);
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4 };
		int k = 4;
		int n = arr.length;

		// Check if there exists a subset with the given target sum
		if (subsetSumToK(n, k, arr))
			System.out.println("Subset with the given target found");
		else
			System.out.println("Subset with the given target not found");
	}

}
